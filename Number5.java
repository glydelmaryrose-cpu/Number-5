
/**
 * Write a description of class Number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number5
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        int target = 3;  
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { 
                System.out.println("Found " + target + " at index " + i);
                break; 
            }
        }
    }
}
