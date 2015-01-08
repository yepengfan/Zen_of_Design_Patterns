package zen.structure.bridge;

/**
 * Created by yepengfan on 8/01/15.
 */
public abstract class Corp {
    //    protected abstract void produce();
//
//    protected abstract void sell();
//
//    public void makeMoney() {
//        this.produce();
//        this.sell();
//    }
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProduced();
        this.product.beSold();
    }
}
