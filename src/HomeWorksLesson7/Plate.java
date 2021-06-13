package HomeWorksLesson7;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void decreaseFood(int appetite){
        if(enoughFood(appetite))
        {
            this.food -= appetite;
        }else
            System.out.println("Нехватает корма");
    }

    public boolean enoughFood(int appetite){
        return appetite < food;
    }

    public void increaseFood(int countFood){
        if (countFood <0 ){
            System.out.println("Ты должен был добавлять еду, а не забирать её!");
            return;
        }
        food += countFood;
    }
}
