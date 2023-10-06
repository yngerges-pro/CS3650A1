package AssignmentOne;

import java.util.Random;

public class VotingService {
    public static void main(String args[]) {
       
        SimulationDriver name = new SimulationDriver(); //object for SimulationDriver
        String Student_ID[] = name.sentID();
        
        System.out.print("Student's ID(s): ");
        for(int i = 0; i < Student_ID.length; i++) { 
        System.out.print(Student_ID[i] + " "); //prints the student IDS
        }
        System.out.println();
        Random typenum = new Random();
        int qtype = typenum.nextInt(1,3); //randomly chooses 1 or 2
        String questionType = name.getExactQuestion(qtype);

        System.out.println(questionType); //prints question

       
        for(int j = 0; j < Student_ID.length; j++){ //loops per student

            char[] Student_Answer = name.StudentAnswer(); //stored answers

            System.out.print("Student " + Student_ID[j] + " Answered: ");
            
            for(int k = 0; k < Student_Answer.length; k++){//loops per answer
                System.out.print(Student_Answer[k] + " ");
            }
            System.out.println();
            name.chooseRandomAnswers();
        }

        
        
    }
}
