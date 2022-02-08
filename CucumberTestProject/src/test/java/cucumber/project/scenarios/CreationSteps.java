package cucumber.project.scenarios;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.project.scenarios.model.DeveloperRegistrationScreenModel;
import cucumber.project.scenarios.model.ProjectCreationScreenModel;
import cucumber.project.scenarios.model.TaskCreationScreenModel;
import cucumber.project.scenarios.model.TaskModificationScreenModel;

public class CreationSteps {
	
	private ProjectCreationScreenModel CreateScreenModel;
	private DeveloperRegistrationScreenModel RegisterScreen;
	private TaskCreationScreenModel TaskCreationScreen;
	private TaskModificationScreenModel TaskModificationScreen;
	
	@Given("^User opens project creation screen$")
	public void OpenCreationScreen() throws Throwable {
		CreateScreenModel = new ProjectCreationScreenModel();
	}

	@When("^User enters a project name$")
	public void EnterProjectName() throws Throwable {
	    CreateScreenModel.setProjectName("Newspaper");
	}

	@When("^clicks the create button$")
	public void ClickCreateButton() throws Throwable {
	    CreateScreenModel.ClickCreateButton();
	}

	@Then("^Sees a success message$")
	public void SuccessMessage() throws Throwable {
	    assertEquals("Success",CreateScreenModel.SuccessMessage());
	}
	
	@When("^User enters a project name that is taken$")
	public void EnterTakenProjectName() throws Throwable {
		CreateScreenModel.setProjectName("Bakery");
	}

	@Then("^Sees a error message$")
	public void ErrorMessage() throws Throwable {
		assertEquals("Project Name is already used",CreateScreenModel.SuccessMessage());
	}
	
	@Given("^User opens the developer registration screen$")
	public void OpenDeveloperRegistrationScreen() throws Throwable {
		RegisterScreen = new DeveloperRegistrationScreenModel();
	}

	@When("^User enters the developer name$")
	public void EnterDeveloperName() throws Throwable {
	    RegisterScreen.setName("Mike");
	}

	@When("^User selects the developer's role$")
	public void SelectRole() throws Throwable {
	    RegisterScreen.setRole(true);
	}

	@When("^clicks the register button$")
	public void ClickRegisterButton() throws Throwable {
	    RegisterScreen.ClickRegisterButton();
	}

	@Then("^Sees a successful registration message$")
	public void RegisterMessage() throws Throwable {
	   assertEquals("Success",RegisterScreen.RegisterMessage());
	}
	
	@Given("^User opens the task creation screen$")
	public void OpenTaskCreationScreen() throws Throwable {
		TaskCreationScreen = new TaskCreationScreenModel();
	}

	@When("^User enters the task name$")
	public void EnterTaskName() throws Throwable {
	    TaskCreationScreen.setName("Bake a cake");
	}

	@When("^User selects a project$")
	public void SelectProject() throws Throwable {
		TaskCreationScreen.SetProjectName("Bakery");
	}

	@When("^User selects no developer$")
	public void ChooseNoDeveloper() throws Throwable {
		TaskCreationScreen.setDeveloper("");
	}

	@When("^Adds a description$")
	public void AddDescription() throws Throwable {
		TaskCreationScreen.setDescription("Make a cake mix and bake it");
	}

	@When("^clicks the create task button$")
	public void ClickCreateTask() throws Throwable {
		TaskCreationScreen.ClickTaskCreateButton();
	}

	@Then("^Sees a successful task creation message$")
	public void TaskCreationSuccessMessage() throws Throwable {
		assertEquals("Success",TaskCreationScreen.TaskMessage());
	}
	
	@Given("^User opens the task modification screen$")
	public void OpenTaskModificationScreen() throws Throwable {
		TaskModificationScreen = new TaskModificationScreenModel();
	}

	@When("^User selects the task name$")
	public void SelectTaskName() throws Throwable {
		TaskModificationScreen.setName("Bake a cake");
	}

	@When("^User selects a developer$")
	public void SelectDeveloper() throws Throwable {
		TaskModificationScreen.setDeveloper("John");
	}

	@When("^clicks the activate task button$")
	public void ClickActivateTask() throws Throwable {
		TaskModificationScreen.ClickTaskActivateButton();
	}

	@Then("^Sees a successful task activation message$")
	public void SuccessfullyModifyTask() throws Throwable {
		assertEquals("Success",TaskModificationScreen.TaskMessage());
	}

}
