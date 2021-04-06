import java.awt.desktop.SystemSleepEvent;

public class HomeWork2 {
    static void SumInRange(int a, int b) {
        if ( a + b >= 10) {
            if (a + b <= 20) {
                System.out.println("true");
            }
        }
        else {
            System.out.println("False");
        }
    }

    static void IntSign(int a) {
        if (a >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }

    static boolean NegativeCheck(int a) {
        return a < 0;
    }
    static void PrintStringNTimes(String a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    static boolean LeapYear(int i) {
        if (i%4 == 0) {
            if (i%100 == 0) {
                return i % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(LeapYear(2009));
        PrintStringNTimes("yohoho", 5);
        System.out.println(NegativeCheck(0));
        IntSign(5);
    }
}
