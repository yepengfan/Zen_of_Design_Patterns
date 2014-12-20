package zen.behaviour.mediator;

import java.util.Random;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator){
        super(_mediator);        
    }
    
    public void sellIBMComputer(int number){
//        Stock stock = new Stock();
//        Purchase purchase = new Purchase();
//        if(stock.getStockNumber() < number){
//            purchase.buyIBMcomputer(number);
//        }
        super.mediator.execute("sale.sell", number);
        System.out.println("Sell IBM computer: " + number);
//        stock.decrease(number);
    }
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM computer selling status: " + saleStatus);
        return saleStatus;
    }
    public void offSale(){
//        Stock stock = new Stock();
//        System.out.println("Off sale IBM computer: " + stock.getStockNumber());
        super.mediator.execute("sale.offsell");
    }
}
