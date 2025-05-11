import java.util.ArrayList;
import java.util.Scanner;

class data{
    static String fullName;
    static int rollNo;
    static Scanner sc=new Scanner(System.in);

    public void getdata(){
        System.out.println("Enter your Name!");
        fullName=sc.nextLine();
        System.out.println("Enter your Roll Number!");
        rollNo=sc.nextInt();
    }
    public  void printdata(){
        System.out.println("||Report Card||");
        System.out.println("Name- "+fullName);
        System.out.println("Roll Number - "+rollNo);
    }
}
class questions{
    ArrayList<String> question1 =new ArrayList<>();
    void addQuestions(){
        question1.add("What is the default value of a boolean variable in Java?\n" +
                "1. True 2. False 3. Null 4. 0");
        question1.add("Which of the following is a valid data type in Java?\n" +
                "1. float64 2. int 3. string 4. boolean2");
        question1.add("What does OOP stand for  in Java?\n" +
                "1.  Object Oriented Programming 2. Object Operated Programming 3.  Operational Object Programming 4. None of the above");
        question1.add("Which method is used to find the length of an array in Java?\n" +
                "1. length() 2. getlength() 3. size() 4. length");
        question1.add("Which keyword is used to inherit a class in Java?\n" +
                "1. implements 2. inherits 3. super 4. extends");
    }
}
class answers {
    int score;
    int[] correctAnswer = {2, 2, 1, 4, 4};
    ArrayList<Integer> answer1 = new ArrayList<>();

    public void addAnswer1(int ans) {
        answer1.add(ans);
    }

    void checkAnswer() {
        for (int i = 0; i < 5; i++) {
            if (answer1.get(i) == correctAnswer[i]) score++;
        }
        if (score < 3) System.out.println("Sorry! You Failed!  Try again :(");
        else System.out.println("Congratulations! :) You Passed with score " + score+" out of 5");
    }
}
    public class quizApp1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            data data = new data();
            questions question = new questions();
            answers answer = new answers();

            data.getdata();

            question.addQuestions();
            for (int i = 0; i < 5; i++) {
                System.out.println(question.question1.get(i));
                int ans = sc.nextInt();
                answer.addAnswer1(ans);
            }
            data.printdata();
            answer.checkAnswer();
            System.out.println("*MADE BY @SHRAVANPUSDEKAR*");
        }
    }
