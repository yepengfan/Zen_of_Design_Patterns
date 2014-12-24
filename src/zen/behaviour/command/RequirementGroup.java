package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class RequirementGroup extends Group {
    public void find(){
        System.out.println("find requirements group");
    }
    public void add(){
        System.out.println("add a requirement");
    }
    public void change(){
        System.out.println("change a requirement");
    }
    public void delete(){
        System.out.println("delete a requirement");
    }
    public void plan(){
        System.out.println("the requirement plan was changed");
    }
}
