package StudyFund;

import java.util.*;

//The basic information for all actors
public class Person {

    // Name of the actor
    public String Name;

    // Contact Information of the actor
    public String[] Contact_info;

    // Default constructor
    public Person() {
        Name = "Unknown";
        Contact_info[0] = "Unavailable";
    }

    // Parameterised Constructor
    public Person(String name, String[] contact_info) {
        Name = name;
        Contact_info = contact_info;
    }

}