/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package allnight;

public class AllNight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("the average is ");
        System.out.println( average(43,23,23,65,45,67));
        
    }
    public static int average(int...numbers){
        int total=0;
        for(int x:numbers)
            total +=x;
        
        return total/numbers.length;
        
    }
    }

