/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oliver
 */
public class Salle {
    
    private int nbEmplacementsDispo;

    public Salle(int nbEmplacementsDispo) {
        this.nbEmplacementsDispo = nbEmplacementsDispo;
    }
     
    public void decrementPlacesDispo()           
    {
        nbEmplacementsDispo--;
    }

    public int getNbEmplacementsDispo() {
        return nbEmplacementsDispo;
    }
    
    public boolean isDecrementable()
    {
        return (nbEmplacementsDispo >0);
    }
    
}
