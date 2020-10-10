package Stack;

import Lists.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] emparray;
    private int elementCount;
    public ArrayStack(int capacity)
    {
        emparray=new Employee[capacity];
    }
    public ArrayStack()
    {
        emparray=new Employee[5];
    }
    public int size()
    {
        return elementCount;
    }

    public void push(Employee e)
    {
        if(elementCount==emparray.length)
        {
            Employee[] newArray=new Employee[emparray.length*2];
            System.arraycopy(emparray,0,newArray,0,emparray.length);
            emparray=newArray;
        }
        emparray[elementCount++]=e;
    }

    public Employee pop()
    {
        Employee returned;
        if(elementCount>=0)
        {
            returned=emparray[elementCount-1];
            elementCount--;
            emparray[elementCount]=null;

        }
        else
        {
            System.out.println("Stack is empty");
            return null;
        }
        return returned;
    }

    public Employee peek()
    {
        int peek=size();
        if(peek==0)
        {
            throw new EmptyStackException();
        }
        return emparray[peek-1];
    }

   public static void main(String[] args)
   {
       ArrayStack stack=new ArrayStack();
        stack.push(new Employee("Vishal","Yadav",34));
        System.out.println(stack.peek().toString());
        stack.push(new Employee("vipin","das",21));
        System.out.print(stack.pop().toString());
   }
}
