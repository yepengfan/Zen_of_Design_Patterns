package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class AddRequirementCommand extends Command {
    public void execute(){
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
