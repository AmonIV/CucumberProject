package cucumber.project.models;
import java.util.*;

/**
 * 
 */
public class Project {

    /**
     * Default constructor
     */
    public Project() {
    }
    public Project(String ProjectName) {
		this.Name = ProjectName;
	}
	public String Name;
    public Set<Task> Tasks;
    public Set<Project> SubProjects;
    public Project Project;
    public Set<Developer> Participants;

    /**
     * @param Name 
     * @return
     */
    public void SetName(String Name) {
        this.Name = Name;
        
    }


    public String GetName() {
        return Name;
    }

    /**
     * @return
     */
    public Set<Task> GetTasks() {
        // TODO implement here
        return Tasks;
    }

    /**
     * @param Tasks 
     * @return
     */
    public void SetTasks(Set<Task> Tasks) {
        this.Tasks = Tasks;
        
    }

    /**
     * @return
     */
    public Set<Project> GetSubProjects() {
        // TODO implement here
        return SubProjects;
    }

    /**
     * @param SubProjects 
     * @return
     */
    public void SetSubProjcts(Set<Project> SubProjects) {
        this.SubProjects =SubProjects;
      
    }

    /**
     * @return
     */
    
    public void SetProject(Project Project) {
        this.Project = Project;
        
    }


    public Project GetProject() {
        return Project;
    }
    
    public Set<Developer> GetParticipants() {
        // TODO implement here
        return Participants;
    }

    /**
     * @param Participants 
     * @return
     */
    public void SetParticipants(Set<Developer> Participants) {
        this.Participants = Participants;
        
    }

}