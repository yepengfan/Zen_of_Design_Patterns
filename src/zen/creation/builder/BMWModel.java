package zen.creation.builder;

/**
 * Created by yepengfan on 18/12/14.
 */
public class BMWModel extends CarModel {
    protected void alarm(){
        System.out.println("BMW car is alarming");
    }
    protected void engineBoom(){
        System.out.println("BMW car's engine is booming");
    }
    protected void start(){
        System.out.println("BMW car starts");
    }
    protected void stop(){
        System.out.println("BMW car stops");
    }
}
