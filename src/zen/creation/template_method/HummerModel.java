package zen.creation.template_method;

/**
 * Created by yepengfan on 18/12/14.
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public final void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
