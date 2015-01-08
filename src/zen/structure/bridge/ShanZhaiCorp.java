package zen.structure.bridge;

/**
 * Created by yepengfan on 9/01/15.
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("ShanZhai company gain money.");
    }
}
