package zen.structure.decorator;

/**
 * Created by yepengfan on 25/12/14.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;
    public Decorator(SchoolReport sr){
        this.sr = sr;        
    }
    public void report(){
        this.sr.report();        
    }
    public void sign(String name){
        this.sr.sign(name);
    }
}
