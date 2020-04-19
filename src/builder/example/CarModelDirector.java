package builder.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演类，向场景类封装建造者细节
 *
 * @author meixin
 */
public class CarModelDirector {
    private List<String> sequence = new ArrayList<>();
    private BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
    private BwmCarBuilder bwmCarBuilder = new BwmCarBuilder();

    public BenzCarModel getABenzCarModel() {
        this.sequence.clear();

        this.sequence.add("start");

        this.sequence.add("alarm");

        this.sequence.add("stop");

        benzCarBuilder.setSequence(sequence);
        return benzCarBuilder.getCarModel();
    }

    public BenzCarModel getBBenzCarModel() {
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.sequence.add("stop");

        benzCarBuilder.setSequence(sequence);
        return benzCarBuilder.getCarModel();
    }


    public BwmCarModel getCBwmCarModel() {
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");

        bwmCarBuilder.setSequence(sequence);
        return bwmCarBuilder.getCarModel();
    }


    public BwmCarModel getDBwmCarModel() {
        this.sequence.clear();

        this.sequence.add("engine boom");
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");

        bwmCarBuilder.setSequence(sequence);
        return bwmCarBuilder.getCarModel();
    }

    public static void main(String[] args) {
        //场景
        CarModelDirector director = new CarModelDirector();
        BenzCarModel abenz = director.getABenzCarModel();
        abenz.run();

        System.out.println("--------------------------");
        BwmCarModel aBwm = director.getCBwmCarModel();
        aBwm.run();

    }
}
