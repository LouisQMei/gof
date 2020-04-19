package builder.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆模型的抽象类
 * @author meixin
 */
public abstract class AbstractCarModel {
    /**
     * 这个参数是各个基本方法执行的顺序
     */
    private List<String> sequence = new ArrayList<>();

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alaram();

    /**
     * 发动机嗡鸣
     */
    protected abstract void engineBoom();

    final public void run(){
        for (String apart : sequence){
            switch (apart.trim().toLowerCase()){
                case "start":{
                    this.start();
                    break;
                }
                case "stop":{
                    this.stop();
                    break;
                }
                case "alarm":{
                    this.alaram();
                    break;
                }
                case "engine boom":{
                    this.engineBoom();
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }


    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
