/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.VistaCamara;
import Vistas.VistaPrincipal;

/**
 *
 * @author User
 */
public class ControlPrincipal {
    private VistaPrincipal ventanap;
    
    public ControlPrincipal(VistaPrincipal ventanap){
        this.ventanap = ventanap;
        ventanap.setTitle("Bienvenido");
        ventanap.setVisible(true);
    }
    public void iniciarcontrol(){
        ventanap.setVisible(true);
        ventanap.getBtnIniciarPrograma().addActionListener(l->iniciarPrograma());
    }
    
    public void iniciarPrograma(){
        VistaCamara v1=new VistaCamara();
        ControlCamara controlc=new ControlCamara(v1);
        controlc.iniciarControl();
        ventanap.dispose();
    }
}
