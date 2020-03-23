package singleton;

/**
 * 单例模式－饿汉式
 * @author: snowwolf-louis.
 * @date: 20/3/14.
 * @desc:
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    //类中其他方法尽量是静态类型
    public static void doSomething(){

    }
}
