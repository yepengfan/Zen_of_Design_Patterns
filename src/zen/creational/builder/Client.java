package zen.creational.builder;

/**
 * Created by yepengfan on 18/12/14.
 */
public class Client {
    public static void main(String[] args){
        Director director = new Director();
        for(int i = 0; i < 3; i++){
            director.getABenzModel().run();
        }

        for(int i = 0; i < 6; i++){
            director.getBBenzModel().run();
        }

        for(int i = 0; i < 9; i++){
            director.getCBMWModel().run();
        }
    }
}
