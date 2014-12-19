package zen.creational.factory_method;

/**
 * Created by yepengfan on 17/12/14.
 */
public class YellowHuman implements Human {
    public void getColor(){
        System.out.println("The skin color of yellow man is yellow.");
    }
    public void talk(){
        System.out.println("Yellow man can speak Chinese.");
    }
}
