package HomeWorksLesson6;

public class Cat extends Animal{

    static int catCount;

    Cat(String name) {
        super(name);
        catCount++;
    }

    static void printCatCount(){
        System.out.println("Всего котов " + catCount);
    }

    void animalRunning(int running) {
        if(running <= 200){
            System.out.println(this.name + " пробежал " + running);
        }else {
            System.out.println(this.name + " не может пробежать");
        }
    }
    void animalSwimming(int swimming){
       System.out.println(this.name + " не может плавать");
    }

}
