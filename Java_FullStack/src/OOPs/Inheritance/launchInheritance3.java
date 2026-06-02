package OOPs.Inheritance;

 class Telusko1{
    private String name="Telusko Edu";
     void disp(){
         name="Telusko";
         System.out.println("Telusko is: "+name);
     }
 }

 class Alien1 extends Telusko1{

//        void disp2(){
//            name="alien";
//        }


 }




public class launchInheritance3 {
    public static void main(String[] args) {
        Alien1 a = new Alien1();
        a.disp();



    }
}
