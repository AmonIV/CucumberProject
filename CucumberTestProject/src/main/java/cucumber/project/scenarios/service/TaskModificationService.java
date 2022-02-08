package cucumber.project.scenarios.service;

import java.util.Collections;
import java.util.List;

import cucumber.project.models.Developer;

public class TaskModificationService {

	private static List<Developer> DevelopersDb = Collections.singletonList(new Developer("John",true));
	
	public static Boolean CheckDeveloper(final String Name) {
		// TODO Auto-generated method stub
		boolean isUnique = DevelopersDb.stream().anyMatch(d->Name.equals(d.GetName()));
		return isUnique;
	}
}
