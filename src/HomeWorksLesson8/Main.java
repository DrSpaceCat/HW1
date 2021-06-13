package HomeWorksLesson8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        quiz();
        //new MyWindow();
    }
    public static void quiz(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String wordRandom = words[(int)(Math.random() * (words.length - 1))];
        System.out.println(wordRandom);

        int littleWord = 0;
        boolean ifAllTheLettersMatch = false;

        do{
            //Создаем динамическую строку, в которое будет записывать результат отгадывания слова
            StringBuilder truWord = new StringBuilder();

            //Сздаем сканер, для прочтения слова, которое вводит пользователь
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слова, используя только маленькие буквы: ");
            String wordUser = scanner.nextLine();

                //Определяем наименьше слова
                if (wordRandom.length() > wordUser.length()) {
                    littleWord = wordUser.length();

                } else littleWord = wordRandom.length();

                //Проверяем, совпадают ли слова
                if (wordRandom.equals(wordUser)) {
                    System.out.println("Вы победили");
                    return;
                    //Если не совпадают, то проверяем какие симвовы совпали
                } else {
                    for (int i = 0; i < littleWord; i++) {
                        //Добавляем совпавшие символы к динамической строке
                        if (wordRandom.charAt(i) == wordUser.charAt(i)) {
                            truWord.append(wordRandom.charAt(i));
                            ifAllTheLettersMatch = true;

                        }else
                        {
                            ifAllTheLettersMatch = false;
                            //К угаданным символам добаляем решетки
                            for (int j = (i + 1); j <= 15; j++) {
                                truWord.append('#');
                            }
                            System.out.println(truWord);
                            System.out.println("Вы не угадали");
                            break;
                        }
                    }
                }
                //Это проверка нужна, чтоюы выводить решетки, если все буквы которые ввели совпадают
                // с загаданным словом. Но при это эти буквы не составляют полностью слово.
                if (ifAllTheLettersMatch){
                    for (int j = (wordUser.length()); j < 15; j++) {
                        truWord.append('#');
                    }
                    System.out.println(truWord);
                    System.out.println("Вы не угадали");

                }


        }while (true);
    }
}
