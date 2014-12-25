package zen.structure.decorator;

/**
 * Created by yepengfan on 25/12/14.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr){
        super(sr);        
    }
    private void reportSort(){
        System.out.println("Sort Decorator");
    }
    
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
