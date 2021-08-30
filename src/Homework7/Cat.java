package Homework7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void satietyInfo() {
        System.out.println(name + "'s" + " satiety: " + satiety);
    }
}