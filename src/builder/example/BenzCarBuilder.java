package builder.example;

import java.util.List;

/**
 * @author meixin
 */
public class BenzCarBuilder extends AbstractCarBuilder{
    private BenzCarModel benz = new BenzCarModel();

    /**
     * 设置组装顺序
     *
     * @param sequence
     */
    @Override
    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);
    }

    /**
     * 得到车辆模型
     *
     * @return
     */
    @Override
    public BenzCarModel getCarModel() {
        return this.benz;
    }
}
