package 雷锋工厂方法模式;


public class company_factory implements leifeng_factory {
    @Override
    public leifeng createleifeng() {
        return new company();
    }
}
