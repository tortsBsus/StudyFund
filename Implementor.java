package StudyFund;

import java.util.*;

//
public class Implementor extends Person {

    // holds what the person should be paid
    public double Salary;
    // describes what the person does in the project
    public String Role;

    // default constructor
    public Implementor() {
        super();
        Salary = 0;
        Role = "undefined";
    }

    // parameterised
    public Implementor(String name, String[] contact_info, double salary, String role) {
        super(name, contact_info);
        Salary = salary;
        Role = role;
    }

}