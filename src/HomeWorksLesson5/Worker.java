package HomeWorksLesson5;

public class Worker {
    String fullName;
    String post;
    String email;
    String phone;
    int pay;
    int age;
    Worker(String fullName, String post, String email, String phone, int pay, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
    void information(){
        System.out.println(this.fullName + " " + this.post + " " + this.email + " " + this.phone + " " + this.pay + " " + this.pay);
    }
}
