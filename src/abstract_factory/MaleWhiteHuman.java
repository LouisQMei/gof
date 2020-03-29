package abstract_factory;

/**
 * @author meixin
 */
public class MaleWhiteHuman extends AbstractWhiteHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
