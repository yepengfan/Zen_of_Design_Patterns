package zen.creational.abstract_factory;

/**
 * Created by yepengfan on 17/12/14.
 */
public abstract class AbstractYellowHuman implements Human {
    public void getColor(){
        System.out.println("The skin color of yellow people is yellow");
    }
    public void talk(){
        System.out.println("Yellow people can speak Chinese.");
    }
}

