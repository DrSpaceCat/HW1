package HomeWorksLesson6;

public abstract class Animal {
    protected String name;
    static int count = 0;

    Animal(String name){
        this.name = name;
        count++;
    }


    static void printAnimalCount(){
        System.out.println("Всего животных " + count);
    }


    abstract void animalRunning(int running);

    abstract void animalSwimming(int swimming);

}

