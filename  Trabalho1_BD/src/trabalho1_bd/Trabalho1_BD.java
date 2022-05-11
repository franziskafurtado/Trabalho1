/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho1_bd;
import java.sql.*;
import trabalho1_bd.ChooseConnectionForm;
/**
 *
 * @author vitor
 */
public class Trabalho1_BD {
    public static void main(String[] args) throws Exception{
        
        System.out.println(System.getProperty("user.dir"));
        new Context();
    }    
}

class Context{
    private ChooseConnectionForm chooseConnectionForm = new ChooseConnectionForm();

    public Context(){
        chooseConnectionForm.setVisible(true);
    }
}


