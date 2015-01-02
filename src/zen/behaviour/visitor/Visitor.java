package zen.behaviour.visitor;

/**
 * Created by yepengfan on 3/01/15.
 */
public class Visitor implements IVisitor {
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        String info = "Name: " + employee.getName() + "\t";
        info = info + "Gender: " + (employee.getSex() == Employee.FEMALE ? "female" : "male") + "\t";
        info = info + "Salary: " + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "Performance: " + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "Job: " + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
