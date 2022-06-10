import java.util.ArrayList;

public class OddsAndEvens {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        // populating the array
        for(int i=1; i<51; i++){
            numbers[i-1] = i;
        }

        Object[] evens = getEvens(numbers);
        Object[] odds = getOdds(numbers);
        for(int i=0; i<evens.length; i++){
            System.out.print((int) evens[i]);
            System.out.print(",");
        }
        System.out.println();
        for(int i=0; i<odds.length; i++){
            System.out.print((int) odds[i]);
            System.out.print(",");
        }
    }
    public static Object[] getEvens(int[] numbers){
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                evens.add(numbers[i]);
            }
        }
        return evens.toArray();
    }

    public static Object[] getOdds(int[] numbers){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2!=0){
                odds.add(numbers[i]);
            }
        }
        return odds.toArray();
    }
}
