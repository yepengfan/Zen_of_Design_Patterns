package zen.creational.singleton;

/**
 * Created by yepengfan on 17/12/14.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomething(){

    }
}
