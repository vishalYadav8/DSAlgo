package Lists;

import java.util.Iterator;
import java.util.List;





public class ArrayList {

    public static void main(String[] args)
    {
        List<Employee> employeeList=new java.util.ArrayList<>();
        employeeList.add(new Employee("Vishal","Yadav",21));
        employeeList.add(new Employee("Vipin","Yadav",1));
        employeeList.add(new Employee("Tan","dar",22));

        employeeList.set(1,new Employee("vipu","yadav",1));
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.add(2,new Employee("tanis","gan",25));
        employeeList.forEach(System.out::println);
        System.out.println( employeeList.contains(new Employee("Tan","dar",22)));
        System.out.println(employeeList.remove(new Employee("Tan","dar",22)));
Iterator<Employee> i=employeeList.iterator();
i.forEachRemaining(System.out::println);

       /* String b="Hello";

        String a=b+"dsad";
        String c=b+"dsad";
        System.out.println(a.hashCode()==c.hashCode());*/
    }
}
