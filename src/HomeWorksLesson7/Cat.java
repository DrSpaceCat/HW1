package HomeWorksLesson7;

public class Cat {

    String name;
    int appetite;
    boolean satiety = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate){
        if (plate.enoughFood(appetite) && !satiety){
            System.out.println(name + " кушает");
            plate.decreaseFood(appetite);
            satiety = true;
        }
        else if(!plate.enoughFood(appetite)){
            System.out.println(name + " не может поесть");
        }
        else if (satiety){
            System.out.println(name + " уже поел");
        }
    }

}
