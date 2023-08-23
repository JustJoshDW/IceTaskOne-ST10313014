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
public class Bird extends Animal{
    private int colour;
    private String[] colourS = {"grey","white","black"};

    public int getColour() {
        return colour;
    }
    public Bird(int brdCol){
        colour = brdCol;
    }
    //here we have our override
    @Override
    public String Output()
    {
        return ("Animal: Bird\n"
                + "ID TAG: " + super.getIdTag() + "\n"
                + "Species: " + super.getSpecies()+ "\n"
                + "Colour of feathers: " + colourS[colour - 1]);
    }
    //here we have our second Ovverride
    @Override
    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID Tag of the Bird: ");
        super.setIdTag(input.nextInt());
        System.out.println("Enter the Species of the Bird: ");
        super.setSpecies(input.next());
    }
}
