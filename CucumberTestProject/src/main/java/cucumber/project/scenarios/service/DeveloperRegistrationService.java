package cucumber.project.scenarios.service;

import java.util.Collections;
import java.util.List;

import cucumber.project.models.Developer;

public class DeveloperRegistrationService {

	private static List<Developer> DevelopersDb = Collections.singletonList(new Developer("John",true));
	
	public static String Register(final String Name,final boolean isLead) {
		// TODO Auto-generated method stub
		boolean isUnique = DevelopersDb.stream().anyMatch(d->Name.equals(d.GetName()));
		return isUnique ? "User is already registered" : "Success";
	}
}
