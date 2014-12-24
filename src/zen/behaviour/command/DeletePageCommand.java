package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class DeletePageCommand extends Command {
    public void execute(){
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
