package singleton;

/**
 * 静态内部类单例
 *
 * @author: snowwolf-louis.
 * @date: 20/3/14.
 * @desc:
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    private static class SingletonHolder {
        public static final StaticInnerClassSingleton sinstance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.sinstance;
    }
}
