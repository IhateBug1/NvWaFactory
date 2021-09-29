//黑人工厂
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Man createMan() {
        return new BlackMan();
    }

    @Override
    public Woman createWoman() {
        return new BlackWoman();
    }
}
