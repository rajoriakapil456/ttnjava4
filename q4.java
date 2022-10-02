import java.util.*;
import java.util.stream.Collectors;
class Employee 
{
    String Name;
    Long Salary;
    String City;

    Employee(String name, Long salary, String city) 
    {
        this.Name = name;
        this.Salary = salary;
        this.City = city;
    }

}

class Question_4 
{
    public static void main(String[] args) 
    {
        System.out.println(Arrays.asList(12, 1, 3, 15, 19, 67, 40).stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

        Employee emp1 = new Employee("Kapil Rajoria", 1000L, "Sirsa");
        Employee emp2 = new Employee("kapil Singh", 2000L, "Delhi");
        Employee emp3 = new Employee("Harshita Mishra", 4000L, "Raipur");
        Employee emp4 = new Employee("Saurabh vishwa", 3000L, "Delhi");
        List<Employee> li = new ArrayList<>();
        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        li.add(emp4);

        System.out.println(li.stream().filter(e -> (e.Salary < 5000) && (e.City.equals("Delhi"))).map(e -> (e.Name.split(" ")[0]+ " " +e.City +" "+ e.Salary)).collect(Collectors.toSet()));
    }
}
