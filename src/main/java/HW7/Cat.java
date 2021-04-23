package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate food) {
        this.fed = food.decreaseFood(this.appetite);
        if (fed) {
            System.out.println("Кот " + this.name + " покушал и не голоден");
        } else {
            System.out.println("Кот " + this.name + " не покушал и все еще голоден");
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFed() {
        return fed;
    }
}
