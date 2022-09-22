package controller;

import view.frmMain;
import controller.ctrlHome;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Steven
 */
        
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmMain frmHome = new frmMain();
        ctrlHome ctrlHome = new ctrlHome(frmHome);
        
        ctrlHome.start();
        frmHome.setVisible(true);
        
    }
    
}
