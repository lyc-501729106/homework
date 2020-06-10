package 雷锋工厂方法模式;


public class undergraduate_factory implements leifeng_factory {
    @Override
    public leifeng createleifeng() {
        return new undergraduate();
    }
}
