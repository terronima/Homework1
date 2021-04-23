package HW5;

public class Worker {
    private String name;
    private String occupancy;
    private String email;
    private int cellPhone;
    private int salary;
    private int age;

    public Worker(String name, String occupancy, String email, int cellPhone, int salary, int age) {
        this.name = name;
        this.occupancy = occupancy;
        this.email = email;
        this.cellPhone = cellPhone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", occupancy='" + occupancy + '\'' +
                ", email='" + email + '\'' +
                ", cellPhone=" + cellPhone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
