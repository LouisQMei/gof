package factorymethod.singleton;

import singleton.Singleton;

import java.lang.reflect.Constructor;

/**
 * 替代单例模式
 * @author meixin
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton)constructor.newInstance();
        }catch (Exception e){

        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
