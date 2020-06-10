
public class Facade {
    System1 s;
    System2 ss;
    System3 sss;
    public Facade() {
        s= new System1();
        ss = new System2();
        sss=new System3();

    }
    public void summethod(){
        s.A();
        ss.B();
        sss.C();
    }
}
