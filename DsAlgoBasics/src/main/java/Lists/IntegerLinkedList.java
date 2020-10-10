package Lists;

public class IntegerLinkedList {

    IntegerNode head;

    public void insertSorted(int a)
    {
        IntegerNode newNde=new IntegerNode(a);
        if(head==null)
        {
            head=newNde;
        }
       else if(head.getAnInt()<a)
        {
            newNde.setNext(head);
            head=newNde;
        }
       else if(head.getNext()==null && head.getAnInt()>a)
        {
            head.setNext(newNde);
        }
       else
           {
            IntegerNode l=head;
            while(l.getNext() != null && l.getNext().getAnInt() > a)
            {
                l = l.getNext();
            }
            newNde.setNext(l.getNext());
            l.setNext(newNde);
            }
    }
    public void printList()
    {
        IntegerNode a=head;
        System.out.print("HEAD->");
        while(a!=null)
        {
            System.out.print(a);
            System.out.print("->");
            a=a.getNext();
        }
        System.out.print("null");
    }
    public static void main(String[] args)
    {
int a=10,b=34,c=67,d=32,e=2,f=67;
        IntegerLinkedList list=new IntegerLinkedList();
        list.insertSorted(a);
        list.insertSorted(c);
        list.insertSorted(b);
        list.insertSorted(e);
        list.insertSorted(d);
        list.insertSorted(f);
        list.printList();
    }
}
