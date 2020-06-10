package middle;


public class persontest {
    public static void main(String[] args) {
        person p = new person("小陈");
        p.toString();
        clothes hat = new hat();
        clothes shirt = new shirt();
        clothes jeans = new jeans();
        clothes shoes = new shoes();
        hat.show();
        shirt.show();
        jeans.show();
        shoes.show();
    }
}
