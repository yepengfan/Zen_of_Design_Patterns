package zen.structure.adapter;

/**
 * Created by yepengfan on 26/12/14.
 */
public class UserInfo implements IUserInfo {
    public String getHomeAddress(){
        System.out.println("this is the employee home address");
        return null;
    }
    public String getHomeTelNumber(){
        System.out.println("employee home tel number");
        return null;
    }
    public String getJobPosition(){
        System.out.println("this is boss");
        return null;
    }
    public String getMobileNumber(){
        System.out.println("mobile number is 0000");
        return null;
    }
    public String getOfficeTelNumber(){
        System.out.println("office tel number is ...");
        return null;
    }
    public String getUserName(){
        System.out.println("name is ...");
        return null;
    }
}
