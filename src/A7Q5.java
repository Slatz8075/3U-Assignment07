
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create a scanner
        Scanner input = new Scanner(System.in);
        //ask the user how many marks there are
        System.out.println("How many marks are there?");
        //store number 
        int NumOfMarks = input.nextInt();
        //create an array
        int[] Marks = new int[NumOfMarks];
        //ask them to input de numbers
        System.out.println("Please enter 10 numbers");
        //fill the array using a for loop
        for (int i = 0; i < Marks.length; i++) {
            //ask them to input the next mark
            System.out.println("Enter in mark " + (i + 1));
            //store said mark
            Marks[i] = input.nextInt();
        }
        //sort these numbers using f loop
        for (int j = 0; j < Marks.length; j++) {
            //set j equal to k so we may use them independently 
            //compare js value to all those in front of it
            for (int k = j + 1; k < Marks.length; k++) {
                if (Marks[j] > Marks[k]) {
                    //create a temporary spot to store Marks[k]
                    int Marksk3 = Marks[k];
                    //move Marks[k] to Marks[k + 1] 
                    Marks[k] = Marks[j];
                    //replace Marks[k + 1] with Marksk3 
                    Marks[j] = Marksk3;
                }
            }
        }
        //tell the user using for loop
        System.out.println("These numbers in order were: ");
        for (int h = 0; h < Marks.length; h++) {
            //tell them 
            System.out.println(Marks[h]);
        }
    }
}
