/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.frmMarcadores;
import view.frmTabla;

/**
 *
 * @author Steven
 */
public class ctrlMarcadores implements ActionListener{

    //Declaramos cada una de las variables a usar
    private frmMarcadores frm;
    
    String e1 = ctrlHome.equipo1;
    String e2 = ctrlHome.equipo2;
    String e3 = ctrlHome.equipo3;
    String e4 = ctrlHome.equipo4;
       
    public static int puntajeE1 = 0;
    public static int puntajeE2 = 0;
    public static int puntajeE3 = 0;
    public static int puntajeE4 = 0;
    
    public ctrlMarcadores(frmMarcadores frm) {
        this.frm = frm;
        frm.btnRegistrar.addActionListener(this);
    
    }
    
    
    public void start(){
        frm.setLocationRelativeTo(null);
        
        frm.lblE1_1.setText(e1);
        frm.lblE1_2.setText(e1);
        frm.lblE1_3.setText(e1);
        
        frm.lblE2_1.setText(e2);
        frm.lblE2_2.setText(e2);
        frm.lblE2_3.setText(e2);
        
        frm.lblE3_1.setText(e3);
        frm.lblE3_2.setText(e3);
        frm.lblE3_3.setText(e3);
        
        frm.lblE4_1.setText(e4);
        frm.lblE4_2.setText(e4);
        frm.lblE4_3.setText(e4);  
               
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(frm.btnRegistrar)) {
            
            
             
            if (Integer.parseInt(frm.txtE1vsE2_1.getText())>Integer.parseInt(frm.txtE1vsE2_2.getText())) {
               puntajeE1 += 3;
            }else{
               puntajeE2 += 3;
            }
            
            if (Integer.parseInt(frm.txtE3vsE4_1.getText())>Integer.parseInt(frm.txtE3vsE4_2.getText())) {
               puntajeE3 += 3;
            }else{
               puntajeE4 += 3;
            }
            
            if (Integer.parseInt(frm.txtE2vsE3_1.getText())>Integer.parseInt(frm.txtE2vsE3_2.getText())) {
               puntajeE2 += 3;
            }else{
               puntajeE3 += 3;
            }
            
            if (Integer.parseInt(frm.txtE1vsE4_1.getText())>Integer.parseInt(frm.txtE1vsE4_2.getText())) {
               puntajeE1 += 3;
            }else{
               puntajeE4 += 3;
            }
            
            if (Integer.parseInt(frm.txtE2vsE4_1.getText())>Integer.parseInt(frm.txtE2vsE4_2.getText())) {
               puntajeE2 += 3;
            }else{
               puntajeE4 += 3;
            }
            
            if (Integer.parseInt(frm.txtE1vsE3_1.getText())>Integer.parseInt(frm.txtE1vsE3_2.getText())) {
               puntajeE1 += 3;
            }else{
               puntajeE2 += 3;
            }
            
            
            frm.dispose();
            
            frmTabla frm = new frmTabla();
            ctrlTabla ctrl = new ctrlTabla(frm);
            
            ctrl.start();
            frm.setVisible(true);    
            
        }
        
    }
    
}
