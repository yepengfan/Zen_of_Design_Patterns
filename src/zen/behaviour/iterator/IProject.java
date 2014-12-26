package zen.behaviour.iterator;

/**
 * Created by yepengfan on 27/12/14.
 */
public interface IProject {
    public void add(String name, int num, int cost);
    public String getProjectInfo();
    public IProjectIterator iterator();
}
