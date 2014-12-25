package zen.structure.decorator;

/**
 * Created by yepengfan on 25/12/14.
 */
public class FourthGradeSchoolReport extends SchoolReport {
    public void report(){
        System.out.println("Dear Parents");
        System.out.println("...");
        System.out.println("Grades: ...");
        System.out.println("...");
        System.out.println("Parents Signature");
    }
    public void sign(String name){
        System.out.println("Parents Signature:" + name);
    }
}
