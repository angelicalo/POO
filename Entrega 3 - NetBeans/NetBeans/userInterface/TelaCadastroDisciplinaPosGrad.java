/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import entradas.*;
import academico.*;
import persistencia.*;

import javax.swing.*;

/**
 *
 * @author unicamp
 */
public class TelaCadastroDisciplinaPosGrad extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaEquipe
     */
    public TelaCadastroDisciplinaPosGrad() {
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

        jLabel1 = new javax.swing.JLabel();
        cadNomeDisciplinaPosGrad = new javax.swing.JLabel();
        cadCodDisciplinaPosGrad = new javax.swing.JLabel();
        cadCargaHDisciplinaPosGrad = new javax.swing.JLabel();
        cadCpfProfDisciplinaPosGrad = new javax.swing.JLabel();
        nomeDisciplinaPosGrad = new javax.swing.JTextField();
        codDisciplinaPosGrad = new javax.swing.JTextField();
        cargaHDisciplinaPosGrad = new javax.swing.JTextField();
        cpfProfDisciplinaPosGrad = new javax.swing.JTextField();
        cadastrarDisciplinaPosGrad = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Disciplina de Pós Graduação");

        cadNomeDisciplinaPosGrad.setText("Nome:");

        cadCodDisciplinaPosGrad.setText("Código:");

        cadCargaHDisciplinaPosGrad.setText("Carga Horarária:");

        cadCpfProfDisciplinaPosGrad.setText("Professor:");

        nomeDisciplinaPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDisciplinaPosGradActionPerformed(evt);
            }
        });

        cpfProfDisciplinaPosGrad.setText("cpf");
        cpfProfDisciplinaPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfProfDisciplinaPosGradActionPerformed(evt);
            }
        });

        cadastrarDisciplinaPosGrad.setText("Finalizar Cadastro da Disciplina");
        cadastrarDisciplinaPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarDisciplinaPosGradActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadCargaHDisciplinaPosGrad)
                        .addGap(17, 17, 17)
                        .addComponent(cargaHDisciplinaPosGrad))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrarDisciplinaPosGrad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadCpfProfDisciplinaPosGrad)
                        .addGap(8, 8, 8)
                        .addComponent(cpfProfDisciplinaPosGrad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadCodDisciplinaPosGrad)
                            .addComponent(cadNomeDisciplinaPosGrad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codDisciplinaPosGrad)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nomeDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadNomeDisciplinaPosGrad)
                    .addComponent(nomeDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCodDisciplinaPosGrad)
                    .addComponent(codDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCargaHDisciplinaPosGrad)
                    .addComponent(cargaHDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCpfProfDisciplinaPosGrad)
                    .addComponent(cpfProfDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cadastrarDisciplinaPosGrad)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDisciplinaPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDisciplinaPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDisciplinaPosGradActionPerformed

    private void cadastrarDisciplinaPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarDisciplinaPosGradActionPerformed
         // TODO add your handling code here:        
        DisciplinaPosGraduacao disciplinaPos = new DisciplinaPosGraduacao();
        
        if (disciplinaPos.setNome(nomeDisciplinaPosGrad.getText())            &&
            disciplinaPos.setCodigo(codDisciplinaPosGrad.getText())           &&
            disciplinaPos.setCargaHoraria(cargaHDisciplinaPosGrad.getText())  &&
            EntradaDeDados.isCpf(cpfProfDisciplinaPosGrad.getText())       &&
            DadosProfessores.buscar(cpfProfDisciplinaPosGrad.getText()) != null)
         { 
            disciplinaPos.setProfessor(DadosProfessores.buscar(cpfProfDisciplinaPosGrad.getText()));
            DadosDisciplinasPosGraduacao.cadastrar(disciplinaPos);   
            nomeDisciplinaPosGrad.setText("");
            codDisciplinaPosGrad.setText("");
            cargaHDisciplinaPosGrad.setText("");
            cpfProfDisciplinaPosGrad.setText("cpf");
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!"); 
         }else{        
            if (!disciplinaPos.setNome(nomeDisciplinaPosGrad.getText()))
                nomeDisciplinaPosGrad.setText("Entrada Inválida");
            if (!disciplinaPos.setCodigo(codDisciplinaPosGrad.getText()))
                codDisciplinaPosGrad.setText("Entrada Inválida");
            if (!disciplinaPos.setCargaHoraria(cargaHDisciplinaPosGrad.getText()))
                cargaHDisciplinaPosGrad.setText("Entrada Inválida");
            if (!EntradaDeDados.isCpf(cpfProfDisciplinaPosGrad.getText()))
                cpfProfDisciplinaPosGrad.setText("CPF inválido.");
            if (DadosProfessores.buscar(cpfProfDisciplinaPosGrad.getText()) == null)
                cpfProfDisciplinaPosGrad.setText("CPF não encontrado.");
            JOptionPane.showMessageDialog(null,"Itens com entrada iválida. Favor corrigir!");
        }
    }//GEN-LAST:event_cadastrarDisciplinaPosGradActionPerformed

    private void cpfProfDisciplinaPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfProfDisciplinaPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfProfDisciplinaPosGradActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadCargaHDisciplinaPosGrad;
    private javax.swing.JLabel cadCodDisciplinaPosGrad;
    private javax.swing.JLabel cadCpfProfDisciplinaPosGrad;
    private javax.swing.JLabel cadNomeDisciplinaPosGrad;
    private javax.swing.JButton cadastrarDisciplinaPosGrad;
    private javax.swing.JTextField cargaHDisciplinaPosGrad;
    private javax.swing.JTextField codDisciplinaPosGrad;
    private javax.swing.JTextField cpfProfDisciplinaPosGrad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomeDisciplinaPosGrad;
    // End of variables declaration//GEN-END:variables
}