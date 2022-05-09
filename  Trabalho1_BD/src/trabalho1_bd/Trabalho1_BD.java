/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho1_bd;

/**
 *
 * @author vitor
 */
public class Trabalho1_BD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseConnectionForm().setVisible(true);
            }
        });
    }
    
}
