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
public class Animal {
    
    private int IdTag;

    public int getIdTag() {
        return IdTag;
    }

    public void setIdTag(int IdTag) {
        this.IdTag = IdTag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    private String species;
    public String Output(){
        return ("Animal: \n"
                + "ID TAG: " + IdTag + "\n"
                + "Species: " + species);
    }
    public void Input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID Tag: ");
        input.nextInt();
        System.out.println("Enter the Species: ");
        input.next();
    }
}
