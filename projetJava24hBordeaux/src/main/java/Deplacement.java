/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oliver
 */
public class Deplacement extends Action {

    public void Nord(Manutentionnaire m) {
        m.incrementY();
    }

    public void Sud(Manutentionnaire m) {
        m.decrementY();
    }

    public void Est(Manutentionnaire m) {
        m.incrementX();
    }

    public void Ouest(Manutentionnaire m) {
        m.decrementX();
    }

}
