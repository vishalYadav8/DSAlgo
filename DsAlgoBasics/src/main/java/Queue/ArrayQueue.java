package Queue;

import Lists.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    Employee[] queue;
    int front;
    int back;

    public ArrayQueue(int capacity)
    {
        this.queue=new Employee[capacity];
    }

    public ArrayQueue()
    {
        this.queue=new Employee[5];
    }

    public void add(Employee e)
    {
        //check if queue is already full ,if full,increase size
        if (size()==queue.length-1)
        {
            int numItems=size();
            Employee[] newArray=new Employee[2*queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue=newArray;
            front=0;
            back=numItems;
        }
        queue[back] = e;
        if(back<queue.length-1)
        {
            back++;
        }
        else
        {
            back=0;
        }
    }

    public Employee remove()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
       Employee frontEmp=queue[front];
        queue[front]=null;
       front++;
        if(size()==0)
        {
            front=0;
            back=0;
        }
        else if(front==queue.length)
        {
            front=0;
        }

        return frontEmp;
    }

    public Employee peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public void printQueue()
    {
        if(back>=front)
        {
            for(int i=front;i<back;i++)
            {
                System.out.println(queue[i]);
            }
        }
        else
        {
            for(int i=front;i<queue.length;i++)
            {
                System.out.println(queue[i]);
            }
            for(int i=0;i<back;i++)
            {
                System.out.println(queue[i]);
            }
        }
    }
    public Boolean isEmpty()
    {
        return back-front<=0;
    }

    public int size()
    {
        if(back>front)
        {
            return back-front;
        }
        else
        {
            return back-front+queue.length;
        }
    }
    public static void main(String[] args)
    {
        ArrayQueue queue=new ArrayQueue();
        queue.add(new Employee("vishal","yadav",23));
        queue.add(new Employee("vipu","tipu",45));
        queue.remove();
        queue.add(new Employee("tan","doori",42));
        queue.remove();
        queue.add(new Employee("jane","qq",21));
        queue.remove();
        queue.add(new Employee("we","are",1));
        queue.remove();
        queue.add(new Employee("Watch","Think",1000));
        queue.printQueue();

      //  queue.printQueue();;
        Employee e=queue.peek();
        System.out.println(e);


    }







}
