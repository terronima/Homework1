package HW6;

public class Cat extends Animal{

    public Cat (String name) {
        this.name = name;
    }
    @Override
    protected void run(int a) {
        if (a > 200) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println(this.name + " пробежал " + a + " m");
        }
    }

    @Override
    protected void swim(int a) {
        System.out.println("Коты не умеют плавать (умеют но не любят)");
    }
}
