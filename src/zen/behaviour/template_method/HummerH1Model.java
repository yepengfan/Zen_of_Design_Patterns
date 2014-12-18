package zen.behaviour.template_method;

/**
 * Created by yepengfan on 18/12/14.
 */
public class HummerH1Model extends HummerModel {
    public void alarm(){
        System.out.println("Hummer H1 alarming.");
    }
    public void engineBoom(){
        System.out.println("Hummer H1 engine booming.");
    }
    public void start(){
        System.out.println("Hummer H1 starts.");
    }
    public void stop(){
        System.out.println("Hummer H1 stops.");
    }
}
