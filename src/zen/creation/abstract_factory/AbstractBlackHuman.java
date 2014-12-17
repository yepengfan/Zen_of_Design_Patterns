package zen.creation.abstract_factory;

/**
 * Created by yepengfan on 17/12/14.
 */
public abstract class AbstractBlackHuman implements Human {
    public void getColor(){
        System.out.println("The skin color of black people is black.");
    }
    public void talk(){
        System.out.println("Black people can speak France.");
    }
}
