public class HelloMyWorld2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        add(i, j);
        subtract(i, j);
        multiply(i, j);
        divide(i, j);
    }
    
    public static void add(int numberOne, int numberTwo){
        System.out.println(numberOne + numberTwo);
    }

    public static void subtract(int numberOne, int numberTwo){
        System.out.println(numberOne + numberTwo);
    }

    public static void multiply(int numberOne, int numberTwo){
        System.out.println(numberOne + numberTwo);
    }

    public static void divide(int numberOne, int numberTwo){
        // to stop the default rounding down when dividing two integers
        System.out.println((float) numberOne / (float) numberTwo);
    }
}
