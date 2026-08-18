package OA.BinarySearch;

public class firstLastOccurance {
    public static void main(String[] args) {
        int a[]={};
        int k=10;
        findfirstLastOccurance(a,k);
    }
    static int[] findfirstLastOccurance(int a[], int k) {

        lowerBound lb = new lowerBound();
        upperBound ub = new upperBound();

        int lower = lb.findLowerBound(a, k);

        // Target doesn't exist
        if (lower == a.length || a[lower] != k) {
            return new int[]{-1, -1};
        }

        int upper = ub.findUpperBound(a, k);

        return new int[]{lower, upper - 1};
    }
}
