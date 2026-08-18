package OA.Array;

public class findplusOne
{
    public static void main(String[] args) {
        int a[]={1,9,9};
        plusOne(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    static int[] plusOne(int digits[]){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
}
}
