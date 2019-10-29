package exMayo2019JuanAntonioBujalanceGarcia;
/**
 * El botón días hasta hoy no tiene funcionalidad
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Ejercicio2 {

	private JFrame frmEjercicio;
	private JTextField textFieldFecha;
	final static int [] DIAS_MES = {31,28,31,30,31,30,31,31,30,31,30,31};
	Fecha fecha1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Método que comprueba si la fecha introducida en el textfield es válida
	 * @param f
	 * @return
	 */
	public static boolean esFechaValida(String f) {
		
    if (f.length()!=10  || !Character.isDigit(f.charAt(0)) || !Character.isDigit(f.charAt(1)) || !Character.isDigit(f.charAt(3))
                        || !Character.isDigit(f.charAt(4)) || !Character.isDigit(f.charAt(6)) || !Character.isDigit(f.charAt(7))
                        || !Character.isDigit(f.charAt(8)) || !Character.isDigit(f.charAt(9))
                        || f.charAt(2)!='/' || f.charAt(5)!='/') {
      return false;
    }
    int mes = Integer.parseInt(f.substring(3,5));
    if (mes<1 || mes>12) {
      return false;
    }
    int dia = Integer.parseInt(f.substring(0, 2));
    int anyo = Integer.parseInt(f.substring(6));
    int diasmes = DIAS_MES[mes-1];  

    if (mes==2 && anyo%4==0 && (anyo%100!=0 || anyo%400==0)) {
      diasmes++;
    }
    return (dia>0 && dia<=diasmes);
  }
	
	public static int diasHastaHoy(Fecha fecha1) {
		int contadorDias = 0;
		java.util.Date  hoy = new Date();
		int dHoy = hoy.getDate();
    int mHoy = hoy.getMonth()+1;
    int aHoy = hoy.getYear()+1900;
    int totalHoy = dHoy + mHoy +aHoy;
    
    
    
    
    int d = fecha1.getDia();
    int m = fecha1.getMes();
    int a = fecha1.getAnno();
    int totalFecha = d + m + a;
    
		
		do {
			resta1DiaFecha(fecha1);
			 	d = fecha1.getDia();
		     m = fecha1.getMes();
		     a = fecha1.getAnno();
		    totalFecha = d + m + a;
			contadorDias++;
		}while(totalFecha != totalHoy);
						
		return contadorDias;
		
	}
	/**
	 *  Método que le suma un día a la fecha ya creada
	 * @param fecha1
	 * @return el objeto fecha con un día más
	 */
	public static Fecha suma1DiaFecha(Fecha fecha1) {
    int d = fecha1.getDia();
    int m = fecha1.getMes();
    int a = fecha1.getAnno();
    
    int diasmes = DIAS_MES[m-1];
    
    if (m==2 && a%4==0 && (a%100!=0 || a%400==0)) {
      diasmes++;
    }
    d++;
    if (d>diasmes) {
      d = 1;
      m++;
      if (m==13) {
        m = 1;
        a++;
      }
    }
    fecha1.setDia(d);
    fecha1.setMes(m);
    fecha1.setAnno(a);
    return fecha1;
  }
	
	/**
	 * Método que devulete el objeto Fecha con un día menos
	 * @param fecha1
	 * @return objeto de tipo Fecha con un día menos
	 */
	 public static Fecha resta1DiaFecha(Fecha fecha1) {
		 int d = fecha1.getDia();
	    int m = fecha1.getMes();
	    int a = fecha1.getAnno(); 
	    
	    d--;
	    if (d==0) { 
	      m--;
	      if (m==0) { 
	        m=12;
	        a--;
	      } 
	      d = DIAS_MES[m-1];

	      if (m==2 && a%4==0 && (a%100!=0 || a%400==0)) {
	        d++;
	      }
	    }
	    fecha1.setDia(d);
	    fecha1.setMes(m);
	    fecha1.setAnno(a);
	    return fecha1;
	  }
	

	/**
	 * Create the application.
	 */
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio2");
		frmEjercicio.setBounds(100, 100, 386, 210);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(31, 33, 46, 14);
		frmEjercicio.getContentPane().add(lblFecha);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(87, 30, 121, 20);
		frmEjercicio.getContentPane().add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int diaInt;
				int mesInt;
				int annoInt;
				
				diaInt = Integer.parseInt(textFieldFecha.getText().substring(0, 2));
				mesInt = Integer.parseInt(textFieldFecha.getText().substring(3, 5));
				annoInt = Integer.parseInt(textFieldFecha.getText().substring(6));
				
				
				if(esFechaValida(textFieldFecha.getText())) {
					JOptionPane.showMessageDialog(null, "La fecha es válida");
					fecha1 = new Fecha(diaInt, mesInt, annoInt);
					textFieldFecha.setText(fecha1.toString());
				}else {
					JOptionPane.showMessageDialog(null, "La fecha no es válida, introduzca un fecha con el formato correcto");
					textFieldFecha.setText("");
				}
			}
		});
		btnValidar.setBounds(246, 29, 109, 23);
		frmEjercicio.getContentPane().add(btnValidar);
		
		JButton btnDaPosterior = new JButton("Día posterior");
		btnDaPosterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(esFechaValida(textFieldFecha.getText())) {
					suma1DiaFecha(fecha1);
					textFieldFecha.setText(fecha1.toString());
				}else {
					JOptionPane.showMessageDialog(null, "La fecha no es válida, introduzca un fecha con el formato correcto");
					textFieldFecha.setText("");
				}
				
			}
		});
		btnDaPosterior.setBounds(43, 87, 109, 23);
		frmEjercicio.getContentPane().add(btnDaPosterior);
		
		JButton btnNewButton = new JButton("Dia anterior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(esFechaValida(textFieldFecha.getText())) {
					resta1DiaFecha(fecha1);
					textFieldFecha.setText(fecha1.toString());
				}else {
					JOptionPane.showMessageDialog(null, "La fecha no es válida, introduzca un fecha con el formato correcto");
					textFieldFecha.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(43, 131, 109, 23);
		frmEjercicio.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dias hasta hoy");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*   No me funciona no consigo sacar los días 
				textFieldFecha.setText(Integer.toString(diasHastaHoy(fecha1)));
				*/
			}
		});
		btnNewButton_1.setBounds(246, 87, 109, 23);
		frmEjercicio.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Terminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(246, 131, 109, 23);
		frmEjercicio.getContentPane().add(btnNewButton_2);
		
		
	}
}

