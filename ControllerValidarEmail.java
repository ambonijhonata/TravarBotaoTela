/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import threads.ValidarEmailThread;
import utils.ValidarEmail;
import view.ValidarEmailView;

/**
 *
 * @author jhonata
 */
public class ControllerValidarEmail {

    private ValidarEmailView view;

    public ControllerValidarEmail(ValidarEmailView view) {
        this.view = view;
        this.view.getjButtonValidar().addActionListener(new ButtonClickListener());

        view.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println(isEmailValido());
            String email = view.getjTextFieldEmail().getText();
            Thread t = new Thread(new ValidarEmailThread(email));
            t.start();
            
            /*
            if (isEmailValido()) {
            JOptionPane.showMessageDialog(null, "Email válido", "Email", JOptionPane.INFORMATION_MESSAGE);
            return;
            } else {
            JOptionPane.showMessageDialog(null, "Email inválido", "Email", JOptionPane.ERROR_MESSAGE);
            return;
            
            }*/
        }
    }

    public boolean isEmailValido() {
        String email = this.view.getjTextFieldEmail().getText();

        return ValidarEmail.isEmailValido(email);
    }
}
