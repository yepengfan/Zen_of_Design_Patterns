package zen.behaviour.chain_of_responsibility;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Women implements IWomen {
    private int type = 0;
    private String request = "";
    public Women(int _type, String _request){
        this.type = _type;
        switch(this.type){
            case 1:
                this.request = "Daughter request:" + _request;
                break;
            case 2:
                this.request = "Wife request:" + _request;
                break;
            case 3:
                this.request = "Mother request" + _request;
        }
    }
    public int getType(){
        return this.type;        
    }
    public String getRequest(){
        return this.request;
    }
}
