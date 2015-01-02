package zen.behaviour.state;

/**
 * Created by yepengfan on 3/01/15.
 */
public class RunningState extends LiftState {
    @Override
    public void close() {
        
    }

    @Override
    public void open() {
        
    }

    @Override
    public void run() {
        System.out.println("Lift is running");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
