
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //create an array
        int[] A = new int[2];
        //ask them to input the number
        System.out.println("Enter 2 numbers");
        //fill said array with the numbers
        A[0] = input.nextInt();
        A[1] = input.nextInt();
        if (A[1] < A[0]) {
            //create a temporary spot to store A[2]
            int A2 = A[0];
            //move A[1] to A[2] 
            A[0] = A[1];
            //replace A[1] with A3 
            A[1] = A2;   
        } 
        //tell the user the array in order:
        System.out.println("These numbers in order are " + A[0] + " " + A[1]);
    }
}
