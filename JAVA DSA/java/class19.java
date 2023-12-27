import java.util.Scanner;

// class class19 {
//     public static void main(String[] args) {
//     System.out.println("hello");
//     System.out.println("Mahima Singh");
// }

// }


// class class19{
//     public static void main(String[] args) {
//         System.out.println(12+23);
//     }
// }


// class class19{
//     public static void main(String[] args) {
//         Scanner input = new Scanner (System.in);

//         System.out.println("Enter num1 : ");
//         int num1 = input.nextInt();

//         System.out.println("Enter num2 : ");
//         int num2 = input.nextInt();

//         int sum = num1 + num2;

//         System.out.println("Sum : " + sum);
    
//     }
// }


// class class19{
//     public static void main(String[] args) {
//         System.out.println(- 5 + 8 * 6);
//         System.out.println((55+9)%9);
//         System.out.println(20+(-3*5)/8);
//         System.out.println(5+15/3*2-8%3);
//     }
// }



// Write a Java program that takes two numbers as input and display the product of two numbers
// class class19{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the first number : ");
//         int num1 = input.nextInt();
//         System.out.println("Enter the second number : ");
//         int num2 = input.nextInt();
//         int product = num1 * num2;
//         System.out.println("The product is  : " + product);
//     }
// }



// Write a Java program that takes a number as input and prints its multiplication table upto 10

// class class19 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in); 
//         System.out.println("Enter the number : ");
//         int num = input.nextInt();
//         for(int i = 1 ; i <= 10; i++){
//             System.out.println(num*i); 
        
//         } 

//     }
// }



// class class19{
//     public static void main(String[] args) {
//         System.out.println("   J   a   V      V  a");
//         System.out.println("   J  a a   V   V   a a");
//         System.out.println("J  J aaaaa   V V   aaaaa");
//         System.out.println(" JJ  a   a    V   a     a");

//     }
// }




// 9. Write a Java program to compute the specified expressions and print the output. Go to the editor

// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
// class class19 {
//     public static void main(String[] args) {
//         System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//     }
// }


// Write a Java program to print the area and perimeter of a circle. Go to the editor

// Radius = 7.5

// class class19{
//     public static void main(String[] args) {
//         float r = 7.5f;
//         System.out.println("Parameter = " +  2 * 3.14 * r);
//         System.out.println("Area = " +  3.14 * r * r);
//     }
// }


// 15. Write a Java program to swap two variables. 
// class class19{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num1 = input.nextInt();
//         int num2 = input.nextInt();
//         int temp;
//         temp = num1;
//         num1 = num2;
//         num2 = temp;
//         System.out.println(num1+ " " + num2);
        
//     }
// }





// 17.Write a Java program to add two binary numbers. Go to the editor

// Input first binary number: 10
// Input second binary number: 11
// class class19 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter first binary number : ");
//         int num1 = input.nextInt();

//         System.out.print("Enter second binary number : ");
//         int num2 = input.nextInt();

        


//     }
// }


// class class19{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         System.out.println(num);
//         double num2 = input.nextDouble();
//         System.out.println(num2);
//         input.nextLine();
//         String num3 = input.nextLine();
//         System.out.println(num3);
//     }
// }

// class class19{
// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     int num = input.nextInt();
//     if(num%2==0){
//         System.out.println("A");
//     }
//     else{
//         if(num >= 2 && num <= 6){
//             System.out.println("B"); 
//         }
//         else if (num >= 7  && num <=20){
//             System.out.println("C");
//         }

//         else{
//             System.out.println("D");
//         }
    
// }}
// }


// class class19{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
        
//         double num2 = input.nextDouble();
      
//         input.nextLine();
//         String num3 = input.nextLine();
//         System.out.println("String " + num3);
//         System.out.println("double " + num2);
//         System.out.println("Int          " + num);
//     }
// }

// Write a Java program to add two binary numbers.
// In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral
//  system or binary numeral system. 
// This system uses only two symbols: typically 1 (one) and 0 (zero).







// java program to add two binary strings

public class class19 {

	// Function to add two binary strings
	static String add_Binary(String x, String y)
	{

		int num1 = Integer.parseInt(x,2);
		//converting binary string into integer(decimal number)
	
		int num2 = Integer.parseInt(y,2);
		//converting binary string into integer(decimal number)
	
	
		int sum = num1 + num2;
		// Adding those two decimal numbers and storing in sum
		
		String result = Integer.toBinaryString(sum);
		//Converting that resultant decimal into binary string

		return result;
	}

	// The Driver code
	public static void main(String args[])
	{
		String x = "011011", y = "1010111";

		System.out.print(add_Binary(x, y));
	}
}





// binary to decimal

// class class19{
//     public static void main(String[] args) {
//         int rem=0, decimal1=0 , weight=1 , decimal2=0, sum=0;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the first binary number : ");
//         int binary1 = input.nextInt();
//         System.out.println("Enter the second binary number : ");
//         int binary2 = input.nextInt();

//         while(binary1 != 0){
//             rem = binary1 % 10;
//             decimal1 = decimal1 + rem * weight;
//             weight = weight*2;
//             binary1 /= 10;
//         }
//         while(binary2 != 0){
//             rem = binary2 % 10;
//             decimal2 = decimal2 + rem * weight;
//             weight = weight*2;
//             binary2 /= 10;
//         }
        

//         sum = decimal1 + decimal2;

//         int binarysum[] = new int[40];
//         int index = 0;
//         while(sum > 0){    
//             binarysum[index++] = sum%2;   
//             sum = sum/2;    
//           }

//           for(int i = index-1;i >= 0;i--){    
//             System.out.print(binarysum[i]);    
//           }  


//     }
// }