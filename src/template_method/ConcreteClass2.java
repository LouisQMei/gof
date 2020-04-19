package template_method;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("做一些事情...");
    }

    @Override
    protected void doOtherthing() {
        System.out.println("做另一些事...");
    }
}
