package zen.behaviour.template_method;

/**
 * Created by yepengfan on 18/12/14.
 */
public class Client {
    public static void main(String[] args){
        HummerModel h1 = new HummerH1Model();
        System.out.println("---Hummer H1 running---");
        h1.run();
        HummerModel h2 = new HummerH2Model();
        System.out.println("---Hummer H2 running---");
        h2.run();
    }
}
