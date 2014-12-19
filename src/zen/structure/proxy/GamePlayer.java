package zen.structure.proxy;

/**
 * Created by yepengfan on 19/12/14.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    public GamePlayer(String _name){
        this.name = _name;
    }
    public void killBoss(){
        System.out.println(this.name + "is killing boss.");
    }
    public void login(String user, String password){
        System.out.println("login name:" + user + ", username: " + this.name);
    }
    public void upgrade(){
        System.out.println(this.name + "upgrade.");
    }
}
