package HomeWorksLesson5;

public class HomeWorksLesson5 {
    public static void main(String[] args){

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Иванов Иван Иванович", "Слесарь","ivanovII@mail.ru", "89664512247", 35000, 30);
        workArray[1] = new Worker("Косов Александр Геннадьевич", "Бухгалтер","kosovAG@mail.ru", "89661655524", 40000, 42);
        workArray[2] = new Worker("Пушкин Александр Сергеевич", "Менеджер","pushkinAS@mail.ru", "89116585444", 55000, 30);
        workArray[3] = new Worker("Николаев Игирь Сергеевич", "Сварщик","nikIs@mail.ru", "89332652114", 33000, 50);
        workArray[4] = new Worker("Сижоров Семён Витальевич", "Инженер","sidSv@mail.ru", "81554866334", 50000, 45);

        for(int i = 0; i < workArray.length; i++){
            if(workArray[i].age>40){
                System.out.println(workArray[i].fullName + ", " + workArray[i].post + ", " + workArray[i].email + ", " +
                        workArray[i].phone + ", " +workArray[i].pay + ", " +workArray[i].age);
            }
        }

    }
}
