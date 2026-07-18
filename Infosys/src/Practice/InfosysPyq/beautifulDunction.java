package Practice.InfosysPyq;

public class beautifulDunction {
    public static void main(String[] args) {
        int n=101;
        int count=0;
        while(n!=0){
            if(n%10==0){
               int l=n/10;

            }else{
                 int step= 10-n%10;
                 count+=step;
                 n=n+step;
            }
        }
    }
}
