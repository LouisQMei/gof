package abstract_factory;

/**
 * @author meixin
 */
public abstract class AbstractBlackHuman implements Human{
    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public void talk() {
        System.out.println("bala bala");
    }
}
