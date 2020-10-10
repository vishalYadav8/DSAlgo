package Lists;

public class IntegerNode {
   private int anInt;
   private IntegerNode next;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    IntegerNode(int anInt)
    {
        this.anInt=anInt;
    }
    @Override
    public String toString() {
        return "IntegerNode{" +
                "anInt=" + anInt +
                '}';
    }
}
