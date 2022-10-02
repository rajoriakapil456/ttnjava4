import java.util.*;
import java.util.function.BiFunction;
class Question_2 
{
    public static int add(int a, int b) 
    {
        return a + b;
    }

    public static int subtract(int a, int b) 
    {
        return b - a;
    }

    public static void main(String[] args) 
    {
        BiFunction<Integer, Integer, Integer> ad = Question_2::add;
        System.out.println(ad.apply(10, 4));
        BiFunction<Integer, Integer, Integer> sub = Question_2::subtract;
        System.out.println(sub.apply(9, 8));
    }
}
