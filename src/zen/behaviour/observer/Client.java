package zen.behaviour.observer;

/**
 * Created by yepengfan on 31/12/14.
 */
public class Client {
    public static void main(String[] args){
        Observer liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
    }
}
