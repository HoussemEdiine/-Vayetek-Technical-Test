package technicalTest.oop;

public class Productmanger extends  Employee {

    private   Roles role = Roles.PM ;
    private static Productmanger single_instance = null;

    private  Productmanger(){

    }
    public  static  Productmanger getInstance(){
        if(single_instance== null)
            return  single_instance= new Productmanger();
        return single_instance;
    }


    @Override
    public Roles getCallHandler() {
        return  this.role ;
    }
}
