package gui;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
//import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class ReceptiPrikaz extends JFrame 
{
	public ReceptiPrikaz() 
	{
		super();
		setTitle("OISISI-2020-TIM-14");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panLeft = new JPanel();
		BoxLayout panel = new BoxLayout(panLeft, BoxLayout.X_AXIS);
		panLeft.setLayout(panel);
		panLeft.setBackground(new Color(154, 255, 197));
		panLeft.setPreferredSize(new Dimension(150, 30));
		this.add(panLeft);
		panLeft.add(Box.createGlue());

		Icon icon1 = new ImageIcon("images/lekovi.png");
		JButton btn1 = new JButton("Lekovi", icon1);
		// btn1.setAlignmentY(Component.LEFT_ALIGNMENT);
		btn1.setBackground(new Color(154, 255, 197));
		btn1.setFont(new Font("Arial", 0, 20));
		btn1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn1);

		Icon icon2 = new ImageIcon("images/recepti1.png");
		JButton btn2 = new JButton("Recepti", icon2);
		// btn2.setAlignmentY(Component.LEFT_ALIGNMENT);
		btn2.setBackground(new Color(154, 255, 197));
		btn2.setFont(new Font("Arial", 0, 20));
		btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn2);

		Icon icon3 = new ImageIcon("images/korisnik1.png");
		JButton btn3 = new JButton("Korisnici", icon3);
		// btn3.setAlignmentY(Component.LEFT_ALIGNMENT);
		btn3.setBackground(new Color(154, 255, 197));
		btn3.setFont(new Font("Arial", 0, 20));
		btn3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn3);

		Icon icon4 = new ImageIcon("images/izvestaj1.png");
		JButton btn4 = new JButton("Izvestaj", icon4);
		// btn4.setAlignmentY(Component.LEFT_ALIGNMENT);
		btn4.setFont(new Font("Arial", 0, 20));
		btn4.setBackground(new Color(154, 255, 197));
		btn4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn4.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn4);

		Icon icon5 = new ImageIcon("images/korpa1.png");
		JButton btn5 = new JButton("Korpa", icon5);
		// btn5.setAlignmentY(Component.LEFT_ALIGNMENT);
		btn5.setFont(new Font("Arial", 0, 20));
		btn5.setBackground(new Color(154, 255, 197));
		btn5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn5.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn5);

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(btn3);
		getContentPane().add(btn4);
		getContentPane().add(btn5);

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));
		panCenter.setBackground(new Color(230, 255, 251));
		panCenter.add(panLeft, BorderLayout.WEST);

		// JSplitPane splitPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panLeft,
		// panCenter);

		// add(splitPanel, BorderLayout.CENTER);
		add(panLeft, BorderLayout.WEST);
		add(panCenter, BorderLayout.CENTER);
	}

}
