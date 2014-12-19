package zen.creational.singleton;

/**
 * Created by yepengfan on 17/12/14.
 */
public class Minister {
    public static void main(String[] args){
        int ministerNum = 5;
        for(int i = 0; i < ministerNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("The "+(i+1)+" minister is attending to ");
            emperor.say();
        }
    }
}
