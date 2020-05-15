public class OfficialFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return  new Official();
    }
}
