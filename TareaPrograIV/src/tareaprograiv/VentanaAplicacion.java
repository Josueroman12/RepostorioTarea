/*
    Programacion IV

Alumno:
    Gilberto Josué Román Barrantes
    cd: 207260387
    

Profesor:
    LIC. CRISTHIAN GARITA 

Ciclo I
Año: 2016 
*/
package tareaprograiv;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class VentanaAplicacion extends JFrame {
        
    public VentanaAplicacion(){
        super("Tarea");
    }
     
   public void ajustarConfiguracion(){
        this.setSize(300,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
   
    public void mostrar(){
        this.setVisible(true);
    }
    
     public void cerrarAplicacion(){
        if(JOptionPane.showConfirmDialog(this,
                "¿Desea cerrar la aplicación?" ,"Confirmar",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    } 
     
  
    public void agregarComponentes(Container c){
       panel = new JPanel();
       panel.add(etqHola = new JLabel("HOLA MUNDO"));
       c.add(panel);
    }
  
    
    public void configurarEventos(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                cerrarAplicacion();
            }
        });     
    }
    
    
    public void iniciar(){ 
        agregarComponentes(this.getContentPane());
        configurarEventos();
        ajustarConfiguracion();
        mostrar(); 
    }
   
    //Atributos
    private JPanel panel;
    private JLabel etqHola;
}
