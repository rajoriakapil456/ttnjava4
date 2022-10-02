import java.util.*;

@FunctionalInterface
interface FunctionalInterface1 
{
    Boolean Greater(int a, int b);
}

@FunctionalInterface
interface FunctionalInterface2 
{
    int Incremnetby1(int a);
}

@FunctionalInterface
interface FunctionalInterface3 
{
    String Concatination(String a, String b);
}

@FunctionalInterface
interface FunctionalInterface4 
{
    String Uppercase(String a);
}


class Question_1 
{
    public static void main(String[] args) 
    {
        FunctionalInterface1 f = (int a, int b) -> a > b;
        FunctionalInterface2 f1 = (int a) -> a + 1;
        System.out.println(f.Greater(8, 10));
        System.out.println(f1.Incremnetby1(2));
        FunctionalInterface3 f3 = (String a, String b) -> a + b;
        System.out.println(f3.Concatination("Hi ", "Kapil"));
        FunctionalInterface4 f4 = (String a) -> a.toUpperCase();
        System.out.println(f4.Uppercase("Java is love"));
    }
}
