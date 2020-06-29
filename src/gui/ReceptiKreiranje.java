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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class ReceptiKreiranje extends JFrame {
	public ReceptiKreiranje() {
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

		/**
		 * main window menu
		 */

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
		menuPan.setPreferredSize(new Dimension(20, 180));
//		panCenter.add(menuPan, BorderLayout.NORTH);
		menuPan.add(Box.createGlue());

		JPanel naslov = new JPanel();
		naslov.setLayout(new BorderLayout());
		naslov.setBackground(new Color(230, 255, 251));

		JPanel labelaRecepti = new JPanel();
		JLabel lblTop = new JLabel("Recepti");
		labelaRecepti.setBackground(new Color(230, 255, 251));
		lblTop.setFont(new Font("Ariel", 0, 55));
		labelaRecepti.add(lblTop);

		labelaRecepti.setLayout(new FlowLayout(FlowLayout.LEFT));
		labelaRecepti.add(lblTop);

		JPanel odjava = new JPanel();
		odjava.setBackground(new Color(230, 255, 251));
		JButton btnOdjava = new JButton("Odjava");
		btnOdjava.setFont(new Font("Arial", 0, 30));
		btnOdjava.setBackground(new Color(106, 183, 139));

		odjava.add(btnOdjava);

		naslov.add(labelaRecepti, BorderLayout.WEST);
		naslov.add(odjava, BorderLayout.EAST);

		JPanel recepti = new JPanel();
		// recepti.setPreferredSize(null);
		recepti.setBackground(new Color(230, 255, 251));
		GridLayout receptiLayout = new GridLayout(1, 3);
		receptiLayout.setHgap(150);
		recepti.setLayout(receptiLayout);

		JButton btn6 = new JButton("Prikaz recepata");
		btn6.setFont(new Font("Arial", 0, 30));
		btn6.setBackground(new Color(230, 255, 251));
		recepti.add(btn6);

		JButton btn7 = new JButton("Pretraga recepata");
		btn7.setFont(new Font("Arial", 0, 30));
		btn7.setBackground(new Color(230, 255, 251));
		recepti.add(btn7);

		JButton btn8 = new JButton("Kreirati novi recept");
		btn8.setFont(new Font("Arial", 0, 30));
		btn8.setBackground(new Color(230, 255, 251));
		recepti.add(btn8);

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(recepti, BorderLayout.CENTER);

		JPanel formPanel = new JPanel();
		formPanel.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(formPanel, BorderLayout.CENTER);

		// add(panCenter);

		showFormPanel(formPanel);
	}

	private void showFormPanel(JPanel formPanel) {
		JPanel paramPan = new JPanel();
		paramPan.setBackground(new Color(230, 255, 251));
		paramPan.setLayout(new BorderLayout());

		JPanel parameterTextPan = new JPanel();
		parameterTextPan.setBackground(new Color(250, 255, 251));
		BoxLayout parameterTextPanGlue = new BoxLayout(parameterTextPan, BoxLayout.Y_AXIS);
		parameterTextPan.setLayout(parameterTextPanGlue);
		parameterTextPan.add(Box.createGlue());

		JPanel parameterPan1 = new JPanel();
		parameterPan1.setBackground(new Color(230, 255, 251));
		JLabel JMBGLabel = new JLabel(" JMBG pacijenta :");
		JMBGLabel.setFont(new Font("Ariel", 0, 30));

		JTextField textArea1 = new JTextField(30);
		textArea1.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan1.add(JMBGLabel);
		parameterPan1.add(textArea1);
		parameterTextPan.add(parameterPan1);

		JPanel parameterPan2 = new JPanel();
		parameterPan2.setBackground(new Color(230, 255, 251));
		JLabel datePan = new JLabel("Datum izdavanja :");
		datePan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea2 = new JTextField(30);
		textArea2.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan2.add(datePan);
		parameterPan2.add(textArea2);
		parameterTextPan.add(parameterPan2);

		JPanel parameterPan3 = new JPanel();
		parameterPan3.setBackground(new Color(230, 255, 251));
		JLabel timePan = new JLabel("  Vreme kreiranja :");
		timePan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea3 = new JTextField(30);
		textArea3.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan3.add(timePan);
		parameterPan3.add(textArea3);
		parameterTextPan.add(parameterPan3);

		JPanel parameterPan4 = new JPanel();
		parameterPan4.setBackground(new Color(230, 255, 251));
		JLabel passwordPan = new JLabel("             Sifra leka :");
		passwordPan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea4 = new JTextField(30);
		textArea4.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan4.add(passwordPan);
		parameterPan4.add(textArea4);
		parameterTextPan.add(parameterPan4);

		JPanel parameterPan5 = new JPanel();
		parameterPan5.setBackground(new Color(230, 255, 251));
		JLabel quantityPan = new JLabel("       Kolicina leka :");
		quantityPan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea5 = new JTextField(30);
		textArea5.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan5.add(quantityPan);
		parameterPan5.add(textArea5);
		parameterTextPan.add(parameterPan5);

		// formPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel parameterPan6 = new JPanel();
		parameterPan6.setBackground(new Color(230, 255, 251));
		JLabel medicinePasswordPan = new JLabel("       Sifra recepta :");
		medicinePasswordPan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea6 = new JTextField(30);
		textArea6.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan6.add(medicinePasswordPan);
		parameterPan6.add(textArea6);
		parameterTextPan.add(parameterPan6);

		JPanel parameterPan7 = new JPanel();
		parameterPan7.setBackground(new Color(230, 255, 251));
		JLabel doctorPasswordPan = new JLabel("         Sifra lekara :");
		doctorPasswordPan.setFont(new Font("Ariel", 0, 30));

		JTextField textArea7 = new JTextField(30);
		textArea7.setFont(new Font("Serif", Font.ITALIC, 16));

		parameterPan7.add(doctorPasswordPan);
		parameterPan7.add(textArea7);
		parameterTextPan.add(parameterPan7);

		JPanel btns = new JPanel();
		btns.setBackground(new Color(230, 255, 251));

		JPanel btn1 = new JPanel();
		btn1.setBackground(new Color(230, 255, 251));
		JButton btnPrh = new JButton("Prihvati");
		btnPrh.setFont(new Font("Arial", 0, 30));
		btnPrh.setBackground(new Color(0, 204, 255));

		btn1.add(btnPrh);

		JPanel btn2 = new JPanel();
		btn2.setBackground(new Color(230, 255, 251));
		JButton btnOdb = new JButton("Odbij");
		btnOdb.setFont(new Font("Arial", 0, 30));
		btnOdb.setBackground(new Color(255, 55, 0));

		btn2.add(btnOdb);

		btns.add(btn1);
		btns.add(btn2);

		btns.setLayout(new FlowLayout(FlowLayout.RIGHT));

		paramPan.add(parameterTextPan, BorderLayout.WEST);
		paramPan.add(btns, BorderLayout.SOUTH);
		formPanel.add(paramPan);

	}

}
