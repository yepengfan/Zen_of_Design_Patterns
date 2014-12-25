package zen.behaviour.strategy;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;        
    }
    public void operate(){
        this.strategy.operate();
    }
}
