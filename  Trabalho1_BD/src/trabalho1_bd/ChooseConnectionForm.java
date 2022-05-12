/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho1_bd;

import java.sql.*;

import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.util.ArrayList;



/**
 *
 * @author vitor
 */
public class ChooseConnectionForm extends javax.swing.JFrame {
    private static String _csvDir = System.getProperty("user.dir")+"\\saved.csv";
    public ConnectionGUIForm gui;
    public ArrayList<ConnectionInfo> savedConnections = new ArrayList<ConnectionInfo>();
    
    public ChooseConnectionForm() {
        ArrayList<String> comboOptions = new ArrayList<String>();
        comboOptions.add("");

        CSVReader reader = null;
        try{
            File tempFile = new File(_csvDir);
            if(tempFile.exists()){
                FileReader fileReader = new FileReader(_csvDir);
                reader = new CSVReader(fileReader);

                String[] nextRecord;

                while ((nextRecord = reader.readNext()) != null) {
                   ConnectionInfo savedConnection = new ConnectionInfo();
                   
                   savedConnection.connectionName = nextRecord[0];
                   savedConnection.url = nextRecord[1];
                   savedConnection.userName = nextRecord[2];
                   savedConnection.password = nextRecord[3];

                   savedConnections.add(savedConnection);                   
                   comboOptions.add(nextRecord[0]);
                }
            }

        }catch(Exception ex){
            System.out.println("Erro Leitura de Arquivo: "+ex);
        }
        initComponents();
        
        savedAccountsCombo.setModel(new javax.swing.DefaultComboBoxModel(comboOptions.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseSavedConnectionLabel = new javax.swing.JLabel();
        savedAccountsCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        connectionNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        connectionUrlTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        connectionUserTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        connectButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        connectionPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseSavedConnectionLabel.setText("Escolha a conexão:");

        savedAccountsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        savedAccountsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedAccountsComboActionPerformed(evt);
            }
        });
        savedAccountsCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                savedAccountsComboPropertyChange(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("JDBC url:");

        jLabel4.setText("Usuário:");

        jLabel5.setText("Senha:");

        connectButton.setText("Conectar");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savedAccountsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chooseSavedConnectionLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(connectionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(connectionUrlTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                .addComponent(connectionUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                .addComponent(connectionPasswordField)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(chooseSavedConnectionLabel)
                .addGap(20, 20, 20)
                .addComponent(savedAccountsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(connectionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(connectionUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectionUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(connectionPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectButton)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        try{

            ConnectionInfo newConnection = new ConnectionInfo();
        
            newConnection.connectionName = connectionNameTextField.getText();
            newConnection.url = connectionUrlTextField.getText();
            newConnection.userName = connectionUserTextField.getText();
            newConnection.password = String.valueOf(connectionPasswordField.getPassword());
            
            this.setVisible(false);
            this.gui = new ConnectionGUIForm(DriverManager.getConnection(newConnection.url+"?useTimezone=true&serverTimezone=America/Sao_Paulo", newConnection.userName, newConnection.password));
            this.gui.setVisible(true);
            
            boolean isNew = true;
            
            for(var i=0; i< savedConnections.size(); i++){
               var savedConnection = savedConnections.get(i);
               if(savedConnection.connectionName.equals(newConnection.connectionName)){
                        isNew = false;
               }
            }

            
            if(isNew){
                savedConnections.add(newConnection);
            }
            
            File file = new File(_csvDir);
            FileWriter outputFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputFile);
            
            for(var i=0; i< savedConnections.size(); i++){
                var savedConnection = savedConnections.get(i);
               String[] line = new String[]{ savedConnection.connectionName,savedConnection.url,savedConnection.userName, savedConnection.password};
               writer.writeNext(line);
            }       
            
            writer.close();

        }catch (Exception sql1) {
            System.out.println("Erro BD: "+sql1);
            this.setVisible(true);
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CSVReader reader = null;
        try{
            reader = new CSVReader(new FileReader(_csvDir));
            
            String[] nextRecord;
            
            while ((nextRecord = reader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void savedAccountsComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_savedAccountsComboPropertyChange

    }//GEN-LAST:event_savedAccountsComboPropertyChange

    private void savedAccountsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedAccountsComboActionPerformed
        var selectedConnection = savedAccountsCombo.getSelectedItem();
        
        savedConnections.forEach(
           savedConnection ->{
               if(savedConnection.connectionName == selectedConnection){
                   connectionNameTextField.setText(savedConnection.connectionName);
                   connectionUrlTextField.setText(savedConnection.url);
                   connectionUserTextField.setText(savedConnection.userName);
                   connectionPasswordField = new javax.swing.JPasswordField(savedConnection.password);
               }
           }
        );
        //savedConnections.
    }//GEN-LAST:event_savedAccountsComboActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseConnectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseConnectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseConnectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseConnectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseConnectionForm().setVisible(true);
            }
        });
    }
    
    class ConnectionInfo{
        public String url;
        public String userName;
        public String password;
        public String connectionName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseSavedConnectionLabel;
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField connectionNameTextField;
    private javax.swing.JPasswordField connectionPasswordField;
    private javax.swing.JTextField connectionUrlTextField;
    private javax.swing.JTextField connectionUserTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> savedAccountsCombo;
    // End of variables declaration//GEN-END:variables
}
