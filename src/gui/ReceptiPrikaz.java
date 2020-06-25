package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class ReceptiPrikaz extends JFrame {
	public ReceptiPrikaz() {
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
		
		JPanel panCenter = new JPanel(new BorderLayout(20, 20));
		panCenter.setBackground(new Color(230, 255, 251));
		panCenter.add(panLeft, BorderLayout.WEST);
		
		//JSplitPane splitPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panLeft, panCenter);
		
		//add(splitPanel, BorderLayout.CENTER);
		add(panLeft, BorderLayout.WEST);
		add(panCenter, BorderLayout.CENTER);
	}
	
}
