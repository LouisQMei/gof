package abstract_factory;

/**
 * @author meixin
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
