package zen.creational.abstract_factory;

/**
 * Created by yepengfan on 17/12/14.
 */
public abstract class AbstractWhiteHuman implements Human {
    public void getColor(){
        System.out.println("The skin color of white people is white.");
    }
    public void talk(){
        System.out.println("White people can speak English.");
    }
}
