/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Emmanuel
 */
public class IOCommandes {
    
    private Socket socket;
    private BufferedReader reader;
    private PrintStream writer;

    public IOCommandes(Socket s) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        socket = s;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintStream(socket.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void write(String texte){
        writer.println(texte);
    }
    
    public String read(){
        try {
            return reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
