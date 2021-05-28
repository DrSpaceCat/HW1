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
        //int[] array = {2,3,4,5,10,11,12};
        //arrayTask8(array,-14);

    }
    //Первое задание
    public static void arrayTask1(){
        int[] a = {1,0,1,1,0,1,0,0,0,1,0};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " заменен на ");
            if(a[i] == 1 ){
                a[i] = 0;
            }else a[i] = 1;
            System.out.println(a[i]);
        }
    }

    //Второе задание
    public static void arrayTask2(){
        int[] a = new int[100];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
            System.out.println(a[i]);
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
        int[][] a = new int[5][5];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if( (i == j) || (( i + j ) == (a.length - 1))){
                    a[i][j] = 1;
                }
                System.out.print(" " + a[i][j] + " ");
            }System.out.println();
        }
    }

    //Пятое задание
    public static int[] arrayTask5(int len, int initialValue){
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = initialValue;
        }
        return a;
    }

    //Шестое задание
    public static void arrayTask6(){
        int[] a ={4,55,61,3,2,34,5,10,2123,231,32,44,0};
        int max = a[0];
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println(max + " - маскимальное значение" + '\n' + min + " - минимальное значение");
    }

    //Седьмое задание
    public static boolean arrayTask7(int[]a){
        int sumA = 0;
        for (int i = 0; i < a.length; i++){
            sumA += a[i];
        }
        if(a.length == 0 || a.length <= 3|| sumA == 0 ){
            System.out.println("Неправильный массив!!!");
            return false;
        }
        else{
            for(int mid = 2; mid < (a.length-2); mid++){
                int sum1 = 0;
                int sum2 = 0;
                for(int mid2 = mid; mid2 < a.length; mid2++){
                    sum2 += a[mid2];
                }
                for(int first = 0; first < mid; first++){
                    sum1 += a[first];
                }
                System.out.println("Первая половина - " + sum1);
                System.out.println("Вторая половина - " + sum2);
                if(sum1 == sum2){

                    return true;
                }
            }
        }
        return false;
    }

    //Восьмое задание
    public static void arrayTask8(int[]array, int n ){
        int[] c = new int[array.length];
        if (n < 0) {
            c = negative(array, n);
        } else {
            c = positive(array, n);
        }
        for(int i = 0; i < c.length;i++){
            System.out.print( c[i] + " ");
        }
    }
    private static int[] negative(int[] array, int n) {
        int length = array.length;
        int current;
        int next;
        n %= array.length; //проверка для того, что бы не делать лишние цикличные циклы
        n *= -1;

        for (int i = 0; i < n; i++) {
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
    private static int[] positive(int[] array, int n) {
        int length = array.length - 1;
        int current;
        int prev;
        n %= array.length; //проверка для того, что бы не делать лишние цикличные циклы

        for (int i = 0; i < n; i++) {
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
