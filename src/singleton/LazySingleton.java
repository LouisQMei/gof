package singleton;

/**
 * @author: snowwolf-louis.
 * @date: 20/3/14.
 * @desc:
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class) {
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
