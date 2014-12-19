package zen.creational.abstract_factory;

/**
 * Created by yepengfan on 17/12/14.
 */
public class MaleFactory implements HumanFactory {
    public Human createBlackHuman(){
        return new MaleBlackHuman();
    }
    public Human createWhiteHuman(){
        return new MaleWhiteHuman();
    }
    public Human createYellowHuman(){
        return new MaleYellowHuman();
    }
}
