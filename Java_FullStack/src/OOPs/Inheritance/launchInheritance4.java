package OOPs.Inheritance;

class parent {
        void disp(){
            System.out.println("Parent class method");
        }
}
class child extends parent{

}
public class launchInheritance4 {
    public static void main(String[] args) {
        child c = new child();
        c.disp();

    }
}
