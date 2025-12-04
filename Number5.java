
/**
 * Write a description of class Number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number5
{
    public static void main(String [] args){
        int [] arr = {3, 5 ,4, 8, 2, 9};
        
        for (int num : arr){
            if (num == 8){
                System.out.println("Found 8! Stopping.");
                break;
            }
            System.out.println("Checking: " + num);
        }
    }
}