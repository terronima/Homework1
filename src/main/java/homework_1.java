import java.util.Scanner;

public class homework_1 {
    static void printThreeWords() {
        System.out.println("Выбран пункт напечатать 3 слова:");
        System.out.println("_Orangge");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбран пункт проверить знак суммы.");
        System.out.println("Введите число х:");
        int x = in.nextInt();
        System.out.println("Введите число у:");
        int y = in.nextInt();
        System.out.println("Результат:");
        if (x + y > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбран пункт напечатать цвет.");
        System.out.println("Введите число:");
        int value = in.nextInt();
        System.out.println("Результат:");
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбран пункт сравнить числа.");
        System.out.println("Введите число а:");
        int a = in.nextInt();
        System.out.println("Введите число b:");
        int b = in.nextInt();
        System.out.println("Результат:");
        String z = a >= b ? "a >= b" : "a < b";
        System.out.println(z);
    }

    public static int menu() {
        System.out.println("Вас приветствует меню, выберите один из пунктов:");
        System.out.println("1. Напечатать три слова");
        System.out.println("2. Проверить знак суммы");
        System.out.println("3. Вывести цвет");
        System.out.println("4. Сравнить числа");
        Scanner in = new Scanner(System.in);
        int selection = in.nextInt();
        return selection;
    }

    public static void main(String[] args) {
        int selection = 1;
        while (selection != 0) {
            selection = menu();
            if (selection == 1) {
                printThreeWords();
            }
            else if (selection == 2) {
                checkSumSign();
            }
            else if (selection == 3) {
                printColor();
            }
            else if (selection == 4){
                compareNumbers();
            }
            else if (selection == 0){
                System.out.println("Спасибо за работу, программа закрывается...");
            }
            else {
                System.out.println("Пожалуйста введите значение от 0 до 4, где 0 это выйти");
            }
        }

    }

}
