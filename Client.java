package StudyFund;

import java.util.*;

/* 
    PROVIDE FUNDING
        - needs the problem statement
        - needs the requirements list

    Input & Output
        input  : funding amount 
        output : status (project accpeted / rejected) 
                 depending on requirements & problem statement
    Normal scenario
        provides the funding amount
        requirements are checked wrt to the problem statement
        client gets a reply informing if the project can be accepted or not
    2 Exceptional scenario
        1) funding amount not specified
        1) problem statement not specified
        2) requirements not specified
*/

public class Client extends Person {
    private double funding_amount;
    private String problem_statement;
    private List<String> requirements;

    Client() {
        funding_amount = 0.0;
        requirements = new ArrayList<>();
    }

    // status 1 = project accepted
    // status 0 = project rejected
    public int give_funding(double funding_amount) {
        if(funding_amount > 0) {
            setFund(funding_amount);
        } else {
            throw new ArithmeticException("Please provide a valid fund amount");
        }

        if(problem_statement.length() == 0)
            throw new ProjectDetailsNotSpecified();

        if(requirements.size() == 0)
            throw new ProjectDetailsNotSpecified();

        if(checkCompatability()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void get_results() {
        // TODO implement here
    }

    public void check_progress() {
        // TODO implement here
    }
    
    public void setFund(double f) {
        funding_amount = f;
    }

    public void setProblemStatement(String s) {
        problem_statement = s;
    }

    public void setRequirements(List<String> l) {
        requirements = l;
    }

    private boolean checkCompatability() {
        // If problem statement requirements are available -> return TRUE
        return true;
    }
}

class ProjectDetailsNotSpecified extends Exception {
    public String toString() {
        return("Project doesn't have required details specified");
    }
}
