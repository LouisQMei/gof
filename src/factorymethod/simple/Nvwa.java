package factorymethod.simple;

/**
 * 场景类
 */
public class Nvwa {
    public static void main(String[] args) {
        Human human = HumanFactory.createHuman(BalckHuman.class);
        System.out.println(human.getColor());
        human.talk();
    }
}
