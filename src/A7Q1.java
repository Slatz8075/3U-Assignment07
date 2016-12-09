
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask the user how many marks there are
        System.out.println("How many makrs are there?");
        //create a vairaible for such
        int classSize = input.nextInt();
        //create an array to store 5 marks
        double[] marks = new double[classSize];
        //get the user to fill the array via for loop
        for(int i = 0; i <marks.length; i++){
            //ask them to input the next mark
            System.out.println("Enter in mark " + (i+1));
            //store said mark
            marks[i] = input.nextDouble();
        }
        //create a viriable rep. the total
        double total = 0;
        //add all the marks using a for loop
        for(int i = 0; i < marks.length; i ++){
            //add the numbers one by one
            total = total + marks[i];
        }
        //calculate the average
        double avg = total/marks.length;
        //tell the user
        System.out.println("The average is: " + avg);
    }
}
