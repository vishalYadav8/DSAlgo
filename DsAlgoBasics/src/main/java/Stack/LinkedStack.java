package Stack;

import Lists.Employee;

import java.util.LinkedList;

public class LinkedStack {

    LinkedList<Employee> stackList;

    public LinkedStack() {
        stackList = new LinkedList<Employee>();
    }

    public void push(Employee e) {
        stackList.addFirst(e);
    }

    public Employee peek()
    {
        Employee e;
        e=stackList.getFirst();
        return e;
    }

    public Employee pop()
    {
        Employee e;
        e=stackList.remove();
        return e;
    }
    public void printStack()
    {
        stackList.iterator().forEachRemaining(System.out::println);
    }


    public static void main(String[] args)
    {
        LinkedStack stack=new LinkedStack();
        stack.push(new Employee("Vishal","Yadav",34));
        System.out.println(stack.peek().toString());
        stack.push(new Employee("vipin","das",21));
        System.out.println(stack.pop().toString());
        stack.printStack();
    }
}
