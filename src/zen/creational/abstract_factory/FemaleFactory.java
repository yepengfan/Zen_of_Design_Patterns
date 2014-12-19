package zen.creational.abstract_factory;

/**
 * Created by yepengfan on 17/12/14.
 */
public class FemaleFactory implements HumanFactory {
    public Human createBlackHuman(){
        return new FemaleBlackHuman();
    }
    public Human createWhiteHuman(){
        return new FemaleWhiteHuman();
    }
    public Human createYellowHuman(){
        return new FemaleYellowHuman();
    }
}
