public class SevenPercent implements SalesTaxBehavior {

    //Returns 7% of the transaction amount
    @Override
    public Double compute(Double value) {
        return value * 0.07;
    }
}
