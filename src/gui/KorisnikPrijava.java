package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
//import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class KorisnikPrijava extends JFrame
{
	public KorisnikPrijava() 
	{
		super();
		setTitle("OISISI-2020-TIM-14");
		setSize(1300,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		 
		JPanel panCenter=new JPanel();
		BoxLayout boxCenter=new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter); 
		panCenter.setBackground(new Color(230, 255, 251));
		this.add(panCenter);
		 
		Dimension dim=new Dimension(350,30);

		//JPanel panKorisIme=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKorisIme=new JLabel("Korisnicko ime:");
        lblKorisIme.setPreferredSize(dim);
      
        panCenter.add(lblKorisIme);
        panCenter.add(Box.createVerticalStrut(25));  
        add(panCenter,BorderLayout.CENTER);
        
        
	
	}
	

}
