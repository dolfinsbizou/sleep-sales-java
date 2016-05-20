/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oliver
 */
public class Cave {
    
    private int maxY;
    private int maxX;
    
    private int maxNord; //Distance au nord par rapport à l'origine
    private int maxSud;
    private int maxEst;
    private int maxOuest;
    
    private int origineX, origineY;
    
    
    private Salle[][] grilleSalles;
    
    
    public Cave(int maxX, int maxY, String casier)
    {
        this.maxY = maxY;
        this.maxX = maxX;
        
        grilleSalles = new Salle[maxX][maxY];
        for (int i = 0; i< maxX; i++)
        {
            for(int j = 0; j<maxY; j++)
            {
                
                char nbCasier = casier.charAt(j * maxX + i);
                if(nbCasier == '@'){
                    grilleSalles[i][j] = new Salle(0);
                    this.origineX = i;
                    this.origineY = j;
                }else{
                    grilleSalles[i][j] = new Salle(Integer.parseInt(String.valueOf(nbCasier)));

                }
            }
        }
        maxOuest = -origineX;
        maxEst = (maxX-origineX) -1 ;
        maxSud = - (maxY-origineY) +1 ;
        maxNord = origineY;
    }
    
    
    public Salle getSalle(int x, int y)
    {
        return grilleSalles[x + origineX][y + origineY];
    }
    
}
