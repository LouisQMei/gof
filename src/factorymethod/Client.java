package factorymethod;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(Product2.class);

        product.method2();
    }
}
