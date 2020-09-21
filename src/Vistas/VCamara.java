
package Vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class VCamara extends javax.swing.JInternalFrame{

    
    public VCamara() {
        initComponents();
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnApagar = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LbNombreCamara = new javax.swing.JLabel();
        BtnGuardarFoto = new javax.swing.JButton();
        BtnTomarFoto = new javax.swing.JButton();
        PanelCamara = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        LbFotoTomada = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LbEntrada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbPropietario = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        LbPlacaObtenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Camara java");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        BtnApagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ApagarCamara.png"))); // NOI18N
        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });

        BtnIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EncenderCamara.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addComponent(LbNombreCamara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(BtnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LbNombreCamara)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );

        BtnGuardarFoto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnGuardarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuardarFoto.png"))); // NOI18N
        BtnGuardarFoto.setText("Guardar");
        BtnGuardarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarFotoActionPerformed(evt);
            }
        });

        BtnTomarFoto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnTomarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TomarFoto.png"))); // NOI18N
        BtnTomarFoto.setText("Tomar");
        BtnTomarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTomarFotoActionPerformed(evt);
            }
        });

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

        LbFotoTomada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Placa:");

        jLabel3.setText("Propietario:");

        LbPropietario.setText("-");

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        LbPlacaObtenida.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LbFotoTomada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbPlacaObtenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnTomarFoto)
                        .addGap(64, 64, 64)
                        .addComponent(BtnGuardarFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(LbFotoTomada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbPlacaObtenida)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(LbPropietario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnTomarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnGuardarFoto)
                        .addComponent(Volver)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarFotoActionPerformed
        // TODO add your handling code here:                     
    }//GEN-LAST:event_BtnGuardarFotoActionPerformed
            
    private void BtnTomarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTomarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTomarFotoActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnApagarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:+
    }//GEN-LAST:event_VolverActionPerformed
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCamara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCamara().setVisible(true);
            }
        });
    }
    
    //Getters y Setters
       
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
    
    public JPanel getPanelCamara() {
        return PanelCamara;
    }

    public void setPanelCamara(JPanel PanelCamara) {
        this.PanelCamara = PanelCamara;
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
    
    public JLabel getLbEntrada() {
        return LbEntrada;
    }

    public void setLbEntrada(JLabel LbEntrada) {
        this.LbEntrada = LbEntrada;
    }

    public JLabel getLbPlacaObtenida() {
        return LbPlacaObtenida;
    }

    public void setLbPlacaObtenida(JLabel LbPlacaObtenida) {
        this.LbPlacaObtenida = LbPlacaObtenida;
    }

    public JLabel getLbPropietario() {
        return LbPropietario;
    }

    public void setLbPropietario(JLabel LbPropietario) {
        this.LbPropietario = LbPropietario;
    }    
    //Fin Getters y Setters
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnGuardarFoto;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnTomarFoto;
    private javax.swing.JLabel LbEntrada;
    private javax.swing.JLabel LbFotoTomada;
    private javax.swing.JLabel LbNombreCamara;
    private javax.swing.JLabel LbPlacaObtenida;
    private javax.swing.JLabel LbPropietario;
    private javax.swing.JPanel PanelCamara;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
