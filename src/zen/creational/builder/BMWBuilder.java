package zen.creational.builder;

import java.util.ArrayList;

/**
 * Created by yepengfan on 18/12/14.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    public CarModel getCarModel(){
        return this.bmw;
    }
    public void setSequence(ArrayList<String> sequence){
        this.bmw.setSequence(sequence);
    }
}
