package OOPs.Constructor;


class Demo{
    int num1,num2;

    // write or not write super method  it always on top line in constructor

    // this() method there no super method is not their

    Demo(){
        super();
        System.out.println("non parameter constructor");
    }


    Demo(int num1,int num2){
        this(num1);
        this.num1=num1;
        this.num2=num2;
        System.out.println("Two parameter constructor");
    }


    Demo(int num1){
        this();
        this.num1=num1;
        num2=44;
        System.out.println("One parameter constructor");
    }



    void show(){
        System.out.println("Num1:  "+num1);
        System.out.println("Num2: "+num2);

    }
}
public class launchConstru2 {
    public static void main(String[] args) {
        Demo demo1=new Demo(4);
        demo1.show();

        System.out.println("**********************************");

        Demo demo2=new Demo(4,5);
        demo2.show();

    }
}
