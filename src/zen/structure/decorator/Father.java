package zen.structure.decorator;

/**
 * Created by yepengfan on 25/12/14.
 */
public class Father {
    public static void main(String[] args){
        SchoolReport sr;
        sr = new FourthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("Lao San");
    }
}
