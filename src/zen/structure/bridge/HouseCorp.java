package zen.structure.bridge;

/**
 * Created by yepengfan on 8/01/15.
 */
public class HouseCorp extends Corp {
    //    protected void produce() {
//        System.out.println("Real estate company builds houses.");
//    }
//
//    protected void sell() {
//        System.out.println("Real estate company sells houses.");
//    }
//
//    public void makeMoney() {
//        super.makeMoney();
//        System.out.println("Real estate gain income.");
//    }
    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("Real estate company gain money.");
    }
}
