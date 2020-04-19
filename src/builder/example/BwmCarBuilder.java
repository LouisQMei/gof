package builder.example;

import java.util.List;

/**
 * @author meixin
 */
public class BwmCarBuilder extends AbstractCarBuilder {
    private BwmCarModel bwn = new BwmCarModel();

    /**
     * 设置组装顺序
     *
     * @param sequence
     */
    @Override
    public void setSequence(List<String> sequence) {
        this.bwn.setSequence(sequence);
    }

    /**
     * 得到车辆模型
     *
     * @return
     */
    @Override
    public BwmCarModel getCarModel() {
        return this.bwn;
    }
}
