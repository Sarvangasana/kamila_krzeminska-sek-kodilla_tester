package wallet;

public class CashSlot {
    private int contents;

    public CashSlot (){
    }

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}
