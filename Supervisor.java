package StudyFund;

import Project;

/* 
    CHECK PROJECT STATUS
  
    Input & Output
        input  : project, department (optional)
        output : comments 
    Normal scenario
        case 1 : main supervisor
            checks progress of all department supervisors
        case 2 : department supervisors
            checks progress of the function of the particular department
        
        returns the project status
*/

public class Supervisor extends Implementor {
    public String department;

    public Supervisor() {
        // Default Constructor
    }
    
    // Main supervisor
    public String check_project_status(int pid) {
        if(stringCompare(pid.getProjectStatus(), "Done") == 0)
            return "Good Job!";
        else
            return "We can do this project guys!";
    }

    public void manage_budget() {
        // TODO implement here
    }

    public void provide_status() {
        // TODO implement here
    }

    public void manages_workflow() {
        // TODO implement here
    }

    public void submit_results() {
        // TODO implement here
    }
}
