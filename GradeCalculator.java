import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[]args){
    float score=getStudentScore();
        if (score>100){ //validate input
            System.out.println("Invalid input");
        }else if(score<0){
            System.out.println("Invalid input");
        }else{
            System.out.println(calculateGrade(score));
        }
    }
    public static float getStudentScore(){
        Scanner input = new Scanner(System.in); //input user
        System.out.print("Enter your score: ");
        float userInput=input.nextFloat();
        input.close();
        return userInput;
    }
    public static String calculateGrade(float score){
        if (score>=90){
            return ("Your grade is: A");
        }else if (score>=80){
            return ("Your grade is: B");
        }else if (score>=70){
            return ("Your grade is: C");
        }else if (score>=60){
            return ("Your grade is: D");
        }else{
            return ("Your grade is: F");
        }
        
    }
    

}