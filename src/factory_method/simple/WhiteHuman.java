package factory_method.simple;

public class WhiteHuman extends Human {
    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public void talk() {
        System.out.println("say yes");
    }
}
