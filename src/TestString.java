public class TestString {
    public static void main(String[] args) {
        String name = "Jatin";
        System.out.println(name.toLowerCase().equals("jatin"));
        System.out.println(name.charAt(2));
        System.out.println(name.substring(1, 3));
        System.out.println(name.concat(" Chandwaney"));
        String record = "1 , 2 , 3 , 4";
        String[] data = record.split("[,]");
        for(String d:data){
            System.out.println(d);
        }
    }
}