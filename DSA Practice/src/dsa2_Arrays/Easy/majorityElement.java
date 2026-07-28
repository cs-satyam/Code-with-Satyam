package dsa2_Arrays.Easy;

public class majorityElement {
    public static void main(String[] args) {
        int a[]={2,2,1,1,1,2,2};
        int n=a.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println("majority element: "+a[i]);
                break;
            }
        }
    }
    
}
