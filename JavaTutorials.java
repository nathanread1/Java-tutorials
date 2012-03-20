/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorials;

import java.util.Scanner;

public class JavaTutorials {

    
    public static void main(String[] args) {
     time timeObject = new time();  
     System.out.println(timeObject.toMillitary());
     timeObject.setTime(13, 54, 45);
     System.out.println(timeObject.toMillitary());
    }
    
        
        
    
    }

