package zen.behaviour.iterator;

import java.util.ArrayList;

/**
 * Created by yepengfan on 27/12/14.
 */
public class Project implements IProject {
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private String name = "";
    private int num = 0;
    private int cost = 0;
    public Project(){
                
    }
    private Project(String name, int num, int cost){
        this.name = name;
        this.num = num;
        this.cost = cost;        
    }
    public void add(String name, int num, int cost){
        this.projectList.add(new Project(name, num, cost));        
    }
    public String getProjectInfo(){
        String info = "";
        info = info + "Project Info:" + this.name;
        info = info + "\t Number of People Involved:" + this.num;
        info = info + "\t Fee of Project:" + this.cost;
        return info;
    }
    public IProjectIterator iterator(){
        return new ProjectIterator(this.projectList);
    }
}
