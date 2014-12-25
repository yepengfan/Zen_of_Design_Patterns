package zen.behaviour.chain_of_responsibility;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Husband extends Handler {
   public Husband(){
       super(Handler.HUSBAND_LEVEL_REQUEST);
   }
    protected void response(IWomen women){
        System.out.println("--------Wife Request--------");
        System.out.println(women.getRequest());
        System.out.println("Husband Approved");
    }
}
