/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class VistaCamara extends javax.swing.JFrame {

    /**
     * Creates new form VistaCamara
     */
    public VistaCamara() {
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

        PanelOpcionesPA = new javax.swing.JPanel();
        BtnApagar = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LbNombreCamara = new javax.swing.JLabel();
        PanelCamara = new javax.swing.JPanel();
        BtnTomarFoto = new javax.swing.JButton();
        BtnGuardarFoto = new javax.swing.JButton();
        LbFotoTomada = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbPlacaResultante = new javax.swing.JLabel();
        LbPropietarioResultante = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(845, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(845, 520));

        PanelOpcionesPA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        BtnApagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/ApagarCamara.png"))); // NOI18N
        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });

        BtnIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/EncenderCamara.png"))); // NOI18N
        BtnIniciar.setText("INICIAR");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Camara en uso");

        LbNombreCamara.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LbNombreCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNombreCamara.setText("-");

        javax.swing.GroupLayout PanelOpcionesPALayout = new javax.swing.GroupLayout(PanelOpcionesPA);
        PanelOpcionesPA.setLayout(PanelOpcionesPALayout);
        PanelOpcionesPALayout.setHorizontalGroup(
            PanelOpcionesPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesPALayout.createSequentialGroup()
                .addGroup(PanelOpcionesPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbNombreCamara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelOpcionesPALayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelOpcionesPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(BtnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(PanelOpcionesPALayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOpcionesPALayout.setVerticalGroup(
            PanelOpcionesPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcionesPALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbNombreCamara)
                .addGap(98, 98, 98))
        );

        PanelCamara.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelCamaraLayout = new javax.swing.GroupLayout(PanelCamara);
        PanelCamara.setLayout(PanelCamaraLayout);
        PanelCamaraLayout.setHorizontalGroup(
            PanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanelCamaraLayout.setVerticalGroup(
            PanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        BtnTomarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/TomarFoto.png"))); // NOI18N
        BtnTomarFoto.setText("Tomar");

        BtnGuardarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/GuardarFoto.png"))); // NOI18N
        BtnGuardarFoto.setText("Guardar");

        LbFotoTomada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Placa:");

        jLabel3.setText("Propietario:");

        LbPlacaResultante.setText("-");

        LbPropietarioResultante.setText("-");

        jMenu1.setText("Tema");

        jMenuItem1.setText("Modo Claro");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modo Oscuro");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Modo Alto Contraste");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Creditos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelOpcionesPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnTomarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnGuardarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbFotoTomada, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(LbPlacaResultante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LbPropietarioResultante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelOpcionesPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(LbFotoTomada, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(LbPlacaResultante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbPropietarioResultante)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTomarFoto)
                            .addComponent(BtnGuardarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnApagarActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIniciarActionPerformed

    public JButton getBtnApagar() {
        return BtnApagar;
    }

    public void setBtnApagar(JButton BtnApagar) {
        this.BtnApagar = BtnApagar;
    }

    public JButton getBtnGuardarFoto() {
        return BtnGuardarFoto;
    }

    public void setBtnGuardarFoto(JButton BtnGuardarFoto) {
        this.BtnGuardarFoto = BtnGuardarFoto;
    }

    public JButton getBtnIniciar() {
        return BtnIniciar;
    }

    public void setBtnIniciar(JButton BtnIniciar) {
        this.BtnIniciar = BtnIniciar;
    }

    public JButton getBtnTomarFoto() {
        return BtnTomarFoto;
    }

    public void setBtnTomarFoto(JButton BtnTomarFoto) {
        this.BtnTomarFoto = BtnTomarFoto;
    }

    public JLabel getLbFotoTomada() {
        return LbFotoTomada;
    }

    public void setLbFotoTomada(JLabel LbFotoTomada) {
        this.LbFotoTomada = LbFotoTomada;
    }

    public JLabel getLbNombreCamara() {
        return LbNombreCamara;
    }

    public void setLbNombreCamara(JLabel LbNombreCamara) {
        this.LbNombreCamara = LbNombreCamara;
    }

    public JLabel getLbPropietarioResultante() {
        return LbPropietarioResultante;
    }

    public void setLbPropietarioResultante(JLabel LbPropietarioResultante) {
        this.LbPropietarioResultante = LbPropietarioResultante;
    }

    public JPanel getPanelCamara() {
        return PanelCamara;
    }

    public void setPanelCamara(JPanel PanelCamara) {
        this.PanelCamara = PanelCamara;
    }
    
    //Getters y Setters
    
    
    
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
            java.util.logging.Logger.getLogger(VistaCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCamara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnGuardarFoto;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnTomarFoto;
    private javax.swing.JLabel LbFotoTomada;
    private javax.swing.JLabel LbNombreCamara;
    private javax.swing.JLabel LbPlacaResultante;
    private javax.swing.JLabel LbPropietarioResultante;
    private javax.swing.JPanel PanelCamara;
    private javax.swing.JPanel PanelOpcionesPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}