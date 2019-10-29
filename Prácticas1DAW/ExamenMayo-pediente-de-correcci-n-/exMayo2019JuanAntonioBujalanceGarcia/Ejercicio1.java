package exMayo2019JuanAntonioBujalanceGarcia;
/**
 *  Escribe un programa que usando la interfaz gráfica de Java escoja un fichero 
 *  del sistema de archivos y
 *  lo almacene en otro de manera que se sustituyan todas las ocurrencias de los
 *   siguientes caracteres
 *  (mayúscula o minúscula) del fichero original por sus correspondientes números:
 *  @author d18bugaj
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ejercicio1 {

	private JFrame frmEjercicio;
	private String rutaEntrada= "";
	private String rutaSalida = ""; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio1");
		frmEjercicio.setBounds(100, 100, 450, 300);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		
		/**
		 * Boton donde creo el filechooser y recojo la ruta del archivo seleccionador
		 */
		JButton btnSeleccionarArchivo = new JButton("Archivo Entrada");
		btnSeleccionarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//Creamos el objeto JFileChooser
				JFileChooser fc=new JFileChooser();
				 
				//Indicamos lo que podemos seleccionar
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				 
				//Creamos el filtro
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
				 
				//Le indicamos el filtro
				fc.setFileFilter(filtro);
				 
				//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
				int seleccion=fc.showOpenDialog(frmEjercicio);
				 
				//Si el usuario, pincha en aceptar
				if(seleccion==JFileChooser.APPROVE_OPTION){
				 
				    //Seleccionamos el fichero
				    File fichero=fc.getSelectedFile();
				    rutaEntrada = fichero.getAbsolutePath();
				}
			}
		});
		btnSeleccionarArchivo.setBounds(82, 205, 137, 23);
		frmEjercicio.getContentPane().add(btnSeleccionarArchivo);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(53, 25, 360, 116);
		frmEjercicio.getContentPane().add(textArea);
		
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(53, 25, 360, 116);
		frmEjercicio.getContentPane().add(scroll);
		
		
		
		JButton btnNewButton = new JButton("Archivo Salida");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Creamos el objeto JFileChooser
				JFileChooser fc=new JFileChooser();
				 
				//Indicamos lo que podemos seleccionar
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				 
				//Creamos el filtro
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
				 
				//Le indicamos el filtro
				fc.setFileFilter(filtro);
				 
				//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
				int seleccion=fc.showOpenDialog(frmEjercicio);
				 
				//Si el usuario, pincha en aceptar
				if(seleccion==JFileChooser.APPROVE_OPTION){
				 
				    //Seleccionamos el fichero
				    File fichero=fc.getSelectedFile();
				    rutaSalida = fichero.getAbsolutePath();
				}
			}
		});
		btnNewButton.setBounds(82, 239, 137, 23);
		frmEjercicio.getContentPane().add(btnNewButton);
		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					BufferedWriter escribir = new BufferedWriter(new FileWriter(rutaSalida));
					BufferedReader leer = new BufferedReader( new FileReader(rutaEntrada));
					
					String linea = "";
					
					 while (linea != null) {
		          linea = leer.readLine();
		          String[] palabrasArray = new String[] { "" }; 
		          if (linea != null) {
		            palabrasArray = linea.split(""); 
		          }
		          for(String x : palabrasArray) {
								
		          	escribir.write(x.replace("a", "4").replace("b", "8").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5").replace("t", "7").replace("A", "4").replace("B", "8").replace("E", "3").replace("I", "1").replace("O", "0").replace("S", "5").replace("T", "7"));
								textArea.append(x.replace("a", "4").replace("b", "8").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5").replace("t", "7").replace("A", "4").replace("B", "8").replace("E", "3").replace("I", "1").replace("O", "0").replace("S", "5").replace("T", "7"));
							}
		          
					 }
					 
						leer.close();
						escribir.close();
										
				
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Error, no se ha podido crear el fichero");
				}
			}
			
		});
		btnEjecutar.setBounds(288, 218, 91, 23);
		frmEjercicio.getContentPane().add(btnEjecutar);
	}
}

