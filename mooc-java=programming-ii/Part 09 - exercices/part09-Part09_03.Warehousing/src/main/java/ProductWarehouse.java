public class ProductWarehouse extends Warehouse {

    private String pname;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.pname=productName;

    }

    public String getName(){
        return this.pname;
    }

    public void setName(String newName) {
        this.pname=newName;
    }

    public String toString(){
        return this.pname + ": balance = " + super.getBalance() + ", space left " + super.howMuchSpaceLeft();
    }
}
