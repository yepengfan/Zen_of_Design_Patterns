package zen.behaviour.state;

/**
 * Created by yepengfan on 3/01/15.
 */
public class ClosingState extends LiftState{
    @Override
    public void close() {
        System.out.println("Lift is closing");
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
