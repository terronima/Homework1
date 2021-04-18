package HW5;

public class HW5 {


    public static void main(String[] args) {
        Worker[] newArray = new Worker[5];
        newArray[0] = new Worker("Ivanov Ivan", "Seller", "ivan@gmail.com", 856457585, 70000, 45);
        newArray[1] = new Worker("Ivanov Viktor", "Seller", "ivan@gmail.com", 856457585, 50000, 32);
        newArray[2] = new Worker("Ivanov Ivan", "Seller", "ivan@gmail.com", 856457585, 70000, 55);
        newArray[3] = new Worker("Ivanov Ivan", "Seller", "ivan@gmail.com", 856457585, 70000, 40);
        newArray[4] = new Worker("Ivanov Vadim", "Seller", "ivan@gmail.com", 856457585, 80000, 35);
        for (Worker worker : newArray) {
            if (worker.getAge() > 40) {
                System.out.println(worker);
            }
        }
    }
}
