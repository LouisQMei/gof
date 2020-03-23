package singleton;

/**
 * @author: snowwolf-louis.
 * @date: 20/3/14.
 * @desc:
 */
public class Minister {

    public static void main(String[] args){
        int ministerNum = 100;
        for (int i = 1; i<= ministerNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+i+"位大臣参拜的是：");
            emperor.say();
        }
    }
}

