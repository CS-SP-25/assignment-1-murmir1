public class NoTax implements SalesTaxBehavior {

    //Returns zero as there's no sales tax on the transaction
    @Override
    public Double compute(Double value) {
        return 0.0;
    }
}
