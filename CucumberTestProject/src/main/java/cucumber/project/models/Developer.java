package cucumber.project.models;
import java.util.*;

/**
 * 
 */
public class Developer {

    /**
     * Default constructor
     */
    public Developer() {
    }
    public Developer(String Name, boolean isLead) {
		this.Name = Name;
		this.IsLead = isLead;
	}
	public String Name;
    public Boolean IsLead;
    public Project Project;
    public Set<Task> Tasks;

    /**
     * @return
     */
    public String GetName() {
        return Name;
    }

    /**
     * @param Name 
     * @return
     */
    public void SetName(String Name) {
        this.Name = Name;
      
    }

    /**
     * @return
     */
    public Boolean GetIsLead() {
        // TODO implement here
        return IsLead;
    }

    /**
     * @param LeadStatus 
     * @return
     */
    public void SetIsLead(Boolean LeadStatus) {
        this.IsLead = LeadStatus;
       
    }
    
    public Project GetProject() {
        // TODO implement here
        return Project;
    }

    public void SetProject(Project Project) {
        this.Project = Project;
       
    }
    
    public Set<Task> GetTasks() {
        // TODO implement here
        return Tasks;
    }


    public void SetTasks(Set<Task> Tasks) {
        this.Tasks = Tasks;
       
    }

}