import java.util.*;
class sort{
   
    void sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                        int temp;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]= temp;

                }
            }
        }
        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    }

    public static void main(String[] args) {
        sort obj = new sort();

        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
        obj.sorting(arr);

    }
}
