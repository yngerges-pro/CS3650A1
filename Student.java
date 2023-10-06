package anotherpack;
public class Student {
    private String studentID;
    private String answer;

    // Constructor
    public Student(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void submitAnswer(String answer) {
        this.answer = answer;
    }

    public String getsubmitAnswer(){
        return answer;

    }
}



