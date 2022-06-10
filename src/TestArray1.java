public class TestArray1 {
    public static void main(String[] args) {
        for(int i=5; i<0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=0; i<7; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Top of tree
        for(int i=0; i<=5; i++){
            for(int j=5-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Bottom of tree
        for(int i=1; i<=2; i++){
            System.out.print(" ");
            for(int j=3; j>0; j--){
                System.out.print(" ");
            }
            for(int k=2; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
