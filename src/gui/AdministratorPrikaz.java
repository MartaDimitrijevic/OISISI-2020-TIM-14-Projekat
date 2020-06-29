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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumnModel;

public class AdministratorPrikaz extends JFrame {

	public AdministratorPrikaz() {
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

		// menuPan.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel naslov = new JPanel();
		// naslov.setPreferredSize(new Dimension (100, 100));
		naslov.setBackground(new Color(230, 255, 251));
		naslov.setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel lblRegistracija = new JPanel();
		JLabel lblTop = new JLabel("Korisnici");
		lblRegistracija.setBackground(new Color(230, 255, 251));
		lblTop.setFont(new Font("Ariel", 0, 55));
		lblRegistracija.add(lblTop);
//		lblTop.setVerticalAlignment(SwingConstants.TOP);
//		lblTop.setHorizontalAlignment(SwingConstants.LEFT);

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

		JPanel sortPanel = new JPanel();
		// sortPanel.setPreferredSize(new Dimension (200, 100));
		sortPanel.setBackground(new Color(230, 255, 251));
		// BoxLayout sortPanel = new BoxLayout(btnmeni, BoxLayout.X_AXIS);

		JLabel lblSort = new JLabel("Pretraga po :");
		lblSort.setFont(new Font("Ariel", 0, 25));
		sortPanel.add(lblSort);

		sortPanel.add(lblSort);

		JRadioButton radBtn1 = new JRadioButton("Ime korisnika");
		radBtn1.setFont(new Font("Arial", 0, 23));
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Prezime korisnika");
		radBtn2.setFont(new Font("Arial", 0, 23));
		radBtn2.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn3 = new JRadioButton("Tip korisnika");
		radBtn3.setFont(new Font("Arial", 0, 23));
		radBtn3.setBackground(new Color(230, 255, 251));

		ButtonGroup bg1 = new ButtonGroup();

		bg1.add(radBtn1);
		bg1.add(radBtn2);
		bg1.add(radBtn3);

		String radioText = "";

		if (radBtn1.isSelected()) {
			radioText = radBtn1.getText();
		}
		if (radBtn2.isSelected()) {
			radioText = radBtn2.getText();
		}
		if (radBtn3.isSelected()) {
			radioText = radBtn3.getText();
		}

		sortPanel.add(radBtn1);
		sortPanel.add(radBtn2);
		sortPanel.add(radBtn3);

		sortPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

//		menuPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(btnmeni, BorderLayout.CENTER);
		menuPan.add(sortPanel, BorderLayout.SOUTH);

//		panCenter.add(menuPan);

		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));
//		
//		tablePan.setLayout(new FlowLayout(FlowLayout.CENTER));
		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tablePan, BorderLayout.CENTER);

		// add(panCenter);

		showTablePanel(tablePan);
	}

	private void showTablePanel(JPanel tablePan) {
		String column[] = { "Ime", "Prezime", "Tip korisnika" };
		String data[][] = { { "Dejan", "Mitrovic", "Korisnik" }, { "Milica", "Markovic", "Apotekar" },
				{ "Vasilije", "Ilic", "Korisnik" }, { "Petar", "Arsic", "Administrator" },
				{ "Teodora", "Nikolic", "Apotekar" }, { "Pavle", "Savic", "Korisnik" },
				{ "Nikola", "Jovic", "Korisnik" }, { "Dejan", "Mitrovic", "Apotekar" },
				{ "Andjela", "Jovicic", "Korisnik" }, { "Jovana", "Dodovic", "Korisnik" },
				{ "Milos", "Jovanovic", "Apotekar" }, { "Jovana", "Tomic", "Apotekar" },
				{ "Isidora", "Gagovic", "Korisnik" }, { "Dejan", "Babic", "Korisnik" },
				{ "Dusan", "Ivanovic", "Korisnik" }, { "Dragana", "Tomovic", "Apotekar" }, };

		JTable table = new JTable(data, column);
		table.setBounds(30, 40, 20, 30);
		table.setBackground(new Color(230, 255, 251));
		table.setGridColor(Color.black);
		table.setRowHeight(40);
		table.setFont(new Font("Verdana", Font.PLAIN, 17));

		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(1100, 500)); // x, y, width, height

		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(300);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(300);

		tablePan.add(scroll);
//		tablePan.add(table, BorderLayout.SOUTH);
	}

}