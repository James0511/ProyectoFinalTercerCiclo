/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.VCamara;
import Vistas.VLogin;
import Vistas.VPrincipal;
import java.awt.Dimension;

/**
 *
 * @author User
 */
public class ControlPrincipal {
    private VLogin ventanap;
    
    public ControlPrincipal(VLogin ventanap){
        this.ventanap = ventanap;
        ventanap.setTitle("Bienvenido");
        ventanap.setVisible(true);
    }
    public void iniciarcontrol(){
        ventanap.setVisible(true);
        ventanap.getBtn_iniciarsesion().addActionListener(l->iniciarPrograma());
    }
    
    public void iniciarPrograma(){
        VPrincipal vp = new VPrincipal();

        VCamara vcam = new VCamara();
        ControlCamara controlc = new ControlCamara(vcam);

        controlc.iniciarControl();
        vp.getDtp_principal().add(vcam);
        Dimension desktopSize = vp.getDtp_principal().getSize();
        Dimension jInternalFrameSize = vcam.getSize();
        vcam.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        ventanap.dispose();
        vp.setVisible(true);
    }
}
