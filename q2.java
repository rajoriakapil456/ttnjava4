import java.util.*;
import java.util.function.BiFunction;
class Question_2 
{

    public int add(int a, int b) 
    {
        return a + b;
    }

    public int subtract(int a, int b) 
    {
        return b - a;
    }
    public static int multiply(int a, int b) 
    {
        return a*b;
    }

    public static void main(String[] args) 
    {
        Question_2 q = new Question_2();
        BiFunction<Integer,Integer,Integer> ad = q::add;
        System.out.println(ad.apply(10, 4));
        BiFunction<Integer,Integer,Integer> sub = q::subtract;
        System.out.println(sub.apply(9, 8));
        BiFunction<Integer,Integer,Integer> mul = Question_2::multiply;
        System.out.println(mul.apply(8, 8));
    }
}
