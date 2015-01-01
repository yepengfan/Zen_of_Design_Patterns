package zen.behaviour.memento;

/**
 * Created by yepengfan on 1/01/15.
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("Good");
        System.out.println("The Current State of the Boy");
        System.out.println(boy.getState());
//        Memento mem = boy.createMemento();
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("Changed State");
        System.out.println(boy.getState());
//        boy.restoreMemento(mem);
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("Recovered State");
        System.out.println(boy.getState());
    }
}
