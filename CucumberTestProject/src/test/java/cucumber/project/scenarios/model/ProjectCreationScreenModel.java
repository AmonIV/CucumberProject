package cucumber.project.scenarios.model;

import cucumber.project.scenarios.service.ProjectCreationService;

public class ProjectCreationScreenModel {

	String ProjectName;
	String Message;
	
	public void setProjectName(final String ProjectName) {
		
		this.ProjectName = ProjectName;
	}

	public void ClickCreateButton() {
		Message = ProjectCreationService.Create(ProjectName);
		
	}

	public String SuccessMessage() {
		return Message;
		
	}

}
