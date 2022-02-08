package cucumber.project.scenarios.service;

import java.util.Collections;
import java.util.List;

import cucumber.project.models.Project;

public class ProjectCreationService {

	private static List<Project> ProjectsDb = Collections.singletonList(new Project("Bakery"));
	
	public static String Create(final String projectName) {
		// TODO Auto-generated method stub
		boolean isUnique = ProjectsDb.stream().anyMatch(p->projectName.equals(p.GetName()));
		return isUnique ? "Project Name is already used" : "Success";
	}

}
