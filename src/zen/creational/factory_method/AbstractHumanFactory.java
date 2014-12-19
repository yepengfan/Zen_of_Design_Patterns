package zen.creational.factory_method;

/**
 * Created by yepengfan on 17/12/14.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
