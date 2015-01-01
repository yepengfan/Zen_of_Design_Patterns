package zen.structure.facade;

/**
 * Created by yepengfan on 1/01/15.
 */
public class Client {
    public static void main(String[] args) {
        ModernPostOffice hellRoadPostOffice = new ModernPostOffice();
        String address = "Happy Road No. 666, God Province, Heaven";
        String context = "Hello. It's me. Do you know who I am? I'm your old lover.";
        hellRoadPostOffice.sendLetter(context, address);
    }
}
