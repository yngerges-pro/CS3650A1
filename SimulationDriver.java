package AssignmentOne;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    
    String StudentID = ""; //Student's ID #
    int num = 0;           //num of students
    String Ids[] = {};     //Students' ID numbers
    char [] answer = {};   //correct answer
    int questionTy = 0;    //Type of question
    char[]StudentAns = {}; //Student's Answers
    int countA = 0;        //counts A's
    int countB = 0;        //counts B's
    int countC = 0;        //counts C's
    int countD = 0;        //counts D's
    
    
    //sets the number of students and their ID #s
    public SimulationDriver(){
        
        int i = 0;
        Random rand = new Random();
        int num = rand.nextInt(1,10); //randomly choose the number of students
        String Ids[] = new String [num];
      
        
        this.num = num; //sets the number of students
        
        while(i < num)
        { 
            int RandomID = rand.nextInt(100,1000); //reandomly chooses the ID numbers
            String Student = String.valueOf(RandomID);
            this.StudentID = Student;
            Ids[i] = Student;
            i++;
        }

        this.Ids = Ids;
    }
   

    //sents Ids
    public String[] sentID(){
        return Ids; //returns the Student's IDS
    }


    //returns student answer
    public char[] StudentAnswer(){
        return StudentAns;
    }

    public void chooseRandomAnswers(){
        if(this.questionTy == 1){
            char[] letters = {'A', 'B', 'C', 'D'};
            Random random = new Random();
        
            // Generate a random number between 1 and 3 (inclusive)
            int numLettersToChoose = 1;

            char[] StudentARR = new char[numLettersToChoose];
            
            //Randomly chooses letters
            for (int i = 0; i < numLettersToChoose; i++) {
                int randomIndex = random.nextInt(0,letters.length);//chooses a random index 
                char randomLetter = letters[randomIndex]; //chooses a random letter
                StudentARR[i] = randomLetter;
            }

            this.StudentAns = StudentARR;
        }else{

            char[] letters2 = {'A', 'B', 'C', 'D'};
            Random random2 = new Random();
        
            // Generate a random number between 1 and 3 (inclusive)
            int numLettersToChoose2 = random2.nextInt(3) + 1;

            char[] StudentARR2 = new char[numLettersToChoose2];
            
            //Randomly chooses one letter
            for (int i = 0; i < numLettersToChoose2; i++) {
                int randomIndex2 = random2.nextInt(letters2.length);//chooses a random index 
                char randomLetter2 = letters2[randomIndex2]; //chooses a random letter

               List<Character> studentList = new ArrayList<>();

                for (char c : StudentARR2) {
                    studentList.add(c);
                }

                if(studentList.contains(randomLetter2)) {//skips if student already choose that answer
                    continue;
                }else{
                StudentARR2[i] = randomLetter2;
                }
            }

            this.StudentAns = StudentARR2;
        }
    }
 

    //returns the question and decides on random answers
    public String getExactQuestion(int TYPES){
        Question type = new Question();
        String question1 = type.getquestion();
        String question2 = type.getquestion2();
        this.questionTy = TYPES;

        chooseRandomAnswers();

        if(TYPES == 1){
            return question1;
        }else{
            return question2;
        }
    }   

    //decides on the question type
    public void DecideQuestionType() {
        
        if(this.questionTy == 1){        //decides the question type based on a random number (1 or 2)
            char[] answer = {'C'};
            this.answer = answer;
        }
        else {
            //Students can choose more than one choices
            char[] answer = {'A', 'B', 'C'};
            this.answer = answer;
        }
    }
       
    
    //returns correct answer
    public char[] getAnswer(){
        DecideQuestionType(); 
        return this.answer;
    }

}


