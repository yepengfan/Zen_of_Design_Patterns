package zen.structure.facade;

/**
 * Created by yepengfan on 1/01/15.
 */
public class LetterProcessImpl implements ILetterProcess {
    public void writeContext(String context){
        System.out.println("Letter context:" + context);
    }
    
    public void fillEnvelope(String address){
        System.out.println("Letter address:" + address);
    }
    
    public void letterIntoEnvelope(){
        System.out.println("Put letter into envelope");
    }

    public void sendLetter() {
        System.out.println("Send Letter...");
    }
}
