package zen.behaviour.mediator;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Mediator extends AbstractMediator {
    public void execute(String str, Object...objects){
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){
            this.offSell();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }
    
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("Purchase IBM computer: " + number);
            super.stock.increase(number);
        }else{
            int buyNumber = number / 2;
            System.out.println("Purchase IBM computer: " + buyNumber);
        }
    }
    
    private void sellComputer(int number){
        if(super.stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    
    private void offSell(){
        System.out.println("Off sell IBM computer: " + stock.getStockNumber());
    }
    
    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
