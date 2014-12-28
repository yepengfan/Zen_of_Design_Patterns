package zen.structure.composite;

import java.util.ArrayList;

/**
 * Created by yepengfan on 27/12/14.
 */
public class Branch extends Corp {
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();
    public Branch(String _name, String _position, int _salary){
        super(_name, _position, _salary);
    }
    public void addSubordinate(Corp corp){
        this.subordinateList.add(corp);        
    }
    public ArrayList getSubordinateInfo(){
        return this.subordinateList;
    }
}
