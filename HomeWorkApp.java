public class HomeWorkApp {

    public static void main (String[] args){
        String fruit = "Orange\nBanana\nApple";
        int a = 9;
        int b = 3;
        int value = 144;
        printThreeWords(fruit);
        System.out.println();
        checkSumSing(a, b);
        System.out.println();
        printColor(value);
        System.out.println();
        compareNumbers(a, b);
    }

    public static void printThreeWords(String fruit){
        System.out.println(fruit);
    }

    public static void checkSumSing(int a, int b){
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor(int value){
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <=100)
            System.out.println("Жёлтый");
        else
            System.out.println("Зелёный");
    }

    public static void compareNumbers(int a, int b){
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
