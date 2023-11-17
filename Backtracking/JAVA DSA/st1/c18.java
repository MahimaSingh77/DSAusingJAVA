import java.util.*;

public class c18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int a = arr[0];
    System.out.print(a);
    for (int i = 0; i < n; i++) {
     
      if (i == 0) {
        continue;
      }
      
      if ( arr[i] < a) {
         
         System.out.print(a);
         a = arr[i];
      }
    }
    

  }
}
