package OA.Array;

import java.util.*;

public class sprialMatrix
{
    public static void main(String[] args) {
        int arr[][]=   {{1,2,3},
                        {4,5,6},
                        {7,8,9}
                            };
        System.out.println(spiralOrder(arr));

    }
    public static List<Integer> spiralOrder(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> l = new ArrayList<>();
        int topRow = 0, rightCol = n - 1, bottomRow = m - 1, leftCol = 0;
         while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int j = leftCol; j <= rightCol; j++)
                l.add(mat[topRow][j]);
            topRow++;

            for (int i = topRow; i <= bottomRow; i++)
                l.add(mat[i][rightCol]);
            rightCol--;

            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--)
                    l.add(mat[bottomRow][j]);
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--)
                    l.add(mat[i][leftCol]);
                leftCol++;
            }
        }

        return l;
    }
}
