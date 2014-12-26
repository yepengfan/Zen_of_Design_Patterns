package zen.structure.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yepengfan on 26/12/14.
 */
public class OuterUser implements IOuterUser {
    public Map getUserBaseInfo(){
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "ZhangSan");
        baseInfoMap.put("mobileNumber", "ZhangSan mobile number");
        return baseInfoMap;
    }
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "ZhangSan home number");
        homeInfo.put("homeAddress", "ZhangSan home address");
        return homeInfo;
    }
    /*
     * 员工的工作信息，比如，职位等
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","ZhangSan position");
        officeInfo.put("officeTelNumber", "ZhangSan office tel number");
        return officeInfo;
    }
}
