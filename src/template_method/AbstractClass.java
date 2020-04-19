package template_method;

/**
 * 模板方法模式
 *
 * @author meixin
 */
public abstract class AbstractClass {
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doOtherthing();

    /**
     * 模板方法
     */
    public void templateMethod() {
        /**
         * 调用基本方法，完成先关逻辑
         */

        this.doSomething();
        this.doOtherthing();
    }

}
