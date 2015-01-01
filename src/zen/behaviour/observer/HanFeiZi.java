package zen.behaviour.observer;

import java.util.ArrayList;

/**
 * Created by yepengfan on 31/12/14.
 */
public class HanFeiZi implements Observable, IHanFeiZi {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        this.observerList.add(observer);        
    }
    public void deleteObserver(Observer observer){
        this.observerList.remove(observer);
    }
    public void notifyObservers(String context){
        for(Observer observer: observerList){
            observer.update(context);
        }
    }
    public void haveBreakfast(){
        System.out.println("HanFeiZi: starts having breakfast");
        this.notifyObservers("HanFeiZi is having breakfast");
    }
    public void haveFun(){
        System.out.println("HanFeiZi: starts having fun");
        this.notifyObservers("HanFeiZi is having fun");
    }
}
