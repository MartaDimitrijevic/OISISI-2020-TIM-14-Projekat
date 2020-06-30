package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class AdministratorRegistracija extends JFrame {

	public AdministratorRegistracija() {
		super();
		setTitle("OISISI-2020-TIM-14");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panLeft = new JPanel();
		BoxLayout panel = new BoxLayout(panLeft, BoxLayout.Y_AXIS);
		panLeft.setLayout(panel);
		panLeft.setBackground(new Color(154, 255, 197));
		panLeft.setPreferredSize(new Dimension(140, 30));
		this.add(panLeft);
		panLeft.add(Box.createGlue());

		panLeft.setLayout(new GridLayout(0, 1, 0, 0));

		Icon icon1 = new ImageIcon("images/lekovi.png");
		JButton btn1 = new JButton("Lekovi", icon1);
		btn1.setBackground(new Color(154, 255, 197));
		btn1.setFont(new Font("Arial", 0, 20));
		btn1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn1);

		Icon icon2 = new ImageIcon("images/recepti1.png");
		JButton btn2 = new JButton("Recepti", icon2);
		btn2.setBackground(new Color(154, 255, 197));
		btn2.setFont(new Font("Arial", 0, 20));
		btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn2);

		Icon icon3 = new ImageIcon("images/korisnik1.png");
		JButton btn3 = new JButton("Korisnici", icon3);
		btn3.setBackground(new Color(154, 255, 197));
		btn3.setFont(new Font("Arial", 0, 20));
		btn3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn3);

		Icon icon4 = new ImageIcon("images/izvestaj1.png");
		JButton btn4 = new JButton("Izvestaj", icon4);
		btn4.setFont(new Font("Arial", 0, 20));
		btn4.setBackground(new Color(154, 255, 197));
		btn4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn4.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn4);

		Icon icon5 = new ImageIcon("images/korpa1.png");
		JButton btn5 = new JButton("Korpa", icon5);
		btn5.setFont(new Font("Arial", 0, 20));
		btn5.setBackground(new Color(154, 255, 197));
		btn5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn5.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn5);

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));

		showMenuPanel(panCenter);

		add(panLeft, BorderLayout.WEST);
		add(panCenter, BorderLayout.CENTER);

	}

	private void showMenuPanel(JPanel panCenter) {
		panCenter.setBackground(new Color(230, 255, 251));

		JPanel menuPan = new JPanel();
		BoxLayout menuPanelGlue = new BoxLayout(menuPan, BoxLayout.Y_AXIS);
		menuPan.setLayout(menuPanelGlue);
		menuPan.setBackground(new Color(230, 255, 251));
		menuPan.setPreferredSize(new Dimension(20, 200));
		panCenter.add(menuPan, BorderLayout.NORTH);
		menuPan.add(Box.createGlue());

		JPanel naslov = new JPanel();

		naslov.setBackground(new Color(230, 255, 251));
		naslov.setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel lblRegistracija = new JPanel();
		JLabel lblTop = new JLabel("Korisnici");
		lblRegistracija.setBackground(new Color(230, 255, 251));
		lblTop.setFont(new Font("Ariel", 0, 55));
		lblRegistracija.add(lblTop);

		lblRegistracija.add(lblTop);

		JPanel odjava = new JPanel();
		odjava.setPreferredSize(new Dimension(900, 50));
		odjava.setBackground(new Color(230, 255, 251));
		JButton btnOdjava = new JButton("Odjava");
		btnOdjava.setFont(new Font("Arial", 0, 30));
		btnOdjava.setBackground(new Color(106, 183, 139));

		odjava.add(btnOdjava);

		naslov.add(lblRegistracija);
		naslov.add(odjava);

		odjava.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JPanel btnmeni = new JPanel();
		btnmeni.setBackground(new Color(230, 255, 251));

		JPanel btnReg = new JPanel();
		btnReg.setPreferredSize(new Dimension(350, 60));
		btnReg.setBackground(new Color(230, 255, 251));
		JButton btn6 = new JButton("Registracija");
		btn6.setFont(new Font("Arial", 0, 30));
		btn6.setBackground(new Color(230, 255, 251));
		btnReg.add(btn6);

		btnReg.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JPanel btnPrkz = new JPanel();
		btnPrkz.setPreferredSize(new Dimension(350, 60));
		btnPrkz.setBackground(new Color(230, 255, 251));
		JButton btn7 = new JButton("Prikaz svih korisnika");
		btn7.setFont(new Font("Arial", 0, 30));
		btn7.setBackground(new Color(230, 255, 251));
		btnPrkz.add(btn7);

		btnPrkz.setLayout(new FlowLayout(FlowLayout.LEFT));

		btnmeni.add(btnPrkz);
		btnmeni.add(btnReg);

		btnmeni.setLayout(new FlowLayout(FlowLayout.CENTER));

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(btnmeni, BorderLayout.CENTER);

		JPanel formPanel = new JPanel();
		formPanel.setBackground(new Color(230, 255, 251));
//		
//		tablePan.setLayout(new FlowLayout(FlowLayout.CENTER));
		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(formPanel, BorderLayout.CENTER);

		// add(panCenter);

		showFormPanel(formPanel);
	}

	private void showFormPanel(JPanel formPanel) {

		JPanel pnlOpc1 = new JPanel();
		pnlOpc1.setPreferredSize(new Dimension(1100, 70));
		pnlOpc1.setBackground(new Color(230, 255, 251));

		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Ariel", 0, 30));

		pnlOpc1.add(lblIme);
		formPanel.add(pnlOpc1);

		JTextArea textArea = new JTextArea(2, 30);
		textArea.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		pnlOpc1.add(textArea);
		formPanel.add(pnlOpc1);

		formPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel pnlOpc2 = new JPanel();
		pnlOpc2.setPreferredSize(new Dimension(1100, 70));
		pnlOpc2.setBackground(new Color(230, 255, 251));

		JLabel lblPrez = new JLabel("Prezime:");
		lblPrez.setFont(new Font("Ariel", 0, 30));

		pnlOpc2.add(lblPrez);
		formPanel.add(pnlOpc2);

		JTextArea textArea2 = new JTextArea(2, 30);
		textArea2.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea2.setLineWrap(true);
		textArea2.setWrapStyleWord(true);

		pnlOpc2.add(textArea2);
		formPanel.add(pnlOpc2);

		JPanel pnlTipKor = new JPanel();
		pnlTipKor.setPreferredSize(new Dimension(1100, 70));
		pnlTipKor.setBackground(new Color(230, 255, 251));

		JLabel lblTipKor = new JLabel("Tip korisnika:");
		lblTipKor.setFont(new Font("Ariel", 0, 30));
		pnlTipKor.add(lblTipKor);

		JRadioButton radBtn1 = new JRadioButton("Lekar");
		radBtn1.setFont(new Font("Arial", 0, 25));
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Apotekar");
		radBtn2.setFont(new Font("Arial", 0, 25));
		radBtn2.setBackground(new Color(230, 255, 251));

		ButtonGroup bg = new ButtonGroup();

		bg.add(radBtn1);
		bg.add(radBtn2);

		String radioText = "";

		if (radBtn1.isSelected()) {
			radioText = radBtn1.getText();
		}
		if (radBtn2.isSelected()) {
			radioText = radBtn2.getText();
		}

		pnlTipKor.add(radBtn1);
		pnlTipKor.add(radBtn2);
		formPanel.add(pnlTipKor);

		JPanel pnlKorIme = new JPanel();
		pnlKorIme.setPreferredSize(new Dimension(1100, 70));
		pnlKorIme.setBackground(new Color(230, 255, 251));

		JLabel lblKorIme = new JLabel("Korisnicko ime:");
		pnlKorIme.setBackground(new Color(230, 255, 251));
		lblKorIme.setFont(new Font("Ariel", 0, 30));
		pnlKorIme.add(lblKorIme);

		formPanel.add(pnlKorIme);

		JTextArea textArea3 = new JTextArea(2, 30);
		textArea3.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea3.setLineWrap(true);
		textArea3.setWrapStyleWord(true);

		pnlKorIme.add(textArea3);
		formPanel.add(pnlKorIme);

		JPanel pnlLozinka = new JPanel();
		pnlLozinka.setPreferredSize(new Dimension(1100, 70));
		pnlLozinka.setBackground(new Color(230, 255, 251));

		JLabel lblLozinka = new JLabel("Lozinka:");
		pnlLozinka.setBackground(new Color(230, 255, 251));
		lblLozinka.setFont(new Font("Ariel", 0, 30));
		pnlLozinka.add(lblLozinka);

		formPanel.add(pnlLozinka);

		JTextArea textArea4 = new JTextArea(2, 30);
		textArea4.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea4.setLineWrap(true);
		textArea4.setWrapStyleWord(true);

		pnlLozinka.add(textArea4);
		formPanel.add(pnlLozinka);

		formPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel btns = new JPanel();
		btns.setPreferredSize(new Dimension(1100, 70));
		btns.setBackground(new Color(230, 255, 251));

		JPanel btn1 = new JPanel();
		btn1.setBackground(new Color(230, 255, 251));
		JButton btnPrh = new JButton("Prihvati");
		btnPrh.setFont(new Font("Arial", 0, 30));
		btnPrh.setBackground(new Color(0, 204, 255));

		btn1.add(btnPrh);
		btns.add(btn1);
		formPanel.add(btns);

		JPanel btn2 = new JPanel();
		btn2.setBackground(new Color(230, 255, 251));
		JButton btnOdb = new JButton("Odbij");
		btnOdb.setFont(new Font("Arial", 0, 30));
		btnOdb.setBackground(new Color(255, 55, 0));

		btn2.add(btnOdb);
		btns.add(btn2);
		formPanel.add(btns);

		btns.setLayout(new FlowLayout(FlowLayout.RIGHT));

	}

}
