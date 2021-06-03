import java.util.Random;
import java.util.Scanner;

public class HomeWorksLesson4 {

    public static char[][] map;
    public static final int SIZE = 5;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args){
        //1.Инициализация поля
        initMap();
        //2.Вывод поля
        printMap();

        //3.Цикл
        while (true){
            //Итерация:

            //3.1 Ход игрока
            humanTurn();
            //Вывод поля
            printMap();
            //  3.2 Проверка победы(продолжение или выход)
            if(isWinner(DOT_X)){
                System.out.println("Победа игрока!");
                break;
            }
            //  3.3 Проверка ничьи(продолжение или выход)
            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            //3.4 Ходи комьютера
            aiTurn();
            //вывод поля
            printMap();
            //  3.5 Проверка победы(продолжение или выход)
            if(isWinner(DOT_O)){
                System.out.println("Компудастер победил!");
                break;
            }
            //  3.6 Проверка ничьи(продолжение или выход)
            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Матч закончен!");
    }
    //1.Инициализация поля
    public static void  initMap(){
         map = new char[SIZE][SIZE];
         for (int i = 0;i < SIZE; i++){
             for(int j = 0; j < SIZE; j++){
                 map[i][j] = DOT_EMPTY;
             }
         }
    }

    //2.Вывод поля
    public static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //3.1 Ход игрока
    public static void humanTurn(){
        Scanner scanner  = new Scanner(System.in);

        int x;
        int y;

        do{
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x,y));

        map[y][x] = DOT_X;
    }
    //3.2 Ход компудастера
    public static void aiTurn(){
        Random random = new Random();

        int x;
        int y;

        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x,y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y){
        if(x < 0 || x>= SIZE || y < 0 || y>=SIZE){
            return false;
        }

        if (map[y][x] == DOT_EMPTY){
            return true;
        }

        return false;
    }

    //Проверка победы
    public static boolean isWinner(char symb){

        for(int i = 0; i < SIZE; i++) {

            if (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb ||
                    map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb){

                return true;

            }else if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb&& map[3][i] == symb ||
                    map[1][i] == symb && map[2][i] == symb && map[3][i] == symb&& map[4][i] == symb){

                return true;

            }
        }
        //По диагонали слева направа
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb) {
            return true;
        }
        if(map[1][1] == symb && map[2][2] == symb && map[3][3] == symb && map[4][4] == symb) {
            return true;
        }
        if(map[0][1] == symb && map[1][2] == symb && map[2][3] == symb && map[3][4] == symb) {
            return true;
        }
        if(map[1][0] == symb && map[2][1] == symb && map[3][2] == symb && map[4][3] == symb) {
            return true;
        }

        //По диагонали справо налево
        if(map[0][4] == symb && map[1][3] == symb && map[2][2] == symb && map[3][2] == symb) {
            return true;
        }
        if(map[1][3] == symb && map[2][2] == symb && map[3][1] == symb && map[4][0] == symb) {
            return true;
        }
        if(map[0][3] == symb && map[1][2] == symb && map[2][1] == symb && map[3][0] == symb) {
            return true;
        }
        if(map[1][4] == symb && map[2][3] == symb && map[3][2] == symb && map[4][1] == symb) {
            return true;
        }

        return false;
    }







    //Проверка ничьи
    public static boolean isMapFull(){
        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

}
