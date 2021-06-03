public class HomeWorksLesson5 {
    public static void main(String[] args){
        Cat firstCat = new Cat("Барсик", "Черный", 2);
//        firstCat.age = 2;
//        firstCat.color = "Black";
//        firstCat.name = "Conan";

        Cat secondCat = new Cat("Ева", "Белый", 3);
//        secondCat.age = 3;
//        secondCat.color = "Blue";
//        secondCat.name = "Eva";

        System.out.println("Первый котик: " + firstCat.age + " " + firstCat.name + " " + firstCat.color);
        System.out.println("Второй котик: " + secondCat.age + " " + secondCat.name + " " + secondCat.color);

        firstCat.voice();
        secondCat.voice();
    }
}
