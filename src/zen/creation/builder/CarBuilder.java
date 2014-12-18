package zen.creation.builder;

import java.util.ArrayList;

/**
 * Created by yepengfan on 18/12/14.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
