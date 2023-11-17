import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class filehandling {
    public static void main(String[] args) {

        // code to create a new file

        /*
         * File myFile = new File("mahima.txt");
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * System.out.println("Unable to create this file");
         * e.printStackTrace();
         * }
         * 
         * // code to write to a file
         * try {
         * FileWriter fileWriter = new FileWriter("mahima.txt");
         * fileWriter.write("This is our first file from java course\nOk by now");
         * fileWriter.close();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         

        // Reading a file
        File myfile = new File("mahima.txt");
        try{
        Scanner sc = new Scanner(myfile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }


//delete a file
File myfile = new File("mahima.txt");
if(myfile.delete()){
    System.out.println("I have deleted " + myfile.getName());

}
else{
    System.out.println("some problem occured deleting this file");
}
*/
    }

}