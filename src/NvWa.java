public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = null;
        //创建黑人
        factory = new BlackHumanFactory();
        Man blackMan = factory.createMan();
        blackMan.printColor();
        blackMan.printGender();
        Woman blackWoman = factory.createWoman();
        blackWoman.printColor();
        blackWoman.printGender();
    }
}
