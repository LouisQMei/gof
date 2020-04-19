package builder.example;

import java.util.List;

/**
 * 建造者模式
 *
 * @author meixin
 */
public abstract class AbstractCarBuilder {
    /**
     * 设置组装顺序
     *
     * @param sequence
     */
    public abstract void setSequence(List<String> sequence);

    /**
     * 得到车辆模型
     *
     * @return
     */
    public abstract AbstractCarModel getCarModel();
}
