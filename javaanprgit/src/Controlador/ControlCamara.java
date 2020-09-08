
package Controlador;

import Vistas.VistaCamara;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControlCamara {
    
    private VistaCamara Vcamara;

    public ControlCamara(VistaCamara Vcamara) {
        this.Vcamara = Vcamara;
        this.Vcamara.setVisible(true);
    }
    //Conexion de la camara
    int contador = 0;//para contar el numero de foto 
    Dimension dimension = new Dimension(360,300);//dimensiones de el cuadro de la camara
    Dimension dimension1 = WebcamResolution.VGA.getSize();//Depende de la camara  //hay otro de hd720
    Webcam webcam = Webcam.getDefault();
    WebcamPanel webcampanel = new WebcamPanel(webcam, dimension, false);
    
    String TextoReconocido = "";
    BufferedImage ruta;    
    
    public void iniciarControl(){
        ApagarBotones();
        Vcamara.getBtnIniciar().addActionListener(l-> InicializarCamara());
        Vcamara.getBtnApagar().addActionListener(l-> ApagarCamara());
        Vcamara.getBtnTomarFoto().addActionListener(l-> CapturarFoto());
        Vcamara.getBtnGuardarFoto().addActionListener(l-> GuardarFoto());
    }
    
    public void InicializarCamara(){
        webcam.setViewSize(dimension1);
        webcampanel.setFillArea(true);
        Vcamara.getPanelCamara().setLayout(new FlowLayout());
        Vcamara.getPanelCamara().add(webcampanel);
        Vcamara.getLbNombreCamara().setText(webcam.toString());
        IniciarBtnCamara();
    }
    
    public void ApagarBotones(){
        Vcamara.getBtnIniciar().setEnabled(true);
        Vcamara.getBtnApagar().setEnabled(false);
        Vcamara.getBtnTomarFoto().setEnabled(false);
        Vcamara.getBtnGuardarFoto().setEnabled(false);
    }
    
    public void PrenderBotones(){
        Vcamara.getBtnApagar().setEnabled(true);
        Vcamara.getBtnTomarFoto().setEnabled(true);
    }
    
    public void IniciarBtnCamara(){
        Thread hilo = new Thread(){
            public void run(){
                webcampanel.start();
                PrenderBotones();
            } 
        };
        hilo.setDaemon(true);
        hilo.start();
        Vcamara.getBtnIniciar().setEnabled(false);
    }
    
    public void ApagarCamara(){
        webcampanel.stop();
        ApagarBotones();
        Vcamara.getLbFotoTomada().setIcon(null);
    }
    
    public void CapturarFoto(){
        Vcamara.getBtnGuardarFoto().setEnabled(true);
        
        ImageIcon Foto;
        Foto = new ImageIcon(webcam.getImage());
        Icon IconoFoto=new ImageIcon(Foto.getImage().getScaledInstance(Vcamara.getLbFotoTomada().getWidth(), Vcamara.getLbFotoTomada().getHeight(), Image.SCALE_SMOOTH));
        Vcamara.getLbFotoTomada().setIcon(IconoFoto);
        
        ruta = webcam.getImage();        
    }
    
    public void GuardarFoto(){
        int pregunta = JOptionPane.showConfirmDialog(null, "¿Guardar Fotografia?","PREGUNTA",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        
        if(pregunta == 0){
            
            File salidaImagen = new File("Foto"+contador+".jpg");
            
            try{
                ImageIO.write(ruta, "jpg", salidaImagen);
                JOptionPane.showMessageDialog(null, "Imagen guardada en: "+ salidaImagen.getAbsolutePath());
            }catch(Exception e){
                System.out.println("Error: "+e);                
            }
            
            Vcamara.getLbFotoTomada().setIcon(null);
            Vcamara.getBtnGuardarFoto().setEnabled(false);
        }
        contador++;
    }
}
