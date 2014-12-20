package zen.behaviour.mediator;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator _mediator){
        super(_mediator);        
    }
    
    private static int COMPUTER_NUMBER = 100;
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("In stock computer: " + COMPUTER_NUMBER);
    }
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("In stock computer: " + COMPUTER_NUMBER);
    }
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    public void clearStock(){
//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
        System.out.println("Clear stock computer: " + COMPUTER_NUMBER);
//        sale.offSale();
//        purchase.refuseBuyIBM();
        super.mediator.execute("stock.clear");
    }
}
