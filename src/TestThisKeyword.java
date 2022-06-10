class MyClass1{
    int x; //declaration

    public int getX(){
        return this.x;
    }
}

public class TestThisKeyword {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        System.out.println(obj.x);
        System.out.println(obj.getX());
    }    
}