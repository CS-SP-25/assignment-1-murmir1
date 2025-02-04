public class Hawaii extends State{
    public Hawaii() {
        super("Hawaii"); //Calls constructor in State class
    }

    //Calculates and outputs specific tax for purchases in Hawaii
    @Override
    public void showTax (double purchaseValue, SalesTaxBehavior salesTaxBehavior) {
        setTaxBehavior(salesTaxBehavior); //The user can choose what tax behavior to apply on the purchase, making the program dynamic
        double taxAmount = getTaxBehavior().compute(purchaseValue); //Compute the value based off the selected tax behavior for Hawaii
        System.out.printf("The sales tax on $%.2f in Hawaii is $%.2f.%n", purchaseValue, taxAmount); //Print the value of the tax
    }
}
