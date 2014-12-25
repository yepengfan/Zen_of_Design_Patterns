package zen.behaviour.chain_of_responsibility;

/**
 * Created by yepengfan on 25/12/14.
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    
    private int level = 0;
    private Handler nextHandler;
    public Handler(int _level){
        this.level = _level;        
    }
    public final void HandleMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandleMessage(women);
            }else{
                System.out.println("---At the end of responsibility chain, not allowable ---\n");
            }
        }
    }
    public void setNext(Handler _handler){
        this.nextHandler = _handler;        
    }
    protected abstract void response(IWomen women);
}
