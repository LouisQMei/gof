package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例注册表管理单例
 * 可以管理多个单例
 *
 * @author: snowwolf-louis.
 * @date: 20/3/14.
 * @desc:
 */
public class SingletonManager {
    private static Map<String,Object> objectMap = new ConcurrentHashMap<>();

    private SingletonManager(){

    }

    public static void registerService(String key,Object instance){
        if (!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
