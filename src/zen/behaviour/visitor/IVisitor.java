package zen.behaviour.visitor;

/**
 * Created by yepengfan on 2/01/15.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);
}
