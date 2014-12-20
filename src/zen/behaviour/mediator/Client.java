package zen.behaviour.mediator;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Client {
    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();
        System.out.println("-----Buyers Purchase Computer-----");
//        Purchase purchase = new Purchase();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        
        System.out.println("\n-----Salesmen Sell Computer-----");
//        Sale sale = new Sale();
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        System.out.println("\n-----Stockmen Clear Stock-----");
//        Stock stock = new Stock();
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
