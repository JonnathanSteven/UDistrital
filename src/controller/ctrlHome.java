/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.frmMain;
import view.frmMarcadores;

/**
 *
 * @author Steven
 */
public class ctrlHome implements ActionListener{

    //Declaramos cada una de las variables a usar
    private frmMain frm;
    
    public static String equipo1;
    public static String equipo2;
    public static String equipo3;
    public static String equipo4;
    
    public ctrlHome(frmMain frm) {
        this.frm = frm;
        frm.btnRegistrar.addActionListener(this);
             
    }

    
    public void start(){
        frm.setLocationRelativeTo(null);
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if (e.getSource().equals(frm.btnRegistrar)){
            
            equipo1 = frm.txtEquipo1.getText();
            equipo2 = frm.txtEquipo2.getText();
            equipo3 = frm.txtEquipo3.getText();
            equipo4 = frm.txtEquipo4.getText();
            
            frm.dispose();
            
            frmMarcadores frm = new frmMarcadores();
            ctrlMarcadores ctrl = new ctrlMarcadores(frm);
            
            ctrl.start();
            frm.setVisible(true);    
            
        }

    }
    
}
