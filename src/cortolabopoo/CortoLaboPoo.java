/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortolabopoo;

import conexion.Conexion;
import vista.Consulta;

/**
 *
 * @author LN710Q
 */
public class CortoLaboPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }
    
}
