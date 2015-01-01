package zen.behaviour.memento;

/**
 * Created by yepengfan on 1/01/15.
 */
public class Boy {
    private String state = "";

    public void changeState() {
        this.state = "bad";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }
    
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}
