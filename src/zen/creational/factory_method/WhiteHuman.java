package zen.creational.factory_method;

/**
 * Created by yepengfan on 17/12/14.
 */
public class WhiteHuman implements Human {
    public void getColor(){
        System.out.println("The skin color of white man is white.");
    }
    public void talk(){
        System.out.println("White man can speak English.");
    }
}
