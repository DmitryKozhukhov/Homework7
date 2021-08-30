package Homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n){
            food -= n;
            return true;
        } else System.out.println("В тарелке нет столько еды!!!");
        return false;
    }

    public void increaseFood(int a){
        food += a;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
