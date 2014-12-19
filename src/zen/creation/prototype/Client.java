package zen.creation.prototype;

import java.util.Random;

/**
 * Created by yepengfan on 20/12/14.
 */
public class Client {
    private static int MAX_COUNT = 6;
    public static void main(String[] args){
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx Bank Copyright");
        while(i < MAX_COUNT){
//            mail.setAppellation(getRandString(5) + "Sir(Lady)");
//            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "Sir(Lady)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            i++;
        }
    }
    public static void sendMail(Mail mail){
        System.out.println("Title:" + mail.getSubject() + "\t Receiver:" + mail.getReceiver() + "\t sent successfully.");
    }
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
