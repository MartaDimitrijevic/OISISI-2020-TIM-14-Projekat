package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class KorisnikPrijava extends JFrame {
	public KorisnikPrijava() {
		super();
		setTitle("OISISI-2020-TIM-14");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panLeft = new JPanel();
		BoxLayout panel = new BoxLayout(panLeft, BoxLayout.Y_AXIS);
		panLeft.setLayout(panel);
		panLeft.setBackground(new Color(230, 255, 251));
		panLeft.setPreferredSize(new Dimension(300, 30));
		this.add(panLeft);
		panLeft.add(Box.createGlue());

		panLeft.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));

		JPanel panRight = new JPanel();
		panRight.setPreferredSize(new Dimension(300, 30));
		panRight.setBackground(new Color(230, 255, 251));

		showPrijva(panCenter);

		add(panLeft, BorderLayout.WEST);
		add(panCenter, BorderLayout.CENTER);
		add(panRight, BorderLayout.EAST);

	}

	private void showPrijva(JPanel panCenter) {
		panCenter.setBackground(new Color(230, 255, 251));

		JPanel menuPan = new JPanel();
		BoxLayout menuPanelGlue = new BoxLayout(menuPan, BoxLayout.Y_AXIS);
		menuPan.setLayout(menuPanelGlue);
		menuPan.setBackground(Color.RED);
		menuPan.setPreferredSize(new Dimension(300, 600));
		menuPan.add(Box.createGlue());

		JPanel naslov = new JPanel();
		naslov.setPreferredSize(new Dimension(800, 1200));
		naslov.setBackground(new Color(230, 255, 251));
		naslov.setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel pnlPrijava = new JPanel();
		pnlPrijava.setPreferredSize(new Dimension(800, 200));
		JLabel lblTop = new JLabel("Prijava");
		pnlPrijava.setBackground(new Color(230, 255, 251));
		lblTop.setFont(new Font("Ariel", 0, 55));
		pnlPrijava.add(lblTop);

		pnlPrijava.add(lblTop);
		pnlPrijava.setLayout(new FlowLayout(FlowLayout.LEFT));

		naslov.add(pnlPrijava);

		JPanel logInPan = new JPanel();
		logInPan.setBackground(new Color(230, 255, 251));
		BoxLayout panel = new BoxLayout(logInPan, BoxLayout.Y_AXIS);
		logInPan.setPreferredSize(new Dimension(1100, 700));
		logInPan.setLayout(panel);

		JPanel pnlKorIme = new JPanel();
		pnlKorIme.setBackground(new Color(230, 255, 251));
		JLabel lblKorIme = new JLabel("Korisnicko ime : ");
		lblKorIme.setFont(new Font("Ariel", 0, 35));

		JTextField textArea = new JTextField(30);
		textArea.setFont(new Font("Serif", Font.ITALIC, 20));
		pnlKorIme.setLayout(new FlowLayout(FlowLayout.LEFT));

		pnlKorIme.add(lblKorIme);
		pnlKorIme.add(textArea);

		JPanel pnlLozinka = new JPanel();
		pnlLozinka.setBackground(new Color(230, 255, 251));
		JLabel lblLoz = new JLabel("           Lozinka : ");
		lblLoz.setFont(new Font("Ariel", 0, 35));

		JTextField textArea2 = new JTextField(30);
		textArea2.setFont(new Font("Serif", Font.ITALIC, 20));
		pnlLozinka.setLayout(new FlowLayout(FlowLayout.LEFT));

		pnlLozinka.add(lblLoz);
		pnlLozinka.add(textArea2);

		logInPan.add(pnlKorIme);
		logInPan.add(pnlLozinka);
		logInPan.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel pnlBtn = new JPanel();
		pnlBtn.setPreferredSize(new Dimension(1100, 700));
		pnlBtn.setBackground(new Color(230, 255, 251));

		JPanel btn = new JPanel();
		btn.setBackground(new Color(230, 255, 251));
		JButton btnPrij = new JButton("Prijava");
		btnPrij.setPreferredSize(new Dimension(650, 60));
		btnPrij.setFont(new Font("Arial", 0, 40));
		btnPrij.setBackground(new Color(0, 204, 255));

		btn.add(btnPrij);
		pnlBtn.add(btn);

		pnlBtn.setLayout(new FlowLayout(FlowLayout.CENTER));

		menuPan.add(naslov);
		menuPan.add(logInPan, BorderLayout.CENTER);
		menuPan.add(pnlBtn, BorderLayout.SOUTH);

		panCenter.add(menuPan);

	}

}