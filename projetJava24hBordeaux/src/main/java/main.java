
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pradeilles
 */
public class main {
    public static void main(String args[]){
        Socket socket;
        try{
            socket = new Socket(args[0], Integer.parseInt(args[1]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        IOCommandes ioCommandes = new IOCommandes(socket);        
    }
    
}
