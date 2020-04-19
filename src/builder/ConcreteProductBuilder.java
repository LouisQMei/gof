package builder;

public class ConcreteProductBuilder extends Builder {
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    @Override
    public void setPart() {
        System.out.println("设置产品的不同部分，以获得不同的产品");
    }

    /**
     * 建造产品
     *
     * @return
     */
    @Override
    public Product buildProduct() {
        return new Product();
    }
}
