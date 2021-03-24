public class Main {
    public static void main (String[] args){

        sumNumbers(14,9);
        System.out.println(checkNumbers(-13));
        numChecking(13);
        cycleString(3, "Hi");
        year(2000);
    }

    public static boolean sumNumbers(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    public static String checkNumbers(int a){
        if(a > 0)
            return "Число положительное!";
        else
            return "Число отрицательное!";
    }

    public static boolean numChecking(int a){
        if(a < 0)
            return true;
        else
            return false;
    }

    public static void cycleString(int a, String string){
        for(int i = 0; i < a; i++){
            System.out.println(string);
        }
    }

    public static boolean year (int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }
}
