public class State {
    private String name; //Created to know the name of the state of the transaction
    private SalesTaxBehavior taxBehavior; //Created to know what tax behavior applies to the transaction
    //Constructor
    public State(String name) {
        this.name = name;
    }

    //Gets the name of the state
    public String getName() {
        return name;
    }

    //Sets the name of the state
    public void setName(String name) {
        this.name = name;
    }

    //Gets the tax percentage/behavior
    public SalesTaxBehavior getTaxBehavior() {
        return taxBehavior;
    }

    //Sets the tax percentage/behavior
    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    //abstract method overridden in respective subclasses
    public void showTax(double purchaseValue, SalesTaxBehavior taxBehavior) {}
}
