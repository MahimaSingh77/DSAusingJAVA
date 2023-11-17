
/*Largest Row or Column

For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1 :
1
2 2 
1 1 
1 1
Sample Output 1 :
row 0 2
Sample Input 2 :
2
3 3
3 6 9 
1 4 7 
2 8 9
4 2
1 2
90 100
3 40
-10 200
Sample Output 2 :
column 2 25
column 1 342 */
import java.util.*;

class randomq {
    public static int max(int[] array) {
        int n = array.length;
        int max = array[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int searchIndex(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test case : ");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.print("Enter the number of rows : ");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns : ");
            int m = sc.nextInt();
            int[] sum1 = new int[n];
            int[] sum2 = new int[m];

            int[][] arr = new int[n][m];

            int i = 0, j = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (i = 0; i < n; i++) {
                int rowsum = 0;
                for (j = 0; j < m; j++) {
                    rowsum += arr[i][j];
                }
                System.out.println(rowsum);
                sum1[i] = rowsum;

            }

            for (i = 0; i < m; i++) {
                int colsum = 0;
                for (j = 0; j < n; j++) {
                    colsum += arr[j][i];

                }
                System.out.println(colsum);
                sum2[i] = colsum;

            }

            int rowmax = max(sum1);
            int colmax = max(sum2);

            int final_max = rowmax;
            if (rowmax < colmax) {
                final_max = colmax;
            }

            System.out.println("The maximum of the row wise and column wise sum is " + final_max);
int index=0;
            if (final_max == rowmax) {
                 index = searchIndex(sum1, final_max);
                 System.out.println(index + " of row wise sum ");
            }
            else{
                index = searchIndex(sum2, final_max);
                System.out.println(index + " of column wise sum ");
            }
            

        }
        t--;
    }
}
