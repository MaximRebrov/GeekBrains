public class HomeWorkApp {

    public static void main (String[] args){
        printThreeWords();
        checkSumSing(5, 14);
        printColor(144);
        compareNumbers(30, 7);
    }

    public static void printThreeWords(){
        System.out.println("_Orange\n_Banana\n_Apple");
    }

    public static void checkSumSing(int a, int b){
        if (a + b >= 0)
            System.out.println ("Сумма положительная");
        else
            System.out.println ("Сумма отрицательная");
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
