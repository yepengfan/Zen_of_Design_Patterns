package zen.behaviour.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Client {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i = 0; i < 5; i++){
            arrayList.add(new Women(rand.nextInt(4), "wants to go shopping"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        
        father.setNext(husband);
        husband.setNext(son);
        
        for(IWomen women: arrayList){
            father.HandleMessage(women);
        }
    }
}
