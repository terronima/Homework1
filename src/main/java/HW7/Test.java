package HW7;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vaska", 10);
        cats[1] = new Cat("Buska", 8);
        cats[2] = new Cat("Ivan", 15);
        cats[3] = new Cat("Cote", 5);
        cats[4] = new Cat("Filka", 12);
        for (Cat cat : cats) {
            cat.eat(plate);
            if (!cat.isFed()) {
                plate.addFoodToPlate(cat);
                cat.eat(plate);
            }

        }
    }
}
