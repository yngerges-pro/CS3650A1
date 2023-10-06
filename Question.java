package anotherpack;
import java.util.List;

public class Question {
    private String questionType;
    private List<String> candidateAnswers;

    // Constructor
    public Question(String questionType, List<String> candidateAnswers) {
        this.questionType = questionType;
        this.candidateAnswers = candidateAnswers;
    }

    public String getQuestionType() {
        return questionType;
    }

    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }
}

