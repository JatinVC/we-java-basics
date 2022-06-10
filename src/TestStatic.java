// private, protected, public
// private is the object is only accessible within this file
// protected, only available to instansiated classes
// public, available to all files.

class MyClass{
    int x = 20;

    public int getX(){
        return x;
    }
}

public class TestStatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.getX());
    }
}