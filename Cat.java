package LessonSeven;

public class Cat {

    protected String name;
    protected int appetite;
    protected int satiety;
    protected boolean full;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat(Plate x) {
        full = x.decreaseFood(name, appetite, satiety);
    }
}
