package HomeWorksLesson6;

public class HomeWorksLesson6 {
    public static void main(String[] args){

        Animal catBarsik = new Cat("Барсик");
        Animal catJorik = new Cat("Жорик");
        Animal dogRex = new Dog("Рекс");
        Animal dogMuhtar = new Dog("Мухтар");


        catBarsik.animalRunning(150);
        catBarsik.animalSwimming(2);

        catJorik.animalSwimming(10);
        catJorik.animalRunning(20);

        dogRex.animalSwimming(10);
        dogRex.animalRunning(150);

        dogMuhtar.animalRunning(60);
        dogMuhtar.animalSwimming(12);


        Cat.printCatCount();

        Dog.printDogCount();

        Animal.printAnimalCount();
    }
}
