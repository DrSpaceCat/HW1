import java.util.Random;
import java.util.Scanner;

public class HomeWorksLesson3 {
    public static void main(String[]args){
        //arrayTask1();
        //------------
        //arrayTask2();
        //------------
        //arrayTask3();
        //------------
        //arrayTask4();
        //------------
        //for(int num : arrayTask5(10,15)){System.out.println("Цифра в ячейке: " + num);}
        //------------
        //arrayTask6();
        //int[]a = {6,3,3,8,4,3,3,1,9,12,13,14,25,14,88,64,14,25,85,4,65,11,25,76,99,42,13,54,12,65};
        //------------
        //boolean c = arrayTask7(a);
        //System.out.println(c);
        //------------
        //int[] array = {2,3,4,5};
        //arrayTask8(array,-8);

    }
    //Первое задание
    public static void arrayTask1(){

        int[] invertedArray = {1,0,1,1,0,1,0,0,0,1,0};

        for(int i = 0; i < invertedArray.length; i++){
            System.out.print(invertedArray[i] + " заменен на ");
            if( invertedArray[i] == 1 ){
                invertedArray[i] = 0;
            }
            else invertedArray[i] = 1;

            System.out.println(invertedArray[i]);
        }
    }

    //Второе задание
    public static void arrayTask2(){

        int[] array_1to100 = new int[100];

        for(int i = 0; i < array_1to100.length; i++){
            array_1to100[i] = (i + 1);

            System.out.println(array_1to100[i]);
        }
    }

    //Третье задание
    public static void arrayTask3(){

        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < a.length; i++){

            System.out.print(a[i] + " после проверки ");

            if(a[i] < 6){
                a[i] *= 2;
            }

            System.out.println(a[i]);
        }
    }

    //Четвертое задание
    public static void arrayTask4(){
        int[][] diagonalArray = new int[5][5];

        for(int i = 0; i < diagonalArray.length; i++){

            for(int j = 0; j < diagonalArray[i].length; j++){
                if( (i == j) || (( i + j ) == (diagonalArray.length - 1))){
                    diagonalArray[i][j] = 1;
                }

                System.out.print(" " + diagonalArray[i][j] + " ");

            }System.out.println();
        }
    }

    //Пятое задание
    public static int[] arrayTask5(int len, int initialValue){
        int[] arrayInitialValue = new int[len];

        for(int i = 0; i < arrayInitialValue.length; i++){
            arrayInitialValue[i] = initialValue;
        }

        return arrayInitialValue;
    }

    //Шестое задание
    public static void arrayTask6(){

        int[] arrayMinMax ={4,55,61,3,2,34,5,10,2123,231,32,44,0};

        int max = arrayMinMax[0];
        int min = arrayMinMax[0];

        for(int i = 1; i < arrayMinMax.length; i++){
            if(max < arrayMinMax[i]){
                max = arrayMinMax[i];
            }
            if(min > arrayMinMax[i]){
                min = arrayMinMax[i];
            }
        }

        System.out.println(max + " - маскимальное значение" + '\n' + min + " - минимальное значение");
    }

    //Седьмое задание
    public static boolean arrayTask7(int[]a){
        //Объявляем переменную, в которую будем записывать сумму всех чисел в массиве
        int sumArrayChecking = 0;
        //Находим сумму
        for (int i = 0; i < a.length; i++){
            sumArrayChecking += a[i];
        }
        //Проверяем массив. Подходит ли он, для работы с ним далее.
        if(a.length == 0 || a.length <= 3|| sumArrayChecking == 0 ){
            System.out.println("Неправильный массив!!!");
            return false;
        }
        else{
            for(int border = 2; border < (a.length-2); border++){
                int sumLeft = 0;
                int sumRight  = 0;
                for(int startRight = border; startRight < a.length; startRight++){
                    sumRight += a[startRight];
                }
                for(int startLeft = 0; startLeft < border; startLeft++){
                    sumRight += a[startLeft];
                }
                System.out.println("Первая половина - " + sumLeft);
                System.out.println("Вторая половина - " + sumRight);
                if(sumLeft == sumRight){

                    return true;
                }
            }
        }
        return false;
    }

    //Восьмое задание
    public static void arrayTask8(int[]array, int shift ){
        int[] outputArray = new int[array.length];
        if (shift < 0) {
            outputArray = leftShift(array, shift);
        } else {
            outputArray = shiftRight(array, shift);
        }
        for(int i = 0; i < outputArray.length;i++){
            System.out.print( outputArray[i] + " ");
        }
    }
    private static int[] leftShift(int[] array, int shift) {
        int length = array.length;
        int current;
        int next;
        shift %= array.length; //проверка для того, что бы не делать лишние цикличные циклы
        shift *= -1;

        for (int i = 0; i < shift; i++) {
            for (int k = 0; k < length - 1; k++) {
                current = array[k];
                next = k + 1;

                if (k + 1 > length - 1) {
                    next = 0;
                }
                array[k] = array[next];
                array[next] = current;
            }
        }
        return array;
    }
    private static int[] shiftRight(int[] array, int shift) {
        int length = array.length - 1;
        int current;
        int prev;
        shift %= array.length; //проверка для того, что бы не делать лишние цикличные циклы

        for (int i = 0; i < shift; i++) {
            for (int k = length; 0 <= k; k--) {
                current = array[k];
                prev = k - 1;

                if (k - 1 < 0) {
                    prev = 0;
                }
                array[k] = array[prev];
                array[prev] = current;
            }
        }
        return array;
    }
}
