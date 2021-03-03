package HomeWork7;


public class Cat {
    private final String name;
    private final int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}
