package technicalTest.oop;

public class TechnicalLead  extends Employee {

     private    Roles role  = Roles.TL ;
    private static TechnicalLead single_instance = null;
   private  TechnicalLead(){

   }

   public  static  TechnicalLead getInstance(){
       if(single_instance == null)
           single_instance = new TechnicalLead();

          return  single_instance;
   }

    @Override
    public Roles getCallHandler() {
        super.getCallHandler();
      return  this.role ;
   }
}
