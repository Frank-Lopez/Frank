import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
private JTextField texto;
private JLabel label1, label2, label3, label4;
private JButton boton1;
public static String texto1 = "";

public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,255,255));
   setIconImage(new ImageIcon(getClass().getResource("image/icono.png")).getImage());

   ImageIcon imagen = new ImageIcon("image/bienvenida.png");
   label1 = new JLabel(imagen);
   label1.setBounds(35,5,450,150);
   add(label1);

   label2 = new JLabel("Sistema de Reparto de Entrada a Socios y Abonados");
   label2.setBounds(35,180,500,30);
   label2.setFont(new Font("Andele Mono", 3, 18));
   label2.setForeground(new Color(0,82,159));
   add(label2);


   label3 = new JLabel("Ingrese su nombre");
   label3.setBounds(195,212,200,30);
   label3.setFont(new Font("Andele Mono", 1, 12));
   label3.setForeground(new Color(0,82,159));
   add(label3);


   label4 = new JLabel("Real Madrid Club de Futbol");
   label4.setBounds(175,375,300,30);
   label4.setFont(new Font("Andele Mono", 3, 12));
   label4.setForeground(new Color(0,82,159));
   add(label4);

   texto = new JTextField();
   texto.setBounds(125,240,255,25);
   texto.setBackground(new Color(255,255,255));
   texto.setForeground(new Color(0,0,0));
   add(texto);

   boton1 = new JButton("Ingresar");
   boton1.setBounds(200,280,100,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setForeground(new Color(0,0,1));
   boton1.addActionListener(this);
   add(boton1);
 }

  public void actionPerformed(ActionEvent e){
  if(e.getSource() ==  boton1){
     texto1 = texto.getText().trim();

   if(texto1.equals("")){
      JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");

    }else {
       Licencia ventana2 = new Licencia();
       ventana2.setBounds(0,0,600,360);
       ventana2.setVisible(true);
       ventana2.setResizable(false);
       ventana2.setLocationRelativeTo(null);
       this.setVisible(false);
     }
   }
  }

  public static void main(String args[]){
  Bienvenida ventana1 = new Bienvenida();
  ventana1.setBounds(0,0,550,450);
  ventana1.setVisible(true);
  ventana1.setResizable(false);
  ventana1.setLocationRelativeTo(null);
 } 
}