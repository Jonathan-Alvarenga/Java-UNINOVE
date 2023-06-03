
import javax.swing.JOptionPane;

public class TelaNotas extends javax.swing.JFrame {

    public TelaNotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAluno = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        lblDisciplina = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        lblNumeroAulas = new javax.swing.JLabel();
        txtNumeroAulas = new javax.swing.JTextField();
        lblNumeroFaltas = new javax.swing.JLabel();
        txtNumeroFaltas = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de notas");
        getContentPane().setLayout(null);

        lblAluno.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        lblAluno.setForeground(new java.awt.Color(255, 255, 255));
        lblAluno.setText("Aluno : ");
        getContentPane().add(lblAluno);
        lblAluno.setBounds(20, 30, 50, 30);

        txtAluno.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        txtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAluno);
        txtAluno.setBounds(90, 30, 280, 30);

        lblDisciplina.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        lblDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        lblDisciplina.setText("Disciplina :");
        getContentPane().add(lblDisciplina);
        lblDisciplina.setBounds(20, 70, 70, 30);

        txtDisciplina.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        txtDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDisciplina);
        txtDisciplina.setBounds(90, 70, 280, 30);

        lblNota.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Nota : ");
        getContentPane().add(lblNota);
        lblNota.setBounds(20, 110, 50, 30);

        txtNota.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNota);
        txtNota.setBounds(90, 110, 280, 30);

        lblNumeroAulas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        lblNumeroAulas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroAulas.setText("N.Aulas : ");
        getContentPane().add(lblNumeroAulas);
        lblNumeroAulas.setBounds(20, 150, 60, 30);

        txtNumeroAulas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        txtNumeroAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAulasActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroAulas);
        txtNumeroAulas.setBounds(90, 150, 280, 30);

        lblNumeroFaltas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        lblNumeroFaltas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroFaltas.setText("N.Faltas:");
        getContentPane().add(lblNumeroFaltas);
        lblNumeroFaltas.setBounds(20, 190, 50, 30);

        txtNumeroFaltas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        txtNumeroFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroFaltasActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroFaltas);
        txtNumeroFaltas.setBounds(90, 190, 280, 30);

        btnResultado.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        btnResultado.setText("Ver resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado);
        btnResultado.setBounds(20, 240, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-657982726-612x612.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 410, 320);

        setSize(new java.awt.Dimension(414, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlunoActionPerformed

    private void txtDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisciplinaActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaActionPerformed

    private void txtNumeroAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAulasActionPerformed

    private void txtNumeroFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroFaltasActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        double nota;
        int nFaltas, nAulas;
        String status;
        try {
            nota = Double.parseDouble(txtNota.getText());
            nFaltas = Integer.parseInt(txtNumeroFaltas.getText());
            nAulas = Integer.parseInt(txtNumeroAulas.getText());

            status = NotasService.verificarAprovacao(nota, nAulas, nFaltas);
            JOptionPane.showMessageDialog(null, txtAluno.getText() + ", você foi " + status + " na disciplina de " + txtDisciplina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos nos campos nota , faltas e aulas !");
        }

        limparTela();
        


    }//GEN-LAST:event_btnResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotas().setVisible(true);
            }
        });
    }

    private void limparTela() {

        txtAluno.setText("");
        txtDisciplina.setText("");
        txtNota.setText("");
        txtNumeroAulas.setText("");
        txtNumeroFaltas.setText("");
        txtAluno.requestFocus();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNumeroAulas;
    private javax.swing.JLabel lblNumeroFaltas;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtNumeroAulas;
    private javax.swing.JTextField txtNumeroFaltas;
    // End of variables declaration//GEN-END:variables
}
