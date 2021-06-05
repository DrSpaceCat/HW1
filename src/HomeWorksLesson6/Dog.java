package HomeWorksLesson6;

public class Dog extends Animal {

    static int dogCount;

    Dog(String name) {
        super(name);
        dogCount++;

    }
    static void printDogCount(){
        System.out.println("Всего собак " + dogCount);
    }

    void animalRunning(int running){
        if(running <= 500){
            System.out.println(this.name + " пробежал " + running);
        }else {
            System.out.println(this.name + " не может пробежать");
        }
    }
    void animalSwimming(int swimming){
        if(swimming <= 10){
            System.out.println(this.name + " проплыл " + swimming);
        }else {
            System.out.println(this.name + " не может проплыть");
        }
    }
}
