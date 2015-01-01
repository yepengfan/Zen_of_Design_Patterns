package zen.behaviour.memento;

/**
 * Created by yepengfan on 1/01/15.
 */
public class Memento {
    private String state = "";
    public Memento(String _state) {
        this.state = _state;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
