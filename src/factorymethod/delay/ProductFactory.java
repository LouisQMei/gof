package factorymethod.delay;

import factorymethod.Product;
import factorymethod.Product1;
import factorymethod.Product2;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 *
 * spring 的单例
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>(16);

    public static synchronized Product createProduct(String type) throws Exception{
        Product product = null;

        if (prMap.containsKey(type)){
            product = prMap.get(type);
        }else {
            if (type.equals("Product1")){
                product = new Product1();
            }else {
                product = new Product2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
