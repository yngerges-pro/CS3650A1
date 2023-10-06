package anotherpack;
import java.util.HashMap;
import java.util.Map;

public class VotingService {
    private Question question;
    private Map<String, String> studentAnswers; // Map to store student answers

    // Constructor
    public VotingService(Question question) {
        this.question = question;
        this.studentAnswers = new HashMap<>();
    }

    public void submitAnswer(Student student, String answer) {
        // student's answer
        studentAnswers.put(student.getStudentID(), answer);
    }

    public void displayResults() {
        // candidate answers
        Map<String, Integer> answerCounts = new HashMap<>();
        for (String candidateAnswer : question.getCandidateAnswers()) {
            answerCounts.put(candidateAnswer, 0);
        }

        // Count student answers
        for (String studentID : studentAnswers.keySet()) {
            String studentAnswer = studentAnswers.get(studentID);
            answerCounts.put(studentAnswer, answerCounts.get(studentAnswer) + 1);
        }

        // Display results
        for (String candidateAnswer : question.getCandidateAnswers()) {
            int count = answerCounts.get(candidateAnswer);
            System.out.println(candidateAnswer + " : " + count);
        }
    }
}

