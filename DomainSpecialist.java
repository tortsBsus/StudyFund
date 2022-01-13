package StudyFund;

import java.util.*;

/* 
    CREATE QUESTIONNAIRE

    Input & Output
        input  : project, questions, options
        output : array of questions
    Normal scenario
        checks if problem statement is aligning with domain_name
        enters the questions & answers
        stored in an array of objects
        array returned as output
    2 Exceptional scenario
        1) empty strings as input
        2) input length overflow
        3) number of questions overflow
        4) domain specialisation not aligning
*/

// For simplicity, 
// Questions will only be MCQ type
class Question {
    int q_no;
    String question;
    List<String> options;
}

public class DomainSpecialist extends Implementor {
    private List<Question> questions;
    private int QUESTIONS_LIMIT;
    private String domain_name;
    
    public DomainSpecialist() {
        QUESTIONS_LIMIT = 10;
        questions = new ArrayList<Question>();
    }

    List<Question> create_questionnaire(int pid, int n) {
        if(!checkDomainCompatability(domain_name, pid))
            throw new DomainIncompatible();

        if(n > QUESTIONS_LIMIT)
            throw new ArrayIndexOutOfBoundsException("Number of Questions Limit Exceeded");

        Question q;
        for(int i = 0; i < n; i++) {
            q = createQuestion();
            questions.add(q);
        }

        return questions;
    }

    public List<Question> submit_data() {
        return questions;
    }

    public void getDomainName(String s) {
        domain_name = s;
    }

    private Question createQuestion() {
        // Domain Specialists will have permissions to enter the question details
        Question q = new Question();
        return q;
    }

    private boolean checkDomainCompatability(String s, int pid) {
        // If project problem statement aligns with domain specialisation 
        // Requires manual checking / automated machine learning algorithms
        return true;
    }
}

class DomainIncompatible extends Exception {
    public String toString() {
        return("Domain of the project does not align with the Domain Specialist's specialisation");
    }
}
