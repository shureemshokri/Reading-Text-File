
package readmyletter_17203199;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;




public class ReadMyLetter_17203199 {

      public static void main(String[] args) {
          
          
          
          
          try{
             Scanner in = new Scanner (new File(/*the destination of your specific file*/));
             
             while(in.hasNextLine()) {
                 System.out.println(in.nextLine());
             }
              
          }catch (FileNotFoundException e) {
              System.out.println("No file was found");
          }
        
          
         
          
      
      }
}
