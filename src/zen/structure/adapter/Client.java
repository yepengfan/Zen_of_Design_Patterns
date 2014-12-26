package zen.structure.adapter;

/**
 * Created by yepengfan on 26/12/14.
 */
public class Client {
    public static void main(String[] args){
//        IUserInfo youngGirl = new UserInfo();
        IUserInfo youngGirl = new OuterUserInfo();
        for(int i = 0; i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }
}
