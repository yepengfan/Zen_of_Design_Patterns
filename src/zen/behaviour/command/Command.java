package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    
    public abstract void execute();
}
