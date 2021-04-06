/*
 * 
 */
package inputstreamreader;
import java.io.IOException;
/**
 *
 * @author shegavala
 */
public class InputStreamReader {
    public static void main(String[] args) throws IOException {
        
        int userInput;
        
        //read 1st byte
        userInput = System.in.read();
        //read 2nd byte
        userInput = System.in.read();
        //read 3rd byte
        userInput = System.in.read();
        //read 4th byte
        userInput = System.in.read();
        //read 5th byte
        userInput = System.in.read();
        
        //print character
        System.out.println(userInput);
       
    }
    /*If i type my name Shega in the keybord I will reseive number 97 as an output
    the reason is becasue the the 5th byte character in may name is 'a' and if you check ASCII table
    char a is decimal 97.*/
    /*have fun and try typing different names*/
    }
    

