package factorymethod.simple;

public abstract class Human {

//    /**
//     * 终极极简写法
//     *
//     * @param humanClass
//     * @param <T>
//     * @return
//     */
//    public static <T extends Human> T createHuman(Class<T> humanClass) {
//        T human = null;
//        try {
//            human = (T) Class.forName(humanClass.getName()).newInstance();
//        } catch (Exception e) {
//            System.out.println("传入的非人类");
//        }
//
//        return huma;
//    }

    public void method() {
        //通用方法
    }

    public abstract String getColor();

    public abstract void talk();
}
