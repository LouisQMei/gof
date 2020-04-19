package builder.example;

public class BenzCarModel extends AbstractCarModel {
    /**
     * 启动
     */
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子的");
    }

    /**
     * 停止
     */
    @Override
    protected void stop() {
        System.out.println("奔驰车停下来是这个样子的");
    }

    /**
     * 鸣笛
     */
    @Override
    protected void alaram() {
        System.out.println("奔驰车鸣笛是这个样子的");
    }

    /**
     * 发动机嗡鸣
     */
    @Override
    protected void engineBoom() {
        System.out.println("奔驰车发动机叫是这个样子的");
    }
}
