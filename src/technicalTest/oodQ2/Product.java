package technicalTest.oodQ2;

public class Product {
   private int unitNumber ;
   private  String productName ;

    public Product(int unitNumber , String productName) {
         this.unitNumber = unitNumber ;
         this.productName = productName;
    }

    public String getProcuct(){
        return this.productName + " " + this.unitNumber + " unit" ;
    }
}
