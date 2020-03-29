package abstract_factory;

/**
 * @author meixin
 */
public class FemaleYellowHuman extends AbstractYellowHuman implements Human{

    @Override
    public void getSex() {
        System.out.println("女性黄种人");
    }
}
