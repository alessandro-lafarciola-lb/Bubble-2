import java.util.Scanner;

public class Exercice_2_1 {
    public static void main(String[] args){

        //Get the score
        System.out.println("Insert the score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the grade
        char grade;

        if(score < 60 ){
            grade = 'F';
        }
        else if(score <70){
            grade ='D';
        }
        else if (score <80){
            grade ='C';
        }
        else if(score<90){
            grade ='B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);

    }
}
