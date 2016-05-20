/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel
 */
public class Strat {

    private final Cave cave;
    private final Manutentionnaire manutentionnaire;
    
    public Strat(Cave cave, Manutentionnaire manutentionnaire){
        this.cave = cave;
        this.manutentionnaire = manutentionnaire;
    }
    
    public char[] getAction(){
        Math.abs(cave.getMaxNord()) > Math.abs(cave.getMaxSud());
    }
}
