package abstract_factory;

/**
 * @author meixin
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void talk() {
        System.out.println("说中国话");
    }
}
