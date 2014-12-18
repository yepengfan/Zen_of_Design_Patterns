package zen.creation.template_method;

/**
 * Created by yepengfan on 18/12/14.
 */
public class HummerH2Model extends HummerModel {
    public void alarm(){
        System.out.println("Hummer H2 alarming.");
    }
    public void engineBoom(){
        System.out.println("Hummer H2 engine booming.");
    }
    public void start(){
        System.out.println("Hummer H2 starts.");
    }
    public void stop(){
        System.out.println("Hummer H2 stops.");
    }
}