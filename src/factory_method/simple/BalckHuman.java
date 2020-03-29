package factory_method.simple;

public class BalckHuman extends Human {
    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public void talk() {
        System.out.println("balabala");
    }
}
