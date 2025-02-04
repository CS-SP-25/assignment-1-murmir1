public class SalesTaxCalculator {
    public static void main(String[] args) {

      State test1 = new Indiana();
      State test2 = new Alaska();
      State test3 = new State("Texas");
      State test4 = new Hawaii();

      //Test output for Indiana
      System.out.println(test1.getName());
      test1.showTax(100, new SevenPercent());

      //Test output for Alaska
      System.out.println(test2.getName());
      test2.showTax(100, new NoTax());

      //Test output for custom State
      System.out.println(test3.getName());
      test3.showTax(100, new NoTax());

      //Test output for Hawaii
      System.out.println(test4.getName());
      test4.showTax(100,new FourPointFive());
    }

}
