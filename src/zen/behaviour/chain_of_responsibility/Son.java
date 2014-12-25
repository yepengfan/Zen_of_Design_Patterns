package zen.behaviour.chain_of_responsibility;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Son extends Handler {
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);        
    }
    protected void response(IWomen women){
        System.out.println("--------Mother Request--------");
        System.out.println(women.getRequest());
        System.out.println("Son Approved");
    }
}
