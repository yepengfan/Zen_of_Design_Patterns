package zen.structure.proxy;

/**
 * Created by yepengfan on 19/12/14.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }
    public void killBoss(){
        this.gamePlayer.killBoss();
    }
    public void login(String user, String password){
        this.gamePlayer.login(user, password);
    }
    public void upgrade(){
        this.gamePlayer.upgrade();
    }
}
