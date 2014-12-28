package zen.structure.composite;

/**
 * Created by yepengfan on 28/12/14.
 */
public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;
    public Corp(String _name, String _position, int _salary){
        this.name = _name;
        this.position = _position;
        this.salary = _salary;        
    }
    public String getInfo(){
        String info = "";
        info = "name:" + this.name;
        info = info + "\tPosition:" + this.position;
        info = info + "\tSalary:" + this.salary;
        return info;
    }
}
