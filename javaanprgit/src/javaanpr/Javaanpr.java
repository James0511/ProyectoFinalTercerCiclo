
package javaanpr;

import Controlador.ControlPrincipal;
import Vistas.VistaPrincipal;
/**
 *
 * @author User
 */
public class Javaanpr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaPrincipal ventana= new VistaPrincipal();
        ControlPrincipal cp=new ControlPrincipal(ventana);
        cp.iniciarcontrol();
    }
    
}
