/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oliver
 */
public class ActionSac extends Action {

    public void Poser(Manutentionnaire m) {
        m.poserBouteille();
    }

    public void Remplir(Manutentionnaire m) {
        m.remplirSac();
    }

}
