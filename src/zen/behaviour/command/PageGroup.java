package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class PageGroup extends Group {
    public void find(){
        System.out.println("find page group");
    }
    public void add(){
        System.out.println("add a page");
    }
    public void change(){
        System.out.println("change a page");
    }
    public void delete(){
        System.out.println("delete a page");
    }
    public void plan(){
        System.out.println("the page plan was changed");
    }
}
