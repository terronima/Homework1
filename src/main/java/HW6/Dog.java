package HW6;

public class Dog extends Animal{

    public Dog (String name) {
        this.name = name;
    }

    @Override
    protected void run(int a) {
        if (a > 500) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println(this.name + " пробежал " + a + " m");
        }
    }

    @Override
    protected void swim(int a) {
        if (a > 10) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println(this.name + " проплыл " + a + " m");
        }
    }
}
