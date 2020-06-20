import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame implements ActionListener{

     private JMenuBar mb;
     private JMenu menuopciones, menucalcular, menuacercade, menucolorfondo;
     private JMenuItem micalculo, mirojo, midorado, miblanco, micreador, misalir, minuevo;
     private JLabel labellogo, labelbienvenida, labeltitle, labelnombre, labellp, labellm,
                    labeltdto, labelanti, labelresul, labelfooter;
     private JTextField txtnombre, txtapt, txtamt;
     private JComboBox combodpto, comboant;
     private JScrollPane scroll;
     private JTextArea texarea;
     String nombreAdmi = "";

     public Principal(){
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Pantalla Principal");
       getContentPane().setBackground(new Color(255,255,255));
       Bienvenida ventanaBienvenida = new Bienvenida();
       setIconImage(new ImageIcon(getClass().getResource("image/icono.png")).getImage());
       nombreAdmi = ventanaBienvenida.texto1;
 
       mb = new JMenuBar();
       mb.setBackground(new Color(0, 82, 153));
       setJMenuBar(mb);

     menuopciones = new JMenu("Opciones");
     menuopciones.setBackground(new Color(0,82,153));
     menuopciones.setFont(new Font("Andale Mono", 1, 15));
     menuopciones.setForeground(new Color(255,255,255));
     mb.add(menuopciones);

     menucalcular = new JMenu("Calcular");
     menucalcular.setBackground(new Color(0, 82, 153));
     menucalcular.setFont(new Font("Andale Mono", 1, 15));
     menucalcular.setForeground(new Color(255,255,255));
     mb.add(menucalcular);

     menuacercade = new JMenu("Acerca de");
     menuacercade.setBackground(new Color(0, 82, 153));
     menuacercade.setFont(new Font("Andale Mono", 1, 15));
     menuacercade.setForeground(new Color(255,255,255));
     mb.add(menuacercade);

     menucolorfondo = new JMenu("Color de Fondo");
     menucolorfondo.setBackground(new Color(0, 82, 153));
     menucolorfondo.setFont(new Font("Andale Mono", 1, 15));
     menucolorfondo.setForeground(new Color(0, 82, 153));
     menuopciones.add(menucolorfondo);

     micalculo = new JMenuItem("Entradas");
     micalculo.setFont(new Font("Andale Mono", 1, 15));
     micalculo.setForeground(new Color(0, 82, 153));
     menucalcular.add(micalculo);
     micalculo.addActionListener(this);

     mirojo = new JMenuItem("Rojo");
     mirojo.setFont(new Font("Andale Mono", 1, 15));
     mirojo.setForeground(new Color(0, 82, 153));
     menucolorfondo.add(mirojo);
     mirojo.addActionListener(this);

     midorado = new JMenuItem("Dorado");
     midorado.setFont(new Font("Andale Mono", 1, 15));
     midorado.setForeground(new Color(0, 82, 153));
     menucolorfondo.add(midorado);
     midorado.addActionListener(this);

     miblanco = new JMenuItem("Blanco");
     miblanco.setFont(new Font("Andale Mono", 1, 15));
     miblanco.setForeground(new Color(0, 82, 153));
     menucolorfondo.add(miblanco);
     miblanco.addActionListener(this);

     minuevo = new JMenuItem("Nuevo");
     minuevo.setFont(new Font("Andale Mono", 1, 15));
     minuevo.setForeground(new Color(0, 82, 153));
     menuopciones.add(minuevo);
     minuevo.addActionListener(this);

     micreador = new JMenuItem("Creador");
     micreador.setFont(new Font("Andale Mono", 1, 15));
     micreador.setForeground(new Color(0, 82, 153));
     menuacercade.add(micreador);
     micreador.addActionListener(this);

     misalir = new JMenuItem("Salir");
     misalir.setFont(new Font("Andale Mono", 1, 15));
     misalir.setForeground(new Color(0, 82, 153));
     menuopciones.add(misalir);
     misalir.addActionListener(this);

     ImageIcon imagen = new ImageIcon("image/plantilla2.png");
     labellogo = new JLabel(imagen);
     labellogo.setBounds(55,400,750,250);
     add(labellogo);

     labelbienvenida = new JLabel("Bienvenido " + nombreAdmi);
     labelbienvenida.setBounds(200,30,300,50);
     labelbienvenida.setFont(new Font("Andale Mono", 1, 30));
     labelbienvenida.setForeground(new Color(0, 82, 153));
     add(labelbienvenida);


     labeltitle = new JLabel("Datos del Socio o Abonado para el reparto de las entradas anuales");
     labeltitle.setBounds(45,100,900,100);
     labeltitle.setFont(new Font("Andale Mono", 0, 18));
     labeltitle.setForeground(new Color(0, 82, 153));
     add(labeltitle);

      //Agregar Nombre

     labelnombre = new JLabel("Nombre Completo");
     labelnombre.setBounds(25, 188, 180, 25);
     labelnombre.setBackground(new Color(0,82,153));
     labelnombre.setFont(new Font("Andale Mono", 1, 14));
     labelnombre.setForeground(new Color(0, 82, 153));
     add(labelnombre);

    txtnombre = new JTextField();
    txtnombre.setBounds(25, 213, 150, 25);
    txtnombre.setBackground(new java.awt.Color(0,82,153));
    txtnombre.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtnombre.setForeground(new java.awt.Color(255,255,255));
    add(txtnombre);

    //Agregar Apellidos
     labellp = new JLabel("Primer Apellido");
     labellp.setBounds(25, 248, 180, 25);
     labellp.setFont(new Font("Andale Mono", 1, 14));
     labellp.setForeground(new Color(0, 82, 153));
     add(labellp);

    txtapt = new JTextField();
    txtapt.setBounds(25, 273, 150, 25);
    txtapt.setBackground(new java.awt.Color(0,82,153));
    txtapt.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtapt.setForeground(new java.awt.Color(255,255,255));
    add(txtapt);


     labellm = new JLabel("Segundo Apellido");
     labellm.setBounds(25, 308, 180, 25);
     labellm.setFont(new Font("Andale Mono", 1, 14));
     labellm.setForeground(new Color(0, 82, 153));
     add(labellm);

    txtamt = new JTextField();
    txtamt.setBounds(25, 334, 150, 25);
    txtamt.setBackground(new java.awt.Color(0,82,153));
    txtamt.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtamt.setForeground(new java.awt.Color(255,255,255));
    add(txtamt);

    //Selecciones 

     labeltdto = new JLabel("Seleccione");
     labeltdto.setBounds(220, 188, 180, 25);
     labeltdto.setFont(new Font("Andale Mono", 1, 14));
     labeltdto.setForeground(new Color(0, 82, 153));
     add(labeltdto);

    combodpto = new JComboBox();
    combodpto.setBounds(220, 213, 220, 25);
    combodpto.setBackground(new java.awt.Color(0,82,153));
    combodpto.setFont(new java.awt.Font("Andale Mono", 1, 14));
    combodpto.setForeground(new java.awt.Color(255,255,255));
    add(combodpto);
    combodpto.addItem("");
    combodpto.addItem("Socio");
    combodpto.addItem("Abonado");

     labelanti = new JLabel("Seleccione la Antiguedad");
     labelanti.setBounds(220, 248, 180, 25);
     labelanti.setFont(new Font("Andale Mono", 1, 14));
     labelanti.setForeground(new Color(0, 82, 153));
     add(labelanti);

    comboant = new JComboBox();
    comboant.setBounds(220, 273, 220, 25);
    comboant.setBackground(new java.awt.Color(0,82,153));
    comboant.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboant.setForeground(new java.awt.Color(255,255,255));
    add(comboant);
    comboant.addItem("");
    comboant.addItem("1 Año");
    comboant.addItem("2 a 5 Años");
    comboant.addItem("7 Años o más");


    labelresul = new JLabel("Resultados");
    labelresul.setBounds(220, 307, 180, 25);
    labelresul.setFont(new Font("Andale Mono", 1, 14));
    labelresul.setForeground(new Color(0,82,153));
    add(labelresul);

    texarea = new JTextArea();
    texarea.setEditable(false);
    texarea.setBackground(new Color(0,82,153));
    texarea.setFont(new Font("Andale Mono", 1, 14));
    texarea.setForeground(new Color(255,255,255));
    texarea.setText("\n  Aqui aparece toda la informacion.");
    scroll = new JScrollPane(texarea);
    scroll.setBounds(220, 333, 385, 90);
    add(scroll);
 
    labelfooter = new JLabel("Real Madrid Club de Futbol");
    labelfooter.setBounds(210, 70, 500, 30);
    labelfooter.setFont(new Font("Andale Mono", 1, 14));
    labelfooter.setForeground(new Color(0,82,153));
    add(labelfooter);
  }
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == micalculo){

       String nombretrabajador = txtnombre.getText();
       String ap = txtapt.getText();
       String am = txtamt.getText();
       String depto = combodpto.getSelectedItem().toString();
       String ant = comboant.getSelectedItem().toString();
  
       if(nombretrabajador.equals("") || ap.equals("") || am.equals("") || 
             depto.equals("") || ant.equals("")){

             JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");

         } else{

               if(depto.equals("Socio")){

                 if(ant.equals("1 Año")){
                    texarea.setText("\n     El Socio " + nombretrabajador + " " + ap + " " + am + 
                                      "\n     que ha estado con nosotros durante " + ant + "" + 
                                      "\n     recibe 6 entradas por partidos.");

                 }
                 if(ant.equals("2 a 5 Años")){
                     texarea.setText("\n     El Socio " + nombretrabajador + " " + ap + " " + am +                   
                                        "\n     que ha estado con nosotros entre los " + ant + "" +
                                         "\n     recibe 10 entradas por partidos.");

                 }
                 if(ant.equals("7 Años o más")){
                     texarea.setText("\n     El Socio " + nombretrabajador + " " + ap + " " + am + 
                                        "\n     que ha estado con nosotros por mas de " + ant + ""  +                      
                                         "\n     recibe 15 entradas por partidos.");
                    }         
                }  

                 if(depto.equals("Abonado")){

                     if(ant.equals("1 Año")){
                      texarea.setText("\n     El Abonado " + nombretrabajador + " " + ap + " " + am + 
                                      "\n     que ha estado con nosotros durante " + ant  + "" +
                                      "\n     recibe 4 entradas por partidos.");

                 }
                    if(ant.equals("2 a 5 Años")){
                     texarea.setText("\n     El Abonado " + nombretrabajador + " " + ap + " " + am +                   
                                        "\n     que ha estado con nosotros entre los " + ant + "" +
                                         "\n     recibe 8 entradas por partidos.");

                 }
                   if(ant.equals("7 años o mas")){
                     texarea.setText("\n     El Abonado" + nombretrabajador + " " + ap + " " + am + 
                                       "\n     que ha estado con nosotros por mas de" + ant +  ""  +                      
                                        "\n     recibe 13 entradas por partidos.");
                 }  
              }
          }
     }
      if(e.getSource() == mirojo){
       getContentPane().setBackground(new Color(238, 50, 78));
     }

      if(e.getSource() == midorado){
       getContentPane().setBackground(new Color(254,190,16));     
      }
      if(e.getSource() == miblanco){
        getContentPane().setBackground(new Color(255,255,255));    
      }
      if(e.getSource() == minuevo){
      txtnombre.setText("");
      txtapt.setText("");
      txtamt.setText("");
      combodpto.setSelectedIndex(0);
      comboant.setSelectedIndex(0);
      texarea.setText("\n  Aquí aparece toda la informacion.");

     }
      if(e.getSource() == misalir){
      Bienvenida ventana1 = new Bienvenida();
       ventana1.setBounds(0,0,550,450);
        ventana1.setVisible(true);
         ventana1.setResizable(false);
          ventana1.setLocationRelativeTo(null);
           this.setVisible(false);

     }
      if(e.getSource() == micreador){

       JOptionPane.showMessageDialog(null, "\n Desarrollador en formacion Frank Lopez " +
                                            " \n https://www.linkedin.com/in/frank-lopez-b99201169/");

     }
  }

    public static void main(String args[]){
    Principal ventana3 = new Principal();
    ventana3.setBounds(0, 0, 640, 700);
    ventana3.setVisible(true);
    ventana3.setResizable(false);
    ventana3.setLocationRelativeTo(null);
}
}
