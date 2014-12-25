package zen.behaviour.chain_of_responsibility;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Father extends Handler {
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);        
    }
    protected void response(IWomen women){
        System.out.println("--------Daughter Request--------");
        System.out.println(women.getRequest());
        System.out.println("Father Approved");
    }
}
