package template_method;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("do something...");
    }

    @Override
    protected void doOtherthing() {
        System.out.println("do otherthing...");
    }
}
