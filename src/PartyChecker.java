import java.util.Scanner;
import java.util.Random;
public class PartyChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine(); //skip the \n

        System.out.println("Are you coming in with someone (y/n): ");
        boolean isSingle;
        if(input.nextLine().toLowerCase() == "y"){
            isSingle = false;
        }else{
            isSingle = true;
        }
        
        int randomNumber = random.nextInt(1);
        boolean isWearingShoes;
        if(randomNumber == 1){
            isWearingShoes = true;
        }else{
            isWearingShoes = false;
        }

        if(age > 20 && !isSingle && isWearingShoes){
            System.out.println("Welcome to the party");
        }else{
            System.out.println("Get out of here");
        }
        input.close();
    }
}
