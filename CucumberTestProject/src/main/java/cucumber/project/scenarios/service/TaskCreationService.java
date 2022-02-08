package cucumber.project.scenarios.service;

import java.util.Collections;
import java.util.List;

import cucumber.project.models.Project;

public class TaskCreationService {

	private static List<Project> ProjectsDb = Collections.singletonList(new Project("Bakery"));
	
	public static String CheckifProjectExists(final String projectName) {
		// TODO Auto-generated method stub
		boolean ProjectExists = ProjectsDb.stream().anyMatch(p->projectName.equals(p.GetName()));
		return ProjectExists ? "Success" : "Project doesn't exist";
	}
}
