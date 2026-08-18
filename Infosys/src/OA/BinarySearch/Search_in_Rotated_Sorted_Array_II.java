package OA.BinarySearch;

public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,0,1,2};
        int target=0;
        int x =  search(a,target);
        System.out.println("Search_in_Rotated_Sorted_Array: "+x);

    }
    static int search(int a[],int t) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == t) {
                return mid;
            }
            if(a[l]==a[mid]&& a[mid]==a[r]){
                l++;
                r--;
                continue;
            }
            if ( a[l] <= a[mid] ) {
                if (a[l] <= t && t < a[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (a[l] > a[mid]) {
                if (a[mid] < t && t <= a[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
