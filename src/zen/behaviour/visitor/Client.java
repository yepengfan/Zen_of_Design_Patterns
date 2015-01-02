package zen.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yepengfan on 2/01/15.
 */
public class Client {
    public static void main(String[] args) {
        for(Employee emp:mockEmployee()){
            emp.accept(new Visitor());
        }
    }
    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("Java Programmer");
        zhangSan.setName("ZhangSan");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("UI Designer");
        liSi.setName("LiSi");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        Manager wangWu = new Manager();
        wangWu.setName("WangWu");
        wangWu.setPerformance("Low performance");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
