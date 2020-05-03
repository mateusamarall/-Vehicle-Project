/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class TelaMarcasVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form TelaMarcasVeiculos
     */
    public TelaMarcasVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarcaCarro = new javax.swing.JTextField();
        txtModeloCarro = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        panelEditarMarca = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEditarDados = new javax.swing.JButton();
        txtNovoModelo = new javax.swing.JTextField();
        txtEditarMarca = new javax.swing.JTextField();
        txtEditarModelo = new javax.swing.JTextField();
        txtNovaMarca = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Insira os dados Abaixo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 190, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Marca do carro:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 120, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Modelo do carro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 180, 107, 17);

        txtMarcaCarro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMarcaCarro);
        txtMarcaCarro.setBounds(160, 130, 130, 31);

        txtModeloCarro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtModeloCarro);
        txtModeloCarro.setBounds(160, 170, 130, 31);

        btnInserir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInserir.setText(" INSERIR");
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir);
        btnInserir.setBounds(90, 220, 190, 31);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Você Deseja:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 10, 130, 30);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_remove_bin_icon-icons.com_72400.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR UMA MARCA");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(340, 40, 290, 30);

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setText("EDITAR UMA MARCA");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(340, 100, 290, 31);

        panelEditarMarca.setVisible(false);
        panelEditarMarca.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Insira os Dados:");
        panelEditarMarca.add(jLabel6);
        jLabel6.setBounds(20, 30, 160, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Marca do Carro:");
        panelEditarMarca.add(jLabel7);
        jLabel7.setBounds(20, 90, 180, 15);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Modelo do carro:");
        panelEditarMarca.add(jLabel8);
        jLabel8.setBounds(20, 120, 160, 15);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nova Marca do Carro:");
        panelEditarMarca.add(jLabel9);
        jLabel9.setBounds(20, 150, 150, 15);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Novo Modelo do Carro:");
        panelEditarMarca.add(jLabel10);
        jLabel10.setBounds(20, 180, 140, 15);

        btnEditarDados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditarDados.setText("EDITAR");
        btnEditarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEditarMarca.add(btnEditarDados);
        btnEditarDados.setBounds(40, 230, 120, 25);

        txtNovoModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelEditarMarca.add(txtNovoModelo);
        txtNovoModelo.setBounds(160, 180, 90, 21);

        txtEditarMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelEditarMarca.add(txtEditarMarca);
        txtEditarMarca.setBounds(160, 90, 90, 21);

        txtEditarModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelEditarMarca.add(txtEditarModelo);
        txtEditarModelo.setBounds(160, 120, 90, 21);

        txtNovaMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelEditarMarca.add(txtNovaMarca);
        txtNovaMarca.setBounds(160, 150, 90, 21);

        getContentPane().add(panelEditarMarca);
        panelEditarMarca.setBounds(340, 150, 360, 300);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic-back_97586.png"))); // NOI18N
        btnvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnvoltar);
        btnvoltar.setBounds(22, 10, 60, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:

        txtMarcaCarro.setText("");
        txtModeloCarro.setText("");
        txtMarcaCarro.requestFocus();
        if(txtMarcaCarro.getText().equals("")|| txtMarcaCarro == null || txtModeloCarro.getText().equals("") || txtModeloCarro == null){
            JOptionPane.showMessageDialog(null, "Para Adicioanr uma Marca ou modelo é necessário inserir os dados acima.");

        }
        if(!(txtMarcaCarro.getText().equals("")|| txtMarcaCarro == null || txtModeloCarro.getText().equals("") || txtModeloCarro == null)){
            JOptionPane.showMessageDialog(null, "Marca e Modelo Adicionado");

            //adicionar a logica para adicionar um estado

        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if(txtMarcaCarro.getText().equals("")|| txtMarcaCarro == null || txtModeloCarro.getText().equals("") || txtModeloCarro == null){
            JOptionPane.showMessageDialog(null, "Para remover uma Marca é necessário inserir os dados ao lado.");
        }

        //adicionar a logica para excluir um estado
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseClicked
        // TODO add your handling code here:
        TelaPrincipal telap = new TelaPrincipal();
        this.dispose();
        telap.setVisible(true);
    }//GEN-LAST:event_btnvoltarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        panelEditarMarca.setVisible(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMarcasVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMarcasVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMarcasVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMarcasVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMarcasVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarDados;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelEditarMarca;
    private javax.swing.JTextField txtEditarMarca;
    private javax.swing.JTextField txtEditarModelo;
    private javax.swing.JTextField txtMarcaCarro;
    private javax.swing.JTextField txtModeloCarro;
    private javax.swing.JTextField txtNovaMarca;
    private javax.swing.JTextField txtNovoModelo;
    // End of variables declaration//GEN-END:variables
}
