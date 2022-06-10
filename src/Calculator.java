public class Calculator {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        System.out.println(add(i, j));
        System.out.println(subtract(i, j));
        System.out.println(multiply(i, j));
        System.out.println(divide(i, j));
    }
    
    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static int subtract(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public static int multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public static float divide(int numberOne, int numberTwo){
        // to stop the default rounding down when dividing two integers
        return (float) numberOne / (float) numberTwo;
    }
}