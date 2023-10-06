package anotherpack;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        //question and configure the candidate answers
        List<String> candidateAnswers = new ArrayList<>();
        candidateAnswers.add("A");
        candidateAnswers.add("B");
        candidateAnswers.add("C");
        Question question = new Question("multiple-choice", candidateAnswers);

        //VotingService with the question
        VotingService votingService = new VotingService(question);

        // Simulates student submissions
        int numStudents = 10; // Adjust the number of students as needed
        Random random = new Random();

        for (int i = 1; i <= numStudents; i++) {
            String studentID = "Student" + i;
            String randomAnswer = candidateAnswers.get(random.nextInt(candidateAnswers.size()));

            Student student = new Student(studentID);
            student.submitAnswer(randomAnswer);

            // Submit the answer to the VotingService
            votingService.submitAnswer(student, randomAnswer);
        }

        // Display the results
        votingService.displayResults();
    }
}

