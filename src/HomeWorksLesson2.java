public class HomeWorksLesson2 {
    public static void main(String[] args){
    boolean check = checkingNumbers(15,6);//1.Метод первого задания
        System.out.println(check);

    String num = fromZero(-10);//2.Метод второго задания
        System.out.println(num);

    boolean check2 = fromZeroBollean(-10);//3.Метод третьего задания
        System.out.println(check2);

    copyingString("Hello",10);//4.Метод четвертого задания

    leapYear(37);

    boolean year = leapYear(1300);//5.Метод пятого задания
    System.out.println(year);

    }



    public static boolean checkingNumbers(int a, int b){
        int sum = (a+b);
        if(sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }
    }

    public static String fromZero(int a){
        if(a>=0){
            return "Передали положительное число";
        }
        else{
            return "Передали отрицательное число";
        }
    }

    public static boolean fromZeroBollean(int a){
        if(a>=0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void copyingString(String a, int b){
        while (b>0){
            System.out.println(a);
            b--;
        }
    }

    public static boolean leapYear(int a){
        int c = a % 4;
        int d = a % 100;
        int f = a % 400;
        if( f == 0){
            return true;
        }else if( d == 0){
            return false;
        }else if( c == 0){
            return true;
        }else {
            return false;
        }


    }

}
