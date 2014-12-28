package zen.structure.composite;

import java.util.ArrayList;

/**
 * Created by yepengfan on 27/12/14.
 */
public class Client {
    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }
    public static Branch compositeCorpTree(){
        Branch root = new Branch("Wang","CEO",100000);
        
        Branch developDep = new Branch("Liu","Development Department Manager",10000);
        Branch salesDep = new Branch("Ma","Sales Department Manager",20000);
        Branch financeDep = new Branch("Zhao","Fiance Department Manager",30000);

        Branch firstDevGroup = new Branch("Yang","Manger of 1st Dev Group",5000);
        Branch secondDevGroup = new Branch("Wu","Manger of 2ed Dev Group",6000);
        
        Leaf a = new Leaf("a","Developer",3000);
        Leaf b = new Leaf("b","Developer",3000);
        Leaf c = new Leaf("c","Developer",3000);
        Leaf d = new Leaf("d","Developer",3000);
        Leaf e = new Leaf("e","Developer",3000);
        Leaf f = new Leaf("f","Developer",3000);
        Leaf g = new Leaf("g","Developer",3000);

        Leaf h = new Leaf("h","Salesman",5000);
        Leaf i = new Leaf("i","Salesman",4000);
        Leaf j = new Leaf("j","Accountant",5000);
        Leaf k = new Leaf("k","CEO secretary",8000);
        
        Leaf zhengLaoLiu = new Leaf("Zheng", "Vice Manager of Development Department", 20000);

        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);


        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        firstDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        secondDevGroup.addSubordinate(g);

        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        financeDep.addSubordinate(j);

        return root;
    }
    
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinateInfo();
        String info = "";
        for(Corp s:subordinateList){
            if(s instanceof Leaf){
                info = info + s.getInfo() + "\n";
            }else{
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }
}
