package Homework7;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(10);
        plate.increaseFood(90);

        Cat[] cat = new Cat[] {
                new Cat("Barsik", 5, false),
                new Cat("Zefir", 10, false),
                new Cat("Vaflya", 20, false),
                new Cat("Pryanik", 40, false),
                new Cat("Vaska", 40, false)
        };

        for (int i = 0; i < cat.length; i++) {
            plate.info();
            cat[i].eat(plate);
            plate.info();
            cat[i].satietyInfo();
        }
    }
}
