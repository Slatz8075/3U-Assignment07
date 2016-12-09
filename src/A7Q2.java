
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask the user how many heights there is
        System.out.println("how many heights are you comparing?");
        //store this 
        int numOfHeights = input.nextInt();
        //create an array of the heights
        double[] Heights = new double[numOfHeights];
        //ask the user about the heights of the people using for loop
        for (int i = 0; i < Heights.length; i++) {
            //ask them to input the next height
            System.out.println("Enter in mark " + (i + 1));
            //store said Height
            Heights[i] = input.nextDouble();
        }
        //create a viriable rep. the total
        double total = 0;
        //add all the heights using a for loop
        for(int i = 0; i < Heights.length; i ++){
            //add the numbers one by one
            total = total + Heights[i];
        }
        //calculate the average
        double avg = total/Heights.length;
        //compare this average to each one using for loop
        for (int i = 0; i < Heights.length; i++) {
            //is this height bigger than the average?
            if (Heights[i] > avg){
                //if so tell the user
                System.out.println("Height above average: " + Heights[i]);
            }
        }
    }
}
