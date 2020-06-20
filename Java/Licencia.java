import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
private JTextArea texto;
private JLabel label1, label2;
private JButton boton1, boton2;
private JScrollPane barra1;
private JCheckBox check1;
String nombre = "";

  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de Uso");
   setIconImage(new ImageIcon(getClass().getResource("image/icono.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto1;
   
   label1 = new JLabel("TERMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono", 1, 14));
   label1.setForeground(new Color(0, 0, 0));
   add(label1);
   
   texto = new JTextArea();
   texto.setEditable(false);
   texto.setFont(new Font("Andale Mono", 0, 9));
   texto.setText("\n\n          TÉRMINOS Y CONDICIONES" +  
                 "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DEl AUTOR DE ESTE PROGRAMA." + 
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  EL CREADORDE ESTE PROGRAMA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (FRANK LOPEZ), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                    "\n\n        ESTE PROGRAMA ES NETAMENTE DE PRACTICA PARA EL CRECIMIENTO PERSONAL, SIN FINES DE LUCRO" +
                    "\n          NI MUCHO MENOS PARA  DAÑAR LA IMAGEN Y MARCA QUE EN ESTE PEQUEÑO EJERCICIO SE REALIZO" );

   barra1 = new JScrollPane(texto);
   barra1.setBounds(10,40,575,200);
   add(barra1);

   check1 = new JCheckBox("Yo " + nombre +  " Acepto");
   check1.setBounds(10,250,300,30);
   check1.addChangeListener(this);
   add(check1);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,290,100,30);
   boton1.addActionListener(this);
   boton1.setEnabled(false);
   add(boton1);

   boton2 = new JButton("No Acepto");
   boton2.setBounds(120,290,100,30);
   boton2.addActionListener(this);
   boton2.setEnabled(true);
   add(boton2);

  ImageIcon imagen = new ImageIcon("image/ramos.png");
  label2 = new JLabel(imagen);
  label2.setBounds(225,135,350,300);
  add(label2);

} 
 
  public void stateChanged(ChangeEvent e){
      if(check1.isSelected() == true){
        boton1.setEnabled(true);
        boton2.setEnabled(false);
    } else{
        boton1.setEnabled(false);
        boton2.setEnabled(true);
  }
}

  public void actionPerformed(ActionEvent e){
      if(e.getSource() == boton1){       

    Principal ventana3 = new Principal();
     ventana3.setBounds(0, 0, 640, 700);
      ventana3.setVisible(true);
       ventana3.setResizable(false);
        ventana3.setLocationRelativeTo(null);
          this.setVisible(false);
 } 

    else if(e.getSource() == boton2){
      Bienvenida ventana1 = new Bienvenida();
       ventana1.setBounds(0,0,550,450);
        ventana1.setVisible(true);
         ventana1.setResizable(false);
          ventana1.setLocationRelativeTo(null);
           this.setVisible(false);
   }
}

  public static void main(String args[]){
  Licencia ventana2 = new Licencia();
  ventana2.setBounds(0,0,600,360);
  ventana2.setVisible(true);
  ventana2.setResizable(false);
  ventana2.setLocationRelativeTo(null);
 }
}   