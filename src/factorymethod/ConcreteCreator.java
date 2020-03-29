package factorymethod;

public class ConcreteCreator extends Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String,Enmu,Class等，当然也可以为空
     *
     * @param clazz
     */
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T)product;
    }
}
