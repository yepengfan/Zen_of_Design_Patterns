package zen.behaviour.strategy;

/**
 * Created by yepengfan on 25/12/14.
 */
public class ZhaoYun {
    public static void main(String[] args){
        Context context;
        System.out.println("------The first strategy------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n");

        System.out.println("------The second strategy------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n");

        System.out.println("------The third strategy------");
        context = new Context(new BlockEnemy());
        System.out.println("\n\n\n");
    }
}
