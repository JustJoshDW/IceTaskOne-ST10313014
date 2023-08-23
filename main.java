/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICETASKONE;

import java.util.Scanner;

/**
 *
 * @author Josh (ST10313014)
 */
public class main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String selection;
        int birdColour;
        
        do          //went with the do while loop as it is running the exeption check at the end of the loop
        {
            System.out.println("Please choose one: \n"
                    + "Bird,\n"
                    + "Reptile,\n"
                    + "exit");
            selection = kb.next();
            switch (selection.toLowerCase())
            {
                case "bird":
                    do
                    {
                        System.out.println("Please enter the colour of the bird with its reference number\n"
                                + "1 for Grey\n"
                                + "2 for White\n"
                                + "3 for Black");
                        birdColour = kb.nextInt();
                    }while (birdColour < 1 || birdColour > 3);
                    Bird brd = new Bird(birdColour);       //calling the Bird class to export the values
                    brd.Input();
                    System.out.println(brd.Output());
                    break;
                case "reptile":
                    System.out.println("Please enter the reptiles blood temperature: ");
                    Reptile rept = new Reptile(kb.nextDouble());
                    rept.Input();
                    System.out.println(rept.Output());
                    break;
                    
                case "exit":
                    break;
             
                    
            }
        }while(!"exit".equals(selection.toLowerCase()));
    }
    
}
