package toto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class toto {

	private JFrame frame;
	private JTextField textAffichage;
	
	double premiernombre;
	double deuxiemenombre;
	double resultat;
	String operateur;
	String reponse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toto window = new toto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public toto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textAffichage = new JTextField();
		textAffichage.setBounds(10, 11, 270, 44);
		frame.getContentPane().add(textAffichage);
		textAffichage.setColumns(10);
		
		JButton btnBS = new JButton("\u2190");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textBS = null;
				
				if(textAffichage.getText().length() > 0) {
					StringBuilder strBuild = new StringBuilder(textAffichage.getText());
					strBuild.setLength(strBuild.length() - 1);
					textBS = strBuild.toString();
					textAffichage.setText(textBS);
				}
			}
		});
		btnBS.setFont(new Font("Arial", Font.BOLD, 18));
		btnBS.setBounds(10, 60, 60, 60);
		frame.getContentPane().add(btnBS);
		
		JButton btnEfface = new JButton("C");
		btnEfface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAffichage.setText("");
			}
		});
		btnEfface.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnEfface.setBounds(80, 60, 60, 60);
		frame.getContentPane().add(btnEfface);
		
		JButton btnPourcent = new JButton("%");
		btnPourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premiernombre = Double.valueOf(textAffichage.getText());
				textAffichage.setText("");
				operateur = "%";
			}
		});
		btnPourcent.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnPourcent.setBounds(150, 60, 60, 60);
		frame.getContentPane().add(btnPourcent);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premiernombre = Double.valueOf(textAffichage.getText());
				textAffichage.setText("");
				operateur = "+";
			}
		});
		btnAddition.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnAddition.setBounds(220, 60, 60, 60);
		frame.getContentPane().add(btnAddition);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn7.getText();
				textAffichage.setText(txtNombre);	
			}
		});
		btn7.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn7.setBounds(10, 131, 60, 60);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn8.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn8.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn8.setBounds(80, 131, 60, 60);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn9.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn9.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn9.setBounds(150, 131, 60, 60);
		frame.getContentPane().add(btn9);
		
		final JButton btnSoustraction = new JButton("-");
		btnSoustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premiernombre = Double.valueOf(textAffichage.getText());
				textAffichage.setText("");
				operateur = "-";
				
			}
		});
		btnSoustraction.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnSoustraction.setBounds(220, 131, 60, 60);
		frame.getContentPane().add(btnSoustraction);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn4.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn4.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn4.setBounds(10, 202, 60, 60);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn5.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn5.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn5.setBounds(80, 202, 60, 60);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn6.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn6.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn6.setBounds(150, 202, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premiernombre = Double.valueOf(textAffichage.getText());
				textAffichage.setText("");
				operateur = "*";
			}
		});
		btnMultiplication.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnMultiplication.setBounds(220, 202, 60, 60);
		frame.getContentPane().add(btnMultiplication);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn1.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn1.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn1.setBounds(10, 270, 60, 60);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn2.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn2.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn2.setBounds(80, 270, 60, 60);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn3.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn3.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn3.setBounds(150, 270, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				premiernombre = Double.valueOf(textAffichage.getText());
				textAffichage.setText("");
				operateur = "/";
			}
		});
		btnDivision.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnDivision.setBounds(220, 270, 60, 60);
		frame.getContentPane().add(btnDivision);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btn0.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btn0.setFont(new Font("Bell MT", Font.BOLD, 18));
		btn0.setBounds(10, 340, 60, 60);
		frame.getContentPane().add(btn0);
		
		final JButton btnVirgule = new JButton(",");
		btnVirgule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtNombre = textAffichage.getText() + btnVirgule.getText();
				textAffichage.setText(txtNombre);
			}
		});
		btnVirgule.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnVirgule.setBounds(80, 340, 60, 60);
		frame.getContentPane().add(btnVirgule);
		
		JButton btnPlusMoins = new JButton("\u00B1");
		btnPlusMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nombre = Double.valueOf(String.valueOf(textAffichage.getText()));
				nombre = -nombre;
				textAffichage.setText(String.valueOf(nombre));
			}
		});
		btnPlusMoins.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnPlusMoins.setBounds(150, 340, 60, 60);
		frame.getContentPane().add(btnPlusMoins);
		
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reponse;
				deuxiemenombre = Double.valueOf(textAffichage.getText());
				
				switch (operateur) {
				  case "+":
					  resultat = premiernombre + deuxiemenombre;
				    break;
				  case "-":
					  resultat = premiernombre - deuxiemenombre;
				    break;
				  case "*":
					  resultat = premiernombre * deuxiemenombre;
				    break;
				  case "/":
					  resultat = premiernombre / deuxiemenombre;
				    break;
				  case "%":
					  resultat = premiernombre * 100/ deuxiemenombre;
				    break;
				}
				reponse = String.valueOf(resultat);
				textAffichage.setText(reponse);
				/*if(operateur == "+") {
					resultat = premiernombre + deuxiemenombre;
				}*/
		}});
		btnEgal.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnEgal.setBounds(220, 340, 60, 60);
		frame.getContentPane().add(btnEgal);
	}
}