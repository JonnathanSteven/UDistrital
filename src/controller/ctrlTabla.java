/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.frmTabla;

/**
 *
 * @author Steven
 */
public class ctrlTabla implements ActionListener{

    //Declaramos cada una de las variables a usar
    private frmTabla frm;
    
    int puntajeE1 = ctrlMarcadores.puntajeE1;
    int puntajeE2 = ctrlMarcadores.puntajeE2;
    int puntajeE3 = ctrlMarcadores.puntajeE3;
    int puntajeE4 = ctrlMarcadores.puntajeE4;
    
    String e1 = ctrlHome.equipo1;
    String e2 = ctrlHome.equipo2;
    String e3 = ctrlHome.equipo3;
    String e4 = ctrlHome.equipo4;

    
    public ctrlTabla(frmTabla frm) {
        this.frm = frm;
        frm.btnExit.addActionListener(this);
    
    }
    
    
    public void start(){
        frm.setLocationRelativeTo(null);
        
        frm.lbl1.setText(Integer.toString(puntajeE1));
        frm.lbl2.setText(Integer.toString(puntajeE2));
        frm.lbl3.setText(Integer.toString(puntajeE3));
        frm.lbl4.setText(Integer.toString(puntajeE4));
        
        frm.lblEquipo1.setText(e1);
        frm.lblEquipo2.setText(e2);
        frm.lblEquipo3.setText(e3);
        frm.lblEquipo4.setText(e4);
        
        
        
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(frm.btnExit)) {
             
            frm.dispose();
            
        }
        
    }
    
}
