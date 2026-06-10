package OOPs.Inheritance;
class Alpha{
    int a,b;
    public Alpha(){
        a=20;
        b=  20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Alpha param constructor");
    }

}
class beta extends Alpha{
    int x,y;
    public beta(){
        x=1;
        y=2;
        System.out.println("beta zero param constructor");
    }
    public beta(int x,int y){
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
public class launchInheritance6 {
    public static void main(String[] args) {



    beta b = new beta();
    b.disp();
    beta b1 = new beta(4,44);
    b1.disp();

}
}
