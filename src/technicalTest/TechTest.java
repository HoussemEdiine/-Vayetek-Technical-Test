package technicalTest;

import technicalTest.oodQ2.ComponentProduct;
import technicalTest.oodQ2.Product;
import technicalTest.oop.Employee;
import technicalTest.oop.Productmanger;
import technicalTest.oop.TechnicalLead;

public class TechTest {

    public static void main(String[] args) {
 // question 1 :
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        if(checkrotation(s1,s2)){
            System.out.println(s2 + " " + "is a rotation of "+ s1);
        }
        //***************************
         // with Singleton we can make only one intstance
        TechnicalLead technicalLead = TechnicalLead.getInstance();
        Productmanger productmanger = Productmanger.getInstance();


        System.out.println(technicalLead.getCallHandler());
        System.out.println(productmanger.getCallHandler());
      // by default an employee have fresher level
        Employee employee = new Employee();
        System.out.println(employee.getCallHandler());
//**********************************************
        // oriented object design question 2
        Product product = new Product(1 ,"saketeBoard") ;
        System.out.println(product.getProcuct());
        ComponentProduct componentProduct  = new ComponentProduct(4  , "wheels");
        System.out.println(componentProduct.getProcuct());
     //**********************************************
     // we suppose that the array is sorted
      int[] array = {1 , 2 , 3 , 5};
        System.out.println(search(array , 3));

    }

// Question one
    public  static  boolean checkrotation( String s1 , String s2){

        // if s2 is a rotation of s1 they must have the same length
        if(s1.length()!=s2.length()){
            return  false;
        }
        String s3 = s1 + s1 ;
        if(isSubString(s3,s2)){
            return  true;
        }else {
            return  false ;
        }

    }
// for this task i assumed isSubString  return true  check if s2 is a substring of s1
    private static boolean isSubString(String s1 , String s2) {
        return  true;
    }
// Sorting and Searching o(log n) for this we can use binary search algorithm
    public  static  int search (int[] array , int value){
         int  low = 0  ;
         int high = array.length -1 ;

         while (low <= high){
             int mid = low + ( high - low)/2 ;
             // if true we can ignore the other part of the array
          if(array[mid] < value) low = mid+1 ;
           else  if (array[mid] > value) high = mid-1 ;
           else return  mid ;
         }




        return  -1 ;


    }

}
