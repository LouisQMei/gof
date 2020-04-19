package template_method;

public class Client {
    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        concreteClass1.templateMethod();

        AbstractClass concreteClass2 = new ConcreteClass2();
        concreteClass2.templateMethod();
    }
}
