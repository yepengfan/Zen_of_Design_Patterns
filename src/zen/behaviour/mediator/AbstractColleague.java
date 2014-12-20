package zen.behaviour.mediator;

/**
 * Created by yepengfan on 20/12/14.
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
