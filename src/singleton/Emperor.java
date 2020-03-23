package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式的变型－有上限的多例
 *
 * @author: snowwolf-louis.
 * @date: 20/3/13.
 * @desc:
 */
public class Emperor {
    private final static int MAX_NUM_OF_EMPEROR = 2;
    private static List<String> nameList = new ArrayList<>();

    private static List<Emperor> emperorList = new ArrayList<>();

    private int countNumOfEmperor = 0;

    static {
        for (int i =0;i<MAX_NUM_OF_EMPEROR;i++){
            emperorList.add(new Emperor("皇"+ i + "帝"));
        }
    }

    private Emperor(){

    }
    private Emperor(String name){
        nameList.add(name);
        countNumOfEmperor = nameList.size() - 1;
    }

    public static Emperor getInstance(){
        Random random = new Random();
        int countNumOfEmperor = random.nextInt(MAX_NUM_OF_EMPEROR);
        return emperorList.get(countNumOfEmperor);
    }

    public void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
