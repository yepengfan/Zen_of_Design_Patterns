package zen.creational.factory_method;

/**
 * Created by yepengfan on 17/12/14.
 */
public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try{
            human = (T)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("Not a legal human!");
        }
        return (T)human;
    }
}
