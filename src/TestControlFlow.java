import java.util.Scanner;
public class TestControlFlow {
    public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age>=18){
            System.out.println("yea you can drink");
        }else if(age < 10){
            System.out.println("Where's your parents out?");
        }else{
            System.out.println("Can't drink, bugger off");
        }
        input.close();
    }
}