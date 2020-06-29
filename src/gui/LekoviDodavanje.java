package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class LekoviDodavanje extends JFrame {

	public LekoviDodavanje() {
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

//		panCenter.add(panLeft, BorderLayout.WEST);

		JPanel menuPan = new JPanel();
		BoxLayout menuPanelGlue = new BoxLayout(menuPan, BoxLayout.Y_AXIS);
		menuPan.setLayout(menuPanelGlue);
		menuPan.setBackground(new Color(230, 255, 251));
		menuPan.setPreferredSize(new Dimension(20, 180));
		panCenter.add(menuPan, BorderLayout.NORTH);
		menuPan.add(Box.createGlue());

		JPanel naslov = new JPanel();
		// naslov.setPreferredSize(null);
		naslov.setBackground(new Color(230, 255, 251));
		naslov.setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel labelaLekovi = new JPanel();
		JLabel lblTop = new JLabel("Lekovi");
		labelaLekovi.setBackground(new Color(230, 255, 251));
		lblTop.setFont(new Font("Ariel", 0, 55));
		labelaLekovi.add(lblTop);
		// lblTop.setVerticalAlignment(SwingConstants.TOP);
		// lblTop.setHorizontalAlignment(SwingConstants.LEFT);

		// labelaLekovi.setLayout(new FlowLayout(FlowLayout.LEFT));
		labelaLekovi.add(lblTop);

		JPanel odjava = new JPanel();
		odjava.setPreferredSize(new Dimension(900, 50));
		odjava.setBackground(new Color(230, 255, 251));
		JButton btnOdjava = new JButton("Odjava");
		btnOdjava.setFont(new Font("Arial", 0, 30));
		btnOdjava.setBackground(new Color(106, 183, 139));

		odjava.add(btnOdjava);
//		odjava.setVerticalAlignment(SwingConstants.TOP);
//		odjava.setHorizontalAlignment(SwingConstants.RIGHT);

		naslov.add(labelaLekovi);
		naslov.add(odjava);

		odjava.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JPanel lekovi = new JPanel();
		// lekovi.setPreferredSize(null);
		lekovi.setBackground(new Color(230, 255, 251));
		lekovi.setLayout(new FlowLayout(FlowLayout.CENTER));
		GridLayout lekoviLayout = new GridLayout(1, 4);
		lekoviLayout.setHgap(10);
		lekovi.setLayout(lekoviLayout);

		JButton btn6 = new JButton("Prikaz lekova");
		btn6.setFont(new Font("Arial", 0, 30));
		btn6.setBackground(new Color(230, 255, 251));
		lekovi.add(btn6);

		JButton btn7 = new JButton("Pretraga lekova");
		btn7.setFont(new Font("Arial", 0, 30));
		btn7.setBackground(new Color(230, 255, 251));
		lekovi.add(btn7);

		JButton btn8 = new JButton("Dodavanje lekova");
		btn8.setFont(new Font("Arial", 0, 30));
		btn8.setBackground(new Color(230, 255, 251));
		lekovi.add(btn8);

		JButton btn9 = new JButton("Izmena lekova");
		btn9.setFont(new Font("Arial", 0, 30));
		btn9.setBackground(new Color(230, 255, 251));
		lekovi.add(btn9);

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(lekovi, BorderLayout.CENTER);

		JPanel dodati = new JPanel();
		dodati.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(dodati, BorderLayout.CENTER);

		dodati.setLayout(new BorderLayout());

		showDodatiPanel(dodati);
	}

	private void showDodatiPanel(JPanel dodati) {

		JPanel sifra = new JPanel();
		sifra.setBackground(new Color(230, 255, 251));
		sifra.setPreferredSize(new Dimension(1100, 70));

		JLabel lblSif = new JLabel("Sifra:");
		lblSif.setFont(new Font("Ariel", 0, 40));
		sifra.add(lblSif);

		JTextField txtSif = new JTextField(15);
		txtSif.setFont(new Font("Ariel", 0, 25));
		sifra.add(txtSif);

		sifra.setLayout(new FlowLayout(FlowLayout.CENTER));

		dodati.add(sifra, BorderLayout.PAGE_START);

		JPanel ime = new JPanel();
		ime.setBackground(new Color(230, 255, 251));
		ime.setPreferredSize(new Dimension(1100, 70));

		JLabel lblIme = new JLabel("Ime leka:");
		lblIme.setFont(new Font("Ariel", 0, 40));
		ime.add(lblIme);

		JTextField txtIme = new JTextField(15);
		txtIme.setFont(new Font("Ariel", 0, 25));
		ime.add(txtIme);

		ime.setLayout(new FlowLayout(FlowLayout.CENTER));

		dodati.add(ime, BorderLayout.PAGE_START);

		JPanel Proiz = new JPanel();
		Proiz.setBackground(new Color(230, 255, 251));
		Proiz.setPreferredSize(new Dimension(1100, 70));

		JLabel lblProiz = new JLabel("Proizvodjac:");
		lblProiz.setFont(new Font("Ariel", 0, 40));
		Proiz.add(lblProiz);

		JTextField txtProiz = new JTextField(15);
		txtProiz.setFont(new Font("Ariel", 0, 25));
		Proiz.add(txtProiz);

		Proiz.setLayout(new FlowLayout(FlowLayout.CENTER));

		dodati.add(Proiz, BorderLayout.PAGE_START);

		JPanel Cena = new JPanel();
		Cena.setBackground(new Color(230, 255, 251));
		Cena.setPreferredSize(new Dimension(1100, 70));

		JLabel lblCena = new JLabel("Cena leka:");
		lblCena.setFont(new Font("Ariel", 0, 40));
		Cena.add(lblCena);

		JTextField txtCena = new JTextField(15);
		txtCena.setFont(new Font("Ariel", 0, 25));
		Cena.add(txtCena);

		Cena.setLayout(new FlowLayout(FlowLayout.CENTER));

		dodati.add(Cena, BorderLayout.PAGE_START);

		JPanel dodaj = new JPanel();
		dodaj.setBackground(new Color(230, 255, 251));

		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setFont(new Font("Arial", 0, 30));
		btnDodaj.setBackground(new Color(0, 204, 255));

		dodaj.add(btnDodaj);
		dodati.add(dodaj);
		dodati.setLayout(new FlowLayout(FlowLayout.CENTER));

	}
}
