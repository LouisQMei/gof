package builder;

/**
 * 导演类
 * @author meixin
 */
public class Director {
    private Builder builder = new ConcreteProductBuilder();

    /**
     * 设置不同的零件产生不同的产品
     * @return
     */
    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }

    public Product getBProduct(){
        builder.setPart();
        return builder.buildProduct();
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.getAProduct();
    }
}
