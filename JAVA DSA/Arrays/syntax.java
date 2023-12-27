import  java.util.*;
class syntax{
     void oneDArray(){
        //*** 1D Array ***
        String[] names = new String[5];
        int[] age = new int[3];
        float[] weight = new float[5];
        String[] names2 = {"rahul" , "raj" , "aradhya"};  // Array literals method

        age[0] = 15;
        age[1]= 16;
        age[2]=14;
      //  age[5] = 23;  //index 5 bound out of bound
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(names2[0]);
        System.out.println(names2[1]);
        System.out.println(names2[2]);
      //System.out.println(age[5]);  //index 5 bound out of bound
    }

     void twoDArray(){
      int[][] arr1 = new int[5][];
      

        int[][] arr2 = {{56,53,6} , {84,55,66} , {64,67,74}};

        System.out.println("twodimensional array : ");
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[1][0]);

    }

    void threeDArray(){
      int[][][] arr1 = new int[5][3][2];  // 5*3*2=30 element
       arr1[0][0][0]=34;

        System.out.println("threedimensional array : ");
        System.out.println(arr1[0][0][0]);
       
    }

    // *********************Traversing through the array***************************************
    void traverse(){
      int[] age = new int[3];
      age[0] = 15;
      age[1]= 16;
      age[2]=14;
System.out.println("Traverse through for loop");
      for(int i=0; i<age.length ; i++){
        System.out.println(age[i]);
      }
System.out.println("Traverse through for each loop");

for(int ages : age){
  System.out.println(ages);
}

System.out.println("Traverse through while loop");
int i=0;
while(i < age.length){
  System.out.println(age[i]);
  i++;

}

//***************************************traversing multidimensional array***************/
int[][] arr2 = {{56,53} , {84,55}, {64,67}};
System.out.println("Traversing multidimensional array though for loop");
for(int k=0 ; k<arr2.length; k++){
  for(int j=0; j<arr2[k].length ; j++){
    System.out.println(arr2[k][j]);
  }
}
    }
//*******************************taking input*******************/
 /*   void input(){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr3 = new int[n];
      for(int l=0; l<n; l++){
          arr3[l]=sc.nextInt();
      }
    }
    */
      public static void main(String[] args) {
        
        syntax obj = new syntax();
          obj.oneDArray();
          obj.twoDArray();
          obj.threeDArray();
          obj.traverse();
        //  obj.input();
        
    }
}


