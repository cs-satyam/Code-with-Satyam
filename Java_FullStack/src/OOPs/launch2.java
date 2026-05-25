package OOPs;

class calc{
    int num1;
    int num2;
     void add(int a,int b){
         num1=10;
        num2=20;
        int res = num1+num2;
        System.out.println(res);
     }

     void sub(int a,int b){
         num1=10;
         num2=20;
         int res = num1-num2;
         System.out.println(res);
     }
}
public class launch {
    public static void main(String[] args) {
        calc c= new calc();
        c.sub(10,20);
        for(int i=0;i<10;i++){
            System.out.println(i);
        }


    }

}
