package zen.structure.flyweight;

/**
 * Created by yepengfan on 8/01/15.
 */
public class Client {
    public static void main(String[] args) {
//        SignInfo signInfo = SignInfoFactory.getSignInfo();
        for (int i = 0; i < 4; i++) {
            String subject = "Subject" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "Location" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("Subject1Location1");
    }
}
