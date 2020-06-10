package middle;


public class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println(name);
        return name;
    }
}
