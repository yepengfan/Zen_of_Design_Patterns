package zen.structure.proxy;

/**
 * Created by yepengfan on 19/12/14.
 */
public class Client {
    public static void main(String[] args){
        IGamePlayer player = new GamePlayer("Zhang San");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("Start Date: 2009-08-25 10:45");
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("End Date: 2009-08-26 03:40");
    }
}
