import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the students grade: ");
        int grade = input.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("A");
        }else if(grade>=80 && grade<=90){
            System.out.println("B");
        }else if(grade>=70 && grade<=80){
            System.out.println("C");
        }else{
            System.out.println("Failed");
        }
        input.close();
    }
}