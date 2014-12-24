package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;        
    }
    public void action(){
        this.command.execute();
    }
}
