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
public class Reptile extends Animal{
    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }
    public Reptile(double blood_Temp){
        bloodTemp = blood_Temp;
    }
    //here we have our override
    @Override
    public String Output()
    {
        return ("Animal: Reptile\n"
                + "ID TAG: " + super.getIdTag() + "\n"
                + "Species: " + super.getSpecies()+ "\n"
                + "Temperature of blood: " + bloodTemp);
    }
    //here we have our second Ovverride
    @Override
    public void Input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID Tag of the Reptile: ");
        super.setIdTag(input.nextInt());
        System.out.println("Enter the Species of the Reptile: ");
        super.setSpecies(input.next());
    }
}
