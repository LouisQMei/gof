package abstract_factory;

public class Nvwa {
    public static void main(String[] args) {
        HumanFactory humanFactory = new MaleFactory();
        Human yellowHuman = humanFactory.createYellowHuman();
        System.out.println(yellowHuman.getColor());
        yellowHuman.talk();
        yellowHuman.getSex();
    }
}
