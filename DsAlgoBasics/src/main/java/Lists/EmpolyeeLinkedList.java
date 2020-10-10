package Lists;

public class EmpolyeeLinkedList {
EmployeeNode head;
EmployeeNode tail;
int size=0;
    public void addToFront(Employee e)
    {
        EmployeeNode node=new EmployeeNode(e);
        node.setN(head);
        if(head==null)
        {
            tail=node;
        }
        else
        {
            head.setP(node);
        }
        head=node;
        size++;
    }
    public void addtoTail(Employee e)
    {
        EmployeeNode node=new EmployeeNode(e);
        node.setP(tail);
        if (tail ==null)
        {
            head=node;
        }
        else
        {
            tail.setN(node);
        }
        tail=node;
        size++;
    }
public int getSize()
{
    return size;
}
    public void printList()
    {
        EmployeeNode list=head;
        System.out.print("HEAD->");
        while(list!=null)
        {
            System.out.print(list);
            System.out.print("<=>");
            list=list.getN();
        }
        System.out.print("null");
    }
    public void removeFromFront()
    {
        if(isEmpty())return ;
        if(head.getN()==null)
        {
            tail=null;
        }
        else
        {
            head.getN().setP(null);
        }
        head=head.getN();
        size--;
    }
    public void removeFromTail()
    {
        if (tail.getP()==null)
        {
            head=null;
        }
        else
        {
            tail.getP().setN(null);
        }
        tail=tail.getP();
        size--;
    }
    public boolean isEmpty()
    {
        return head == null;
    }

    public void addBefore(Employee existing,Employee newEmp)
    {
        EmployeeNode beforeExist=iterate(existing);
        EmployeeNode newEmpNode=new EmployeeNode(newEmp);
        newEmpNode.setN(beforeExist);
        newEmpNode.setP(beforeExist.getP());
        beforeExist.getP().setN(newEmpNode);
        beforeExist.setP(newEmpNode);
    }
    public EmployeeNode iterate(Employee employee)
    {
        EmployeeNode list=head;
        while (list.getN()!=null)
        {
            if(list.getE()==employee)
            {
                break;
            }
            list=list.getN();
        }
        return list;
    }
    public static void main(String[] args)
    {

            Employee a=new Employee("Vishal","Yadav",1);
            Employee b=new Employee("Vipu","tipu",2);
            Employee c=new Employee("Indu","devi",3);
            Employee newEmp=new Employee("sunil","kumar",10);
            EmpolyeeLinkedList list=new EmpolyeeLinkedList();
            list.addToFront(a);
            list.addtoTail(b);
            list.addToFront(c);
            list.printList();
            System.out.println(list.getSize());


            list.addBefore(b,newEmp);
            list.printList();
          /*  list.removeFromFront();
        System.out.println(list.getSize());
            list.printList();
            list.removeFromTail();
        System.out.println(list.getSize());
        list.printList();

        LinkedList<Employee> jdklist=new LinkedList<>();
        jdklist.add(c);
        jdklist.addFirst(b);
        jdklist.addFirst(a);

        Iterator<Employee> e=jdklist.iterator();
        e.forEachRemaining(System.out::println);
        jdklist.remove();
        e=jdklist.iterator();
        e.forEachRemaining(System.out::println);*/

    }
}
