package cucumber.project.models;
import java.util.*;

/**
 * 
 */
public class Task {

    /**
     * Default constructor
     */
    public Task() {
    }
    public String Name;
    public String Status;
    public String StatusMsg;
    public String Description;
    public Project Project;
    public Developer Developer;
    public Set<Task> SubTasks;
    public Task Task;

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
    public String GetStatus() {
        // TODO implement here
        return Status;
    }

    /**
     * @param Status 
     * @return
     */
    public void SetStatus(String Status) {
        this.Status = Status;
       
    }

    /**
     * @return
     */
    public String GetStatusMsg() {
        // TODO implement here
        return StatusMsg;
    }

    /**
     * @param StatusMsg 
     * @return
     */
    public void SetStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
       
    }

    /**
     * @return
     */
    public String GetDescription() {
        // TODO implement here
        return Description;
    }

    /**
     * @param Description 
     * @return
     */
    public void SetDescription(String Description) {
        this.Description = Description;
       
    }

    /**
     * @return
     */
    public Set<Task> GetSubTasks() {
        // TODO implement here
        return SubTasks;
    }

    /**
     * @param SubTasks 
     * @return
     */
    public void SetSubTasks(Set<Task> SubTasks) {
        this.SubTasks = SubTasks;
     
    }

    /**
     * @return
     */
    public Developer GetDeveloper() {
        // TODO implement here
        return Developer;
    }

    /**
     * @param Developer 
     * @return
     */
    public void SetDeveloper(Developer Developer) {
        this.Developer = Developer;
        
    }
    
    public Project GetProject() {
        
        return Project;
    }


    public void SetProject(Project Project) {
        this.Project = Project;
      
    }
    
    public Task GetTask() {
        
        return Task;
    }


    public void SetTask(Task Task) {
        this.Task = Task;
      
    }

    /**
     * @return
     */
    public void ChangeStatus() {
        // TODO implement here
       
    }

}