import java.util.*;
interface Interface_1 {
    default void display() {
        System.out.println("Interface1");
    }
}

interface Interface_2 {

    default void display() {
        System.out.println("Interface2");
    }
}

interface Interface_3 extends Interface_1, Interface_2 {
    default void display() {
        Interface_2.super.display();
        System.out.println("Interface3");
    }

}

class Question_5 implements Interface_3 {
    public void display() 
    {
        Interface_3.super.display();
        System.out.println("Default Class Method");
    }

    public static void main(String[] args) 
    {
        new Question_5().display();
    }
}
