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
    
    private int x;
    private int y;
    private int distance;
    private int nbEmplacementsDispo;

    public Salle(int x, int y, int nbEmplacementsDispo) {
        this.x = x;
        this.y = y;
        distance = Math.abs(x) + Math.abs(y);
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
    
    public int getDistance(){
        return distance;
    }
    
}
