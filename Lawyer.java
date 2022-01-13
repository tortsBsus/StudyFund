
package StudyFund;

import java.util.*;

/**
 * Draft_Contracts
 * 
 * Input & Output
 * input: employees involved names, contact_info, terms and conditions,
 * output: contract
 * Normal Scenarios
 * 
 * Exceptional Scenarios
 */

// Describes the activities of the lawyer in StudyFund
public class Lawyer extends Implementor {

    // Default Constructor
    public Lawyer(String name, String[] contact_info, double salary, String role) {
        super(name, contact_info, salary, role);
    }

    //
    public void Draft_Contract() {
        // TODO implement here
        System.out.println(Name + " " + Contact_info[0] + " " + Salary + " " + Role);
    }

    //
    public void verify_funding() {
        // TODO implement here
    }

    //
    public void get_info() {
        // TODO implement here
    }

}