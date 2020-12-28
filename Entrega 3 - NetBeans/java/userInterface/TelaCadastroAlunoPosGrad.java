/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import entradas.*;
import recursosHumanos.*;
import persistencia.*;

import javax.swing.*;

/**
 *
 * @author unicamp
 */
public class TelaCadastroAlunoPosGrad extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaEquipe
     */
    public TelaCadastroAlunoPosGrad() {
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

        cadNomeAlunoPosGrad = new javax.swing.JLabel();
        cadCpfAlunoPosGrad = new javax.swing.JLabel();
        cadEndAlunoPosGrad = new javax.swing.JLabel();
        cadTelAlunoPosGrad = new javax.swing.JLabel();
        cadMatAlunoPosGrad = new javax.swing.JLabel();
        cadSitAlunoPosGrad = new javax.swing.JLabel();
        legendaSituacaoAlunoPosGrad = new javax.swing.JLabel();
        cadCurAlunoPosGrad = new javax.swing.JLabel();
        cadGradAlunoPosGrad = new javax.swing.JLabel();
        cadUniAlunoPosGrad = new javax.swing.JLabel();
        cadAnoInicioAlunoPosGrad1 = new javax.swing.JLabel();
        cadAnoFimAlunoPosGrad = new javax.swing.JLabel();
        nomeAlunoPosGrad = new javax.swing.JTextField();
        cpfAlunoPosGrad = new javax.swing.JTextField();
        endAlunoPosGrad = new javax.swing.JTextField();
        telAlunoPosGrad = new javax.swing.JTextField();
        matAlunoPosGrad = new javax.swing.JTextField();
        sitAlunoPosGrad = new javax.swing.JTextField();
        curAlunoPosGrad = new javax.swing.JTextField();
        gradAlunoPosGrad = new javax.swing.JTextField();
        uniAlunoPosGrad = new javax.swing.JTextField();
        anoInicAlunoPosGrad = new javax.swing.JTextField();
        anoFimAlunoPosGrad = new javax.swing.JTextField();
        cadastrarAlunoPosGrad = new javax.swing.JButton();
        cadCursoAlunoPosGrad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno de Pós Graduação");

        cadNomeAlunoPosGrad.setText("Nome:");

        cadCpfAlunoPosGrad.setText("CPF:");

        cadEndAlunoPosGrad.setText("Endereço:");

        cadTelAlunoPosGrad.setText("Telefone:");

        cadMatAlunoPosGrad.setText("Matricula:");

        cadSitAlunoPosGrad.setText("Situação:");

        legendaSituacaoAlunoPosGrad.setText("(M)atriculado | (T)trancado | (D)esligado");

        cadCurAlunoPosGrad.setText("Curso:");

        cadGradAlunoPosGrad.setText("Graduação:");

        cadUniAlunoPosGrad.setText("Universidade:");

        cadAnoInicioAlunoPosGrad1.setText("Ano Ingresso:");

        cadAnoFimAlunoPosGrad.setText("Ano Conclusão:");

        nomeAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoPosGradActionPerformed(evt);
            }
        });

        sitAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitAlunoPosGradActionPerformed(evt);
            }
        });

        curAlunoPosGrad.setText("código");

        gradAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradAlunoPosGradActionPerformed(evt);
            }
        });

        uniAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniAlunoPosGradActionPerformed(evt);
            }
        });

        anoInicAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoInicAlunoPosGradActionPerformed(evt);
            }
        });

        anoFimAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoFimAlunoPosGradActionPerformed(evt);
            }
        });

        cadastrarAlunoPosGrad.setText("Finalizar Cadastro");
        cadastrarAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoPosGradActionPerformed(evt);
            }
        });

        cadCursoAlunoPosGrad.setText("Cadastrar novo curso");
        cadCursoAlunoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCursoAlunoPosGradActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarAlunoPosGrad)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cadGradAlunoPosGrad)
                        .addGap(18, 18, 18)
                        .addComponent(gradAlunoPosGrad, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadUniAlunoPosGrad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uniAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cadNomeAlunoPosGrad)
                                .addComponent(cadCpfAlunoPosGrad)
                                .addComponent(cadEndAlunoPosGrad)
                                .addComponent(cadSitAlunoPosGrad)
                                .addComponent(cadCurAlunoPosGrad))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cpfAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cadTelAlunoPosGrad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telAlunoPosGrad))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(curAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cadCursoAlunoPosGrad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cadMatAlunoPosGrad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(matAlunoPosGrad, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sitAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(legendaSituacaoAlunoPosGrad))
                                .addComponent(endAlunoPosGrad)
                                .addComponent(nomeAlunoPosGrad)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cadAnoInicioAlunoPosGrad1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(anoInicAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cadAnoFimAlunoPosGrad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(anoFimAlunoPosGrad))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadNomeAlunoPosGrad)
                    .addComponent(nomeAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCpfAlunoPosGrad)
                    .addComponent(cpfAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadTelAlunoPosGrad)
                    .addComponent(telAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEndAlunoPosGrad)
                    .addComponent(endAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadCurAlunoPosGrad)
                        .addComponent(cadMatAlunoPosGrad)
                        .addComponent(matAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadCursoAlunoPosGrad))
                    .addComponent(curAlunoPosGrad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadSitAlunoPosGrad)
                    .addComponent(sitAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legendaSituacaoAlunoPosGrad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadGradAlunoPosGrad)
                    .addComponent(gradAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadUniAlunoPosGrad)
                    .addComponent(uniAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadAnoFimAlunoPosGrad)
                        .addComponent(anoFimAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadAnoInicioAlunoPosGrad1)
                        .addComponent(anoInicAlunoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(cadastrarAlunoPosGrad)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoPosGradActionPerformed

    private void cadastrarAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoPosGradActionPerformed
        // TODO add your handling code here:  
        System.out.println("\u000C");
        AlunoPosGraduacao alunoPosGrad = new AlunoPosGraduacao(); 
        
        if ( alunoPosGrad.setNome(nomeAlunoPosGrad.getText())          &&
             EntradaDeDados.isCpf(cpfAlunoPosGrad.getText())           &&
             alunoPosGrad.setCpf(cpfAlunoPosGrad.getText())            &&
             alunoPosGrad.setEndereco(endAlunoPosGrad.getText())       &&
             alunoPosGrad.setTelefone(telAlunoPosGrad.getText())       &&
             alunoPosGrad.setMatricula(matAlunoPosGrad.getText())      &&
             alunoPosGrad.setSituacao(sitAlunoPosGrad.getText())       &&
             alunoPosGrad.setGraduacao(gradAlunoPosGrad.getText())     &&
             alunoPosGrad.setUniversidade(uniAlunoPosGrad.getText())   &&
             alunoPosGrad.setAno_inicio(Integer.valueOf(anoInicAlunoPosGrad.getText())) &&
             alunoPosGrad.setAno_fim(Integer.valueOf(anoFimAlunoPosGrad.getText()))     &&
             DadosCursoPosGraduacao.buscar(curAlunoPosGrad.getText()) !=  null)
        {
            alunoPosGrad.setCursoPosGraduacao(DadosCursoPosGraduacao.buscar(curAlunoPosGrad.getText()));
            DadosAlunoPosGraduacao.cadastrar(alunoPosGrad); 
            nomeAlunoPosGrad.setText("");
            cpfAlunoPosGrad.setText("");
            endAlunoPosGrad.setText("");
            telAlunoPosGrad.setText("");
            matAlunoPosGrad.setText("");
            sitAlunoPosGrad.setText("");
            curAlunoPosGrad.setText("cod");  
            gradAlunoPosGrad.setText(""); 
            uniAlunoPosGrad.setText(""); 
            anoInicAlunoPosGrad.setText(""); 
            anoFimAlunoPosGrad.setText("");
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");         
        }else{
            JOptionPane.showMessageDialog(null,"Itens com entrada iválida. Favor corrigir!");
            
            if (!alunoPosGrad.setNome(nomeAlunoPosGrad.getText()))
                nomeAlunoPosGrad.setText("Entrada Inválida");
            if (!EntradaDeDados.isCpf(cpfAlunoPosGrad.getText()))
                cpfAlunoPosGrad.setText("Entrada Inválida");
            if (!alunoPosGrad.setEndereco(endAlunoPosGrad.getText()))
                endAlunoPosGrad.setText("Entrada Inválida");
            if (!alunoPosGrad.setTelefone(telAlunoPosGrad.getText()))
                telAlunoPosGrad.setText("Entrada Inválida");
            if (!alunoPosGrad.setMatricula(matAlunoPosGrad.getText()))
                matAlunoPosGrad.setText("Entrada Inválida");
            if (!alunoPosGrad.setSituacao(sitAlunoPosGrad.getText()))
                sitAlunoPosGrad.setText("Entrada Inválida");
            if (!alunoPosGrad.setGraduacao(gradAlunoPosGrad.getText()))
                gradAlunoPosGrad.setText("Entrada Inválida"); 
            if (!alunoPosGrad.setUniversidade(uniAlunoPosGrad.getText()))
                uniAlunoPosGrad.setText("Entrada Inválida"); 
            if (!alunoPosGrad.setAno_inicio(Integer.valueOf(anoInicAlunoPosGrad.getText())))
                anoInicAlunoPosGrad.setText("Entrada Inválida"); 
            if (!alunoPosGrad.setAno_fim(Integer.valueOf(anoFimAlunoPosGrad.getText())))
                anoFimAlunoPosGrad.setText("Entrada Inválida");
            if (DadosCursoPosGraduacao.buscar(curAlunoPosGrad.getText()) ==  null)
                curAlunoPosGrad.setText("Curso " + curAlunoPosGrad.getText() + " não encontrado.");
        }        
    }//GEN-LAST:event_cadastrarAlunoPosGradActionPerformed

    private void cadCursoAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCursoAlunoPosGradActionPerformed
        // TODO add your handling code here: 
        System.out.println("\u000C");
        new TelaCadastroCursoPosGrad().setVisible(true);
    }//GEN-LAST:event_cadCursoAlunoPosGradActionPerformed

    private void sitAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sitAlunoPosGradActionPerformed

    private void gradAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradAlunoPosGradActionPerformed

    private void uniAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniAlunoPosGradActionPerformed

    private void anoInicAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoInicAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoInicAlunoPosGradActionPerformed

    private void anoFimAlunoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoFimAlunoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoFimAlunoPosGradActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFimAlunoPosGrad;
    private javax.swing.JTextField anoInicAlunoPosGrad;
    private javax.swing.JLabel cadAnoFimAlunoPosGrad;
    private javax.swing.JLabel cadAnoInicioAlunoPosGrad1;
    private javax.swing.JLabel cadCpfAlunoPosGrad;
    private javax.swing.JLabel cadCurAlunoPosGrad;
    private javax.swing.JButton cadCursoAlunoPosGrad;
    private javax.swing.JLabel cadEndAlunoPosGrad;
    private javax.swing.JLabel cadGradAlunoPosGrad;
    private javax.swing.JLabel cadMatAlunoPosGrad;
    private javax.swing.JLabel cadNomeAlunoPosGrad;
    private javax.swing.JLabel cadSitAlunoPosGrad;
    private javax.swing.JLabel cadTelAlunoPosGrad;
    private javax.swing.JLabel cadUniAlunoPosGrad;
    private javax.swing.JButton cadastrarAlunoPosGrad;
    private javax.swing.JTextField cpfAlunoPosGrad;
    private javax.swing.JTextField curAlunoPosGrad;
    private javax.swing.JTextField endAlunoPosGrad;
    private javax.swing.JTextField gradAlunoPosGrad;
    private javax.swing.JLabel legendaSituacaoAlunoPosGrad;
    private javax.swing.JTextField matAlunoPosGrad;
    private javax.swing.JTextField nomeAlunoPosGrad;
    private javax.swing.JTextField sitAlunoPosGrad;
    private javax.swing.JTextField telAlunoPosGrad;
    private javax.swing.JTextField uniAlunoPosGrad;
    // End of variables declaration//GEN-END:variables
}
