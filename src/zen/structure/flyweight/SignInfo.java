package zen.structure.flyweight;

/**
 * Created by yepengfan on 8/01/15.
 */
public class SignInfo {
    private String id;
    private String location;
    private String subject;
    private String postAddress;
    
    public String getId() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
