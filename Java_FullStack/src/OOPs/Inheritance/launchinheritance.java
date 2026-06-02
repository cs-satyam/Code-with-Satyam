package OOPs.Inheritance;

class Telusko{
    int age;
    void display(){
        age=25;
        System.out.println("Teluskp age is " + age);
    }
}
// one class acquire  the properties of other class
class Alien extends Telusko{
    int age;
}
public class launchinheritance {
    public static void main(String[] args) {

//            Telusko t = new Telusko();
//            t.display();

            Alien a = new Alien();
            a.display();
    }

}
