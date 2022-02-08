package cucumber.project.scenarios.model;

import cucumber.project.scenarios.service.TaskModificationService;

public class TaskModificationScreenModel {

	String Name;
	String Developer;
	String Status;
	String Message;
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setDeveloper(String Developer)
	{
		this.Developer = Developer;
	}
	
	public void setStatus(String Status)
	{
		this.Status = Status;
	}
	
	public String TaskMessage()
	{
		return Message;
	}
	
	public void ClickTaskActivateButton()
	{
		if(TaskModificationService.CheckDeveloper(Developer))
		{
			Message = "Success";
		}
		else
		{
			Message = "Developer is not registered";
		}
	}
}
