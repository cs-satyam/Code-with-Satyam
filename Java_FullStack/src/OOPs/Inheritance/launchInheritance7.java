package OOPs.Inheritance;


class Alpha1{
    int a,b;
    public Alpha1(){
        a=20;
        b=  20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Alpha param constructor");
    }

}
class beta1 extends Alpha1{
    int x,y;
    public beta1(){
        x=1;
        y=2;
        System.out.println("beta zero param constructor");
    }
    public beta1(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("beta param constructor");
    }

    public void disp(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }

}
public class launchInheritance7 {
    public static void main(String[] args) {

    }
}
