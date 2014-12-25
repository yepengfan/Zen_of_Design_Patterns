package zen.structure.decorator;

/**
 * Created by yepengfan on 25/12/14.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr){
        super(sr);        
    }
    private void reportHighScore(){
        System.out.println("High score decorator");        
    }
    
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
