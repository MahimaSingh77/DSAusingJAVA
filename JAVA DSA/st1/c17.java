import java.util.*;
public class c17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0 ; j<m; j++){
           arr[i][j] = sc.nextInt(); 
        }
    }

    int num = sc.nextInt();
    boolean bool = false;
    for(int i=0; i<n; i++){
        for(int j=0 ; j<m; j++){
           if(arr[i][j] == num){
            bool=true;
           }
        }
    }

    System.out.println(bool);

  }  
}
