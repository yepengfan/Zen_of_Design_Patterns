package zen.creation.prototype;

/**
 * Created by yepengfan on 19/12/14.
 */
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone(){
        Mail mail = null;
        try{
            mail = (Mail)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver(){
        return receiver;
    }
    public void setReceiver(String receiver){
        this.receiver = receiver;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getAppellation(){
        return appellation;
    }
    public void setAppellation(String appellation){
        this.appellation = appellation;
    }
    public String getContxt(){
        return contxt;
    }
    public void setContxt(String contxt){
        this.contxt = contxt;
    }
    public String getTail(){
        return tail;
    }
    public void setTail(String tail){
        this.tail = tail;
    }
}
