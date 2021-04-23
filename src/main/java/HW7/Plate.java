package HW7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Еды осталось: " + food);
    }

    public boolean decreaseFood(int appetite) {
        if (this.food >= appetite) {
        this.food -=  appetite;
        } else {
            System.out.println("Не достаточно еды, в тарелке осталось "+
                    food + " еды. Коту требуется " + appetite + " еды.");
            return false;
        }
        return true;
    }

    public void addFoodToPlate(Cat cat) {
        Scanner in = new Scanner(System.in);
        System.out.print("Коту" +cat.getName() + " не хватило еды. Пожалуйста добавьте "+ (cat.getAppetite() - this.food) + " еды в тарелку: ");
        int a = in.nextInt();
        this.food += a;
    }
}
