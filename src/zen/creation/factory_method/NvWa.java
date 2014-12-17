package zen.creation.factory_method;

/**
 * Created by yepengfan on 17/12/14.
 */
public class NvWa {
    public static void main(String[] args){
        AbstractHumanFactory YinYangLu = new HumanFactory();
        System.out.println("---Generating White Man---");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("---Generating Black Man---");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("---Generating Yellow Man---");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
