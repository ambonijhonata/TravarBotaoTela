/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ValidarEmail;

/**
 *
 * @author diogo
 */
public class ValidarEmailThread implements Runnable{

    private String email; 

    public ValidarEmailThread(String email) {
        this.email = email;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println(ValidarEmail.isEmailValido(email));
        } catch (InterruptedException ex) {
            Logger.getLogger(ValidarEmailThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }        
    
}
