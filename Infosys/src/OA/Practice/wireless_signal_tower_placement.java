package Practice;

public class wireless_signal_tower_placement
{
    public static void main(String[] args) {
        int n = 9;
        int a[] = {1, 1, 6, 2, 5, 4, 8, 3, 1};

        System.out.println(communicationScore(a, n));
    }

    static int communicationScore(int a[], int n) {
        int i = 0;
        int j = n - 1;
        int max = 0;

        while (i < j) {
            int area = (j - i) * (Math.min(a[i], a[j]));
            max = Math.max(area, max);
            if (a[i] < a[j]) i++;
            else j--;
        }
        return max;
    }
}
