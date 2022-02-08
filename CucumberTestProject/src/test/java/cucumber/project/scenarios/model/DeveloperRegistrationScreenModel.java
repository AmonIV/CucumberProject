package cucumber.project.scenarios.model;

import cucumber.project.scenarios.service.DeveloperRegistrationService;

public class DeveloperRegistrationScreenModel {

	String Name;
	Boolean Role;
	String Message;
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setRole(Boolean role)
	{
		this.Role = role;
	}
	
	public String RegisterMessage()
	{
		return Message;
	}
	
	public void ClickRegisterButton() {
		Message = DeveloperRegistrationService.Register(Name,Role);
		
	}
	
}
