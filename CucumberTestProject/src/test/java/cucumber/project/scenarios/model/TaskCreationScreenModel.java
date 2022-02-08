package cucumber.project.scenarios.model;

import cucumber.project.scenarios.service.TaskCreationService;

public class TaskCreationScreenModel {

	String Name;
	String Developer;
	String Status;
	String Description;
	String Message;
	String ProjectName;

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
	
	public void setDescription(String Description)
	{
		this.Description = Description;
	}
	
	public void SetProjectName(String Name)
	{
		this.ProjectName = Name;
	}
	
	public String TaskCreateMessage()
	{
		return Message;
	}
	
	public void ClickTaskCreateButton()
	{
		Message = TaskCreationService.CheckifProjectExists(ProjectName);
	}
	
	public String TaskMessage()
	{
		return Message;
	}
}
