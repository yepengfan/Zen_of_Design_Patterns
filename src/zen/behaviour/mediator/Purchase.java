package zen.behaviour.mediator;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator){
        super(_mediator);        
    }
    
    public void buyIBMcomputer(int number){
//        Stock stock = new Stock();
//        Sale sale = new Sale();
//        
//        int saleStatus = sale.getSaleStatus();
//        if(saleStatus > 80){
//            System.out.println("Purchase IBM computer: " + number);
//            stock.increase(number);
//        }else{
//            int buyNumber = number / 2;
//            System.out.println("Purchase IBM computer: " + buyNumber);
//        }
        super.mediator.execute("purchase.buy", number);
    }
    public void refuseBuyIBM(){
        System.out.println("stop purchasing IBM computer");
    }
}
