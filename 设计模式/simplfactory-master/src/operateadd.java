/**
 * 功能描述
 
 **/
public class operateadd extends operate {
    @Override
    public double getresult() {
        double reslut = 0;
        reslut = getA()+getB();
        return  reslut;
    }
}
