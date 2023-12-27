public class sort0s1s2s {
    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 1, 0 };
        int low = 0;
        int mid = 0;
        int high = 4;

        for (int i = 0; i <= high; i++) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
                continue;
            }
            if (a[mid] == 1) {
                mid++;
                continue;
            }

            if (a[mid] == 2) {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;

                high--;

            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low=0;
        int mid=0;
        int high=n-1;
       for(int i=0; i<=high; i++){
         if(a[mid]==0){
             int temp = a[i];
             a[i]  = a[mid];
             a[mid] = temp;
             low++;
             mid++;
             continue;
         }
         if(a[mid]==1){
             mid++;
             continue;
         }
         if(a[mid]==2){
             int temp = a[mid];
             a[mid] = a[high];
             a[high]=temp;
             high--;
         }
         
        }
    }
}