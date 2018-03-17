package Polinoame;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;


public class Panel extends JFrame {
	
	private  JFrame frame = new JFrame("Polinoame");
	private JPanel p = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JLabel l = new JLabel(" P(x) ");
	private JLabel l2 = new JLabel(" S(X) ");
	private JLabel rez = new JLabel("Rezultat");
	private JTextField polinom1 = new JTextField(" ");
	private JTextField polinom2 = new JTextField(" ");
	private JTextField rezultat = new JTextField(" ");
	private JButton adunare = new JButton("+");
	private JButton scadere = new JButton("-");
	private JButton inmultire = new JButton("*");
	private JButton derivare1 = new JButton("Derivare");
	private JButton integrare1 = new JButton("Integrare");
	private JButton derivare2 = new JButton("Derivare");
	private JButton integrare2 = new JButton("Integrare");

 
	public void addComponents()
	{int WIDTH = 500;
	int HEIGHT = 500;
	panel1.setBackground(Color.CYAN);
	panel2.setBackground(Color.CYAN);
	panel3.setBackground(Color.CYAN);
	polinom1.setBounds(50, 50, WIDTH* 30/100, HEIGHT* 5/100);
	panel1.add(polinom1);
	l.setBounds(10, 35, 70, 50);
	p.add(panel1);
	p.add(panel2);
	p.add(panel3);
	l.setBounds(10, 35, 70, 50);
	panel1.add(l);
	
	l2.setBounds(10, 86, 70, 50);
	derivare1.setBounds(250, 48, 90, 30);
	integrare1.setBounds(370, 48, 90, 30);
	polinom2.setBounds(50, 100, WIDTH* 30/100, HEIGHT* 5/100);
	derivare2.setBounds(250, 100, 90, 30);
	integrare2.setBounds(370, 100, 90, 30);
	panel1.add(l2);
	panel1.add(polinom2);
	panel1.add(derivare1);
	panel1.add(integrare1);
	panel1.add(derivare2);
	panel1.add(integrare2);	
	adunare.setBounds(20, 40, 50, 30);
	scadere.setBounds(100, 40, 50, 30);
	inmultire.setBounds(180, 40, 50, 30);
	panel2.add(scadere);
	panel2.add(adunare);
	panel2.add(inmultire);
	rez.setBounds(20,-10 , 80, 80);
	rez.setFont(new Font("Arial", 50, 20));
	rezultat.setBounds(110, 18, 380, 26);
	panel3.add(rez);
	panel3.add(rezultat);
	
	
	
	}
	
	private void jFrameSetup(){
		int WIDTH = 500;
		int HEIGHT = 500;
		getContentPane().setBackground(Color.CYAN);
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setContentPane(p);
	    p.setVisible(true);
		panel1.setVisible(true);
		panel2.setVisible(true);
		panel3.setVisible(true);
	    }
	
	public Panel(){
		add(p);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		addComponents();
		jFrameSetup();
	
	}
		

	
		
		
		
		
		
		
	
		
	
	
		public String getPolinom1()
	{
		return polinom1.getText();
	}
	
	public String getPolinom2()
	{
		return polinom2.getText();
	}
	
	public void setRezultat(String text)
	{
		rezultat.setText(text);
	}

	public void adunareButton(ActionListener e)
	{
		adunare.addActionListener(e);
	}
 
	public void scadereButtonListener(ActionListener e)
	{
		scadere.addActionListener(e);
	}
	public void inmultireButtonListener(ActionListener e)
	{
		inmultire.addActionListener(e);
	}
	
	public void derivare1ButtonListener(ActionListener e)
	{
		derivare1.addActionListener(e);
	}
	
	public void derivare2ButtonListener(ActionListener e)
	{
		derivare2.addActionListener(e);
	}
	public void integrare1ButtonListener(ActionListener e)
	{
		integrare1.addActionListener(e);
	}
	public void integrare2ButtonListener(ActionListener e)
	{
		integrare2.addActionListener(e);
	}
	}

