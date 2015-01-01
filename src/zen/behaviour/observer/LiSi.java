package zen.behaviour.observer;

/**
 * Created by yepengfan on 31/12/14.
 */
public class LiSi implements Observer {
    public void update(String str){
        System.out.println("LiSi: observers activities of HanFeiZi and starts reporting");
        this.reportToQinShiHuang(str);
        System.out.println("LiSi: reporting ended.");
    }
    private void reportToQinShiHuang(String reportContext){
        System.out.println("LiSi: HanFeiZi has activities. -> " + reportContext);
    }
}
