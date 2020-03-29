package abstract_factory;

/**
 * @author meixin
 */
public class MaleYellowHuman extends AbstractYellowHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("男性黄种人");
    }
}
