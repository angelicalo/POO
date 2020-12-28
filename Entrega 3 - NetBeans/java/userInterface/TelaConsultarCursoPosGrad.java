/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import academico.*;
import persistencia.*;

import javax.swing.*;


/**
 *
 * @author unicamp
 */
public class TelaConsultarCursoPosGrad extends javax.swing.JFrame {
    
    boolean teste = false;

    /**
     * Creates new form TelaConsultaEquipe
     */
    
    //DadosCursoGraduacao cursosGraduacao;
    //DadosDisciplinasGraduacao disciplinasGraduacao;
    
    public TelaConsultarCursoPosGrad() {
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

        conNomeCursoPosGrad = new javax.swing.JLabel();
        conCodCursoPosGrad = new javax.swing.JLabel();
        conDurCursoPosGrad = new javax.swing.JLabel();
        nomeCursoPosGrad = new javax.swing.JTextField();
        codCursoPosGrad = new javax.swing.JTextField();
        durCursoPosGrad = new javax.swing.JTextField();
        consultarCursoPosGrad = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Curso de Graduação");

        conNomeCursoPosGrad.setText("Nome:");

        conCodCursoPosGrad.setText("Código:");

        conDurCursoPosGrad.setText("Duração:");

        nomeCursoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoPosGradActionPerformed(evt);
            }
        });

        consultarCursoPosGrad.setText("Buscar");
        consultarCursoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCursoPosGradActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conNomeCursoPosGrad)
                    .addComponent(conCodCursoPosGrad)
                    .addComponent(conDurCursoPosGrad))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCursoPosGrad)
                    .addComponent(durCursoPosGrad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(consultarCursoPosGrad)
                        .addGap(18, 18, 18)
                        .addComponent(limpar)
                        .addGap(18, 18, 18)
                        .addComponent(excluir)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conCodCursoPosGrad)
                    .addComponent(codCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarCursoPosGrad)
                    .addComponent(limpar)
                    .addComponent(excluir))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conNomeCursoPosGrad)
                    .addComponent(nomeCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conDurCursoPosGrad)
                    .addComponent(durCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCursoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursoPosGradActionPerformed

    private void consultarCursoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCursoPosGradActionPerformed
        // TODO add your handling code here:        
        CursoPosGraduacao cursoPosGrad = DadosCursoPosGraduacao.buscar(codCursoPosGrad.getText());
        if (cursoPosGrad == null)
            JOptionPane.showMessageDialog(null,"Curso não encontrado!"); 
        else{
            nomeCursoPosGrad.setText(cursoPosGrad.getNome());
            durCursoPosGrad.setText(cursoPosGrad.getDuracao());
        }
    }//GEN-LAST:event_consultarCursoPosGradActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        nomeCursoPosGrad.setText("");
        durCursoPosGrad.setText("");
        codCursoPosGrad.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        CursoPosGraduacao cursoPosGrad;
        cursoPosGrad = DadosCursoPosGraduacao.buscar(codCursoPosGrad.getText());
        if (cursoPosGrad == null)
            JOptionPane.showMessageDialog(null,"Curso não encontrado!"); 
        else{
            DadosCursoPosGraduacao.excluir(codCursoPosGrad.getText());
        }
    }//GEN-LAST:event_excluirActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codCursoPosGrad;
    private javax.swing.JLabel conCodCursoPosGrad;
    private javax.swing.JLabel conDurCursoPosGrad;
    private javax.swing.JLabel conNomeCursoPosGrad;
    private javax.swing.JButton consultarCursoPosGrad;
    private javax.swing.JTextField durCursoPosGrad;
    private javax.swing.JButton excluir;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nomeCursoPosGrad;
    // End of variables declaration//GEN-END:variables
}
