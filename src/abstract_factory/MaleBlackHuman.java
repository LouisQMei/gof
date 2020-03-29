package abstract_factory;

public class MaleBlackHuman extends AbstractBlackHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
