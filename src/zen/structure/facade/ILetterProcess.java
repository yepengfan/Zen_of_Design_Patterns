package zen.structure.facade;

/**
 * Created by yepengfan on 1/01/15.
 */
public interface ILetterProcess {
    public void writeContext(String context);
    public void fillEnvelope(String address);
    public void letterIntoEnvelope();
    public void sendLetter();
}
