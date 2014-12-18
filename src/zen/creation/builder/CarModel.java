package zen.creation.builder;

import java.util.ArrayList;

/**
 * Created by yepengfan on 18/12/14.
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    public final void run(){
        for(int i = 0; i < this.sequence.size(); i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList sequence){
        this.sequence = sequence;
    }
}
