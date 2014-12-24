package zen.behaviour.command;

/**
 * Created by yepengfan on 24/12/14.
 */
public class Client {
    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
        System.out.println("---client wants to add a requirement---");
        Command command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
