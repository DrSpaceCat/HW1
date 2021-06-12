package HomeWorksLesson7;

public class Main {
    public static void main(String[] args){

        Plate plate = new Plate(30);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Барсик", 15);
        catsArray[1] = new Cat("Жора", 20);
        catsArray[2] = new Cat("Леопольд", 10);
        catsArray[3] = new Cat("Сашка", 20);
        catsArray[4] = new Cat("Жорик", 25);

        for (Cat cats : catsArray)
        {
            cats.eat(plate);
        }

        plate.increaseFood(80);

        for (Cat cats : catsArray)
        {
            cats.eat(plate);
        }

    }
}
