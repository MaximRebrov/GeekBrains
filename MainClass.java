import java.util.Random;
import java.util.Scanner;

public class MainClass{
    public static char[][] map;
    public static final int DOT_TO_WINER = 4;
    public static final int SIZE = 5;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main (String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkValid(DOT_X)) {
                System.out.println("Ты победил!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            compTurn();
            if (checkValid(DOT_0)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты X Y :");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x, y));
            map[x][y] = DOT_X;
            printMap();
    }

    public static void compTurn(){
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x, y));
        map[x][y] = DOT_0;
        System.out.println();
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        printMap();
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++) {
                map[i][j] += DOT_EMPTY;
            }
        }
    }

    public static void printMap (){
        for(int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < SIZE; i++){
            System.out.print(i + 1 + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static boolean isCellValid (int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if(map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean checkValid (char arg) {
        int diagWin = 0;
        int result = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (arg == map[i][j] )
                    result++;
            }
            if(DOT_TO_WINER == result)
                return true;
            result = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(arg == map[i][map[i].length - 1 - i]) {
                    diagWin++;
                    break;
                }
                if (i == j && arg == map[i][j]) {
                    diagWin++;
                    break;
                }
            }
            if(DOT_TO_WINER == diagWin)
                return true;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (arg == map[j][i] )
                    result++;
            }
            if(DOT_TO_WINER == result)
                return true;
            result = 0;
        }
        return false;
    }
    public static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }
}

