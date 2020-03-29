package abstract_factory;

/**
 * @author meixin
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public void talk() {
        System.out.println("say hi");
    }
}
