package zen.creational.builder;

import java.util.ArrayList;

/**
 * Created by yepengfan on 18/12/14.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    public CarModel getCarModel(){
        return this.benz;
    }
    public void setSequence(ArrayList<String> sequence){
        this.benz.setSequence(sequence);
    }
}
