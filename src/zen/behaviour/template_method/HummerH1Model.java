package zen.behaviour.template_method;

/**
 * Created by yepengfan on 18/12/14.
 */
public class HummerH1Model extends HummerModel {
    public void alarm(){
        System.out.println("Hummer H1 is alarming.");
    }
    public void engineBoom(){
        System.out.println("Hummer H1's engine is booming.");
    }
    public void start(){
        System.out.println("Hummer H1 starts.");
    }
    public void stop(){
        System.out.println("Hummer H1 stops.");
    }
}
