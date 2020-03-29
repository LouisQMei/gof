package factorymethod.simple;

public class YellowHuman extends Human {
    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void talk() {
        System.out.println("说话");
    }
}
