package builder;

/**
 * 建造者模式
 *
 * @author meixin
 */
public abstract class Builder {
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     * @return
     */
    public abstract Product buildProduct();
}
