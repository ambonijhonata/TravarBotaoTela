/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaremail;

import controller.ControllerValidarEmail;
import view.ValidarEmailView;

/**
 *
 * @author jhonata
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ValidarEmailView view = new ValidarEmailView();
        
        new ControllerValidarEmail(view);
    }
    
}
