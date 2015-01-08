package zen.structure.bridge;

/**
 * Created by yepengfan on 8/01/15.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("----Real estate company runs----");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");
//        System.out.println("----Clothing company runs----");
//        ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();
        System.out.println("----Product company runs----");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
