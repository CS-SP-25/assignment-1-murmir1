public class FourPointFive implements SalesTaxBehavior {

    //Returns 4.5% of the transaction amount
    @Override
    public Double compute(Double value) {
        return value * 0.045;
    }

    }
