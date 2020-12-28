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
public class TelaCadastroCursoPosGrad extends javax.swing.JFrame {
    
    boolean teste = false;

    /**
     * Creates new form TelaConsultaEquipe
     */
        
    public TelaCadastroCursoPosGrad() {
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

        cadNomeCursoPosGrad = new javax.swing.JLabel();
        cadCodCursoPosGrad = new javax.swing.JLabel();
        cadDurCursoPosGrad = new javax.swing.JLabel();
        cadDisciplinaCursoPosGrad = new javax.swing.JLabel();
        nomeCursoPosGrad = new javax.swing.JTextField();
        codCursoPosGrad = new javax.swing.JTextField();
        durCursoPosGrad = new javax.swing.JTextField();
        cadastrarCursoGrad = new javax.swing.JButton();
        cadDisciplinaGrad = new javax.swing.JButton();
        codDisciplinaPosGrad = new javax.swing.JTextField();
        adicionarDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Curso de Pós Graduação");

        cadNomeCursoPosGrad.setText("Nome:");

        cadCodCursoPosGrad.setText("Código:");

        cadDurCursoPosGrad.setText("Duração:");

        cadDisciplinaCursoPosGrad.setText("Disciplinas:");

        nomeCursoPosGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoPosGradActionPerformed(evt);
            }
        });

        cadastrarCursoGrad.setText("Finalizar Cadastro do Curso");
        cadastrarCursoGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCursoGradActionPerformed(evt);
            }
        });

        cadDisciplinaGrad.setText("Cadastrar uma nova disciplina");
        cadDisciplinaGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadDisciplinaGradActionPerformed(evt);
            }
        });

        codDisciplinaPosGrad.setText("código da disciplina");

        adicionarDisciplina.setText("Adicionar disciplina ao curso");
        adicionarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarDisciplinaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadNomeCursoPosGrad)
                            .addComponent(cadCodCursoPosGrad)
                            .addComponent(cadDurCursoPosGrad)
                            .addComponent(cadDisciplinaCursoPosGrad))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCursoPosGrad)
                            .addComponent(codCursoPosGrad)
                            .addComponent(durCursoPosGrad)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadDisciplinaGrad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adicionarDisciplina)))
                                .addGap(0, 176, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrarCursoGrad)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadNomeCursoPosGrad)
                    .addComponent(nomeCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCodCursoPosGrad)
                    .addComponent(codCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadDurCursoPosGrad)
                    .addComponent(durCursoPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codDisciplinaPosGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadDisciplinaCursoPosGrad)
                    .addComponent(adicionarDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadDisciplinaGrad)
                .addGap(33, 33, 33)
                .addComponent(cadastrarCursoGrad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCursoPosGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoPosGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursoPosGradActionPerformed

    private void cadastrarCursoGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCursoGradActionPerformed
        // TODO add your handling code here:        
        //new TelaCadastroCursoPosGrad().setVisible(true);
        if (teste)
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!"); 
            nomeCursoPosGrad.setText("");
            codCursoPosGrad.setText("");
            durCursoPosGrad.setText("");
            codDisciplinaPosGrad.setText("código da disciplina");
    }//GEN-LAST:event_cadastrarCursoGradActionPerformed

    private void cadDisciplinaGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadDisciplinaGradActionPerformed
        // TODO add your handling code here:
        new TelaCadastroDisciplinaPosGrad().setVisible(true);
    }//GEN-LAST:event_cadDisciplinaGradActionPerformed

    private void adicionarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarDisciplinaActionPerformed
        // TODO add your handling code here:
        CursoPosGraduacao cursoPosGrad = new CursoPosGraduacao(); 
        DisciplinaPosGraduacao d;
        d = DadosDisciplinasPosGraduacao.buscar(codDisciplinaPosGrad.getText());
        if (d == null)
            JOptionPane.showMessageDialog(null,"Disciplina não encontrada"); 
        else{
            if (DadosCursoPosGraduacao.buscar(codCursoPosGrad.getText()) == null){
                if (cursoPosGrad.setNome(nomeCursoPosGrad.getText())  &&
                    cursoPosGrad.setCodigo(codCursoPosGrad.getText()) &&
                    cursoPosGrad.setDuracao(durCursoPosGrad.getText())   )
                {            
                    
                    DadosCursoPosGraduacao.cadastrar(cursoPosGrad);
                    codDisciplinaPosGrad.setText("código da disciplina");
                    teste = true;
                }
            }
            cursoPosGrad.cadastrar(d);
            JOptionPane.showMessageDialog(null,"Disciplina adicionada ao curso");
        }
    }//GEN-LAST:event_adicionarDisciplinaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarDisciplina;
    private javax.swing.JLabel cadCodCursoPosGrad;
    private javax.swing.JLabel cadDisciplinaCursoPosGrad;
    private javax.swing.JButton cadDisciplinaGrad;
    private javax.swing.JLabel cadDurCursoPosGrad;
    private javax.swing.JLabel cadNomeCursoPosGrad;
    private javax.swing.JButton cadastrarCursoGrad;
    private javax.swing.JTextField codCursoPosGrad;
    private javax.swing.JTextField codDisciplinaPosGrad;
    private javax.swing.JTextField durCursoPosGrad;
    private javax.swing.JTextField nomeCursoPosGrad;
    // End of variables declaration//GEN-END:variables
}