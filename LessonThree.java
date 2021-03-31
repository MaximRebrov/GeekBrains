public class LessonThree {

    public static void main (String[] args) {
        int[] len = new int[7];
        int[] arr = new int[]{3, 8, 4, 1, 2, 5, 7, 2};
        boolean result = false;
        replaceNumbersArray();
        fillArray();
        multiplyingByTwo();
        diagonalArray();
        returnArray(len, 4);
        minAndMaxNumber();
        result = arrayBalance(arr, result);
        System.out.println(result);
    }

    public static void replaceNumbersArray(){
        int[] arr = new int[]{0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] += 1;
            else
                arr[i] -= 1;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void fillArray (){
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++){
            array100[i] = i + 1;
            System.out.print(array100[i] + ", ");
        }
        System.out.println();
    }

    public static void multiplyingByTwo(){
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6)
            System.out.print(array[i] * 2 + ", ");
        }
        System.out.println();
    }

    public static void diagonalArray(){
        int[][] arr = new int[6][6];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                 if(i == j)
                     arr[i][j] = 1;
                 else
                     arr[i][j] = 0;
                     System.out.print(arr[i][j] + "  ");
                 }
            System.out.println();
        }
    }

    public static int[] returnArray(int[] len, int initialValue){
        for(int i = 0; i < len.length;i++){
            len[i] += initialValue;
            System.out.print(len[i] + ", ");
        }
        System.out.println();
        return len;
    }

    public static void minAndMaxNumber(){
        int[] array = new int[]{5, 7, 10, 3, 9, 16, 1};
        int min = 0;
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            else
                min = array[i];
        }
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиые: " + max);
    }
    
    public static boolean arrayBalance(int[] arr, boolean result){
        int sum = 0;
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        for(int j = 0; j < arr.length; j++){
            x += arr[j];
            if(sum / 2 == x)
                break;
        }
        return true;
    }
}

