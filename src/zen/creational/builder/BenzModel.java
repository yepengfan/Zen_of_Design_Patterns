package zen.creational.builder;

/**
 * Created by yepengfan on 18/12/14.
 */
public class BenzModel extends CarModel {
    protected void alarm(){
        System.out.println("Benz car is alarming");
    }
    protected void engineBoom(){
        System.out.println("Benz car's engine is booming");
    }
    protected void start(){
        System.out.println("Benz car starts");
    }
    protected void stop(){
        System.out.println("Benz car stops");
    }
}
