import java.util.Scanner;

public class SingleCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = input.nextInt();
        System.out.println("Please enter another number: ");
        int b = input.nextInt();
        System.out.println("Please enter a operation (+,-,*,/): ");
        input.nextLine(); // to skip the '\n' that the nextInt() doesn't read.
        String operator = input.nextLine();

        System.out.println(calculate(operator, a, b));
        input.close();
    }

    public static float calculate(String operator, int a, int b){
        switch(operator){
            case "+":
                return (float) a+b;
            case "-":
                return (float) a-b;
            case "*":
                return (float) a*b;
            case "/":
                return (float) a / (float) b;
            default:
                return 0.0f;
        }
    }
}