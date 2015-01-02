package zen.behaviour.state;

/**
 * Created by yepengfan on 3/01/15.
 */
public class OpeningState extends LiftState {
    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void open() {
        System.out.println("Lift is opening");
    }

    @Override
    public void run() {
        
    }

    @Override
    public void stop() {
        
    }
}
