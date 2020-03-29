package abstract_factory;

/**
 * @author meixin
 */
public class FemaleBlackHuman extends AbstractBlackHuman implements Human{
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
