// package Java_learnathon;

class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
