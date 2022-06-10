import java.util.ArrayList;

public class Evens {
    public static void main(String[] args) {
        int[] numbers = {2,3,55,65,42,67};
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                evens.add(numbers[i]);
            }
        }
        System.out.println(evens);
    }
}
