package factorymethod.simple;

/**
 * @author meixin
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> humanClass){
        T human = null;
        try {
            human = (T) Class.forName(humanClass.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("传入的非人类");
        }

        return human;
    }
}
