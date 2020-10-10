package Lists;

public class EmployeeNode
{

    private  Employee e;
    private EmployeeNode n;
    private EmployeeNode p;

    public EmployeeNode getP() {
        return p;
    }

    public void setP(EmployeeNode p) {
        this.p = p;
    }

    public EmployeeNode(Employee e) {
        this.e = e;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public EmployeeNode getN() {
        return n;
    }

    public void setN(EmployeeNode n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return e.toString() ;
    }
}
