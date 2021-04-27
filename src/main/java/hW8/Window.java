package hW8;


//import com.sun.glass.ui.Size;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Random;
import java.util.Scanner;


public class Window extends JFrame {
    private static final ImageIcon DEFAULT = new ImageIcon("def.png");
    private static final ImageIcon ICON_X = new ImageIcon("x.png");
    private static final ImageIcon ICON_O = new ImageIcon("o.png");
    private JButton[][] map;
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] charMap = new char[SIZE][SIZE];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public Window() throws HeadlessException {
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3,3));
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                charMap[i][j] = DOT_EMPTY;
            }
        }
        printMap();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                map[i][j].setIcon(DEFAULT);
                JButton cur = map[i][j];
                panel.add(cur);
                int finalI = i;
                int finalJ = j;
                cur.addActionListener(a -> {
                    //cur.setDisabledIcon(ICON_X);
                    cur.setIcon(ICON_X);
                    cur.setEnabled(false);
                    charMap[finalI][finalJ] = DOT_X;
                    if (isMapFull() || checkWin(DOT_X)) {
                        dispose();
                        System.out.println("Игрок выиграл!");
                    }
                    printMap();
                    movePC();
                    if (isMapFull() || checkWin(DOT_O)) {
                        dispose();
                        System.out.println("Компьютер выиграл!");
                    }
                    printMap();
                });

            }

        }
        add(panel);
        setVisible(true);
    }

    private void movePC() {
        int i, j;
        do {
            i = rand.nextInt(SIZE);
            j = rand.nextInt(SIZE);
        } while (!isCellValid(i, j));
        map[i][j].setDisabledIcon(ICON_O);
        map[i][j].setIcon(ICON_O);
        map[i][j].setEnabled(false);
        charMap[i][j] = DOT_O;
    }


    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            boolean hor = true, ver = true, d1 = true, d2 = true;
            for (int j = 0; j < SIZE; j++) {
                hor &= charMap[i][j] == symb;
                ver &= charMap[j][i] == symb;
                d1 &= charMap[j][j] == symb;
                d2 &= charMap[j][SIZE-j-1] == symb;
            }
            if (hor || ver || d1 || d2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (charMap[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

//    public static void aiTurn() {
//        int x, y;
//        do {
//            x = rand.nextInt(SIZE);
//            y = rand.nextInt(SIZE);
//        } while (!isCellValid(x, y));
//        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
//        charMap[y][x] = DOT_O;
//    }

//    public static void humanTurn() {
//        int x, y;
//        do {
//            System.out.println("Введите координаты в формате X Y");
//            x = sc.nextInt() - 1;
//            y = sc.nextInt() - 1;
//        }  while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
//        charMap[y][x] = DOT_X;
//    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (charMap[x][y] == DOT_EMPTY) return true;
        return false;
    }

//    public static void initMap() {
//        charMap = new char[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                charMap[i][j] = DOT_EMPTY;
//            }
//        }
//    }
//
    public static void printMap() {
        //   for (int i = 0; i <= SIZE; i++) {
        //       System.out.print(i + " ");
        //  }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            // System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(charMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Window();
    }
}

