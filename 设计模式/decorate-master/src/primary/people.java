package primary;


public class people {
    private String name;

    public people(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.print(name);
        return name;
    }

    public void hat(){
        System.out.println("带了帽子");
    }

    public void shirt(){
        System.out.println("穿件T恤");
    }

    public void jeans(){
        System.out.println("穿了个牛仔裤");
    }

    public void shoes(){
        System.out.println("穿鞋子");
    }
}
