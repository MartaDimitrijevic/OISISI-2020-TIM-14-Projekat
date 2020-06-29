package gui;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
//import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.*;

public class IzvestajOdabranogProizvodjaca extends JFrame {
	private static final long serialVersionUID = 1L;

	public IzvestajOdabranogProizvodjaca() {
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
		menuPan.add(Box.createGlue());

		JPanel naslov = new JPanel();
		naslov.setLayout(new BorderLayout());
		naslov.setBackground(new Color(230, 255, 251));

		JPanel labelaRecepti = new JPanel();
		JLabel lblTop = new JLabel("Izvestaj");
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

		JPanel ukuProdLek = new JPanel();
		// recepti.setPreferredSize(null);
		ukuProdLek.setBackground(new Color(230, 255, 251));
//		recepti.setLayout(new FlowLayout(FlowLayout.CENTER));
		GridLayout receptiLayout = new GridLayout(1, 3);
		receptiLayout.setHgap(20);
		ukuProdLek.setLayout(receptiLayout);

		JButton btn6 = new JButton();
		btn6.setText("<html> <center> Ukupna prodaja <br> svih lekova </center> </html> \n");
		btn6.setFont(new Font("Arial", 0, 20));
		btn6.setBackground(new Color(230, 255, 251));
		ukuProdLek.add(btn6);

		JButton btn7 = new JButton();
		btn7.setText("<html> <center> Ukupna prodaja svih <br> lekova odabranog proizvodjaca </center> </html> \n");
		btn7.setFont(new Font("Arial", 0, 20));
		btn7.setBackground(new Color(230, 255, 251));
		ukuProdLek.add(btn7);

		JButton btn8 = new JButton();
		btn8.setText(
				"<html> <center> Ukupna prodaja svih lekova koje <br> je odabrani apotekar prodao </center> </html> \n");
		btn8.setFont(new Font("Arial", 0, 20));
		btn8.setBackground(new Color(230, 255, 251));
		ukuProdLek.add(btn8);

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(ukuProdLek, BorderLayout.CENTER);

		JPanel tableSearchPan = new JPanel();
		tableSearchPan.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tableSearchPan, BorderLayout.CENTER);

		tableSearchPan.setLayout(new BorderLayout());

		showTablePanel(tableSearchPan);
	}

	/**
	 * main window table
	 */

	private void showTablePanel(JPanel tableSearchPan) {

		JPanel searchPan = new JPanel();
		searchPan.setBackground(new Color(230, 255, 251));
		JLabel searchProiz = new JLabel("Proizvodjac :");
		searchProiz.setFont(new Font("Ariel", 0, 20));
		searchPan.add(searchProiz);
		// searchPan.setPreferredSize(new Dimension(20, 180));
		JTextField searchTxt = new JTextField(30);
		searchTxt.setFont(new Font("Ariel", 0, 20));
		searchPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		searchPan.add(searchTxt);
		
		JTable table;

		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));

		Object column[] = { "Ime", "Sifra", "Proizvodjac", "Recept", "Cena", "Kolicina", "Zarada" };
		Object data[][] = { { "Andol", "BR3348G", "Pliva a.d.", false, "220 RSD", "17", "" },
				{ "Omeprazol", "A02BC01", "Zdravlje a.d.", false, "350 RSD", "7", "" },
				{ "Riftan", "A07AA09", "HEMOFARM A.D.", true, "720 RSD", "3", "" },
				{ "Vesicare", "G04BD08", "Astellas d.o.o.", false, "1,545 RSD", "2", "" },
				{ "Serlift", "NO6AB06", "Medico Uno", false, "354 RSD", "8", "" },
				{ "Itanem", "J01DHO2", "GALENIKA A.D.", false, "6,552 RSD", "4", "" },
				{ "Brufen", "M01AE01", "HEMOFARM A.D.", false, "172 RSD", "25", "" },
				{ "Kafetin", "N02BE51", "ALKALOD A.D.", false, "205 RSD", "39", "" },
				{ "Alfacet", "D07AC13", "GALENIKA A.D.", true, "863 RDS", "12", "" },
				{ "Glikosan", "R06AX27", "Slaviamed a.d.", true, "220 RSD", "6", "" },
				{ "Amoksicilin", "J01CA04 ", "FARMALOGIST D.O.O.", false, "145 RSD", "6", "" },
				{ "Nexium", "A02BC05", "AastraZeneca d.o.o.", false, "500 RSD", "14", "" },
				{ "Logest", "G03AA10", "BAYER D.O.O.", "", "478 RSD", false, "11", "" },

		};

		DefaultTableModel model = new DefaultTableModel(data, column);

		table = new JTable(model) {

			private static final long serialVersionUID = 1L;

			@Override
			public Class getColumnClass(int column) {
				switch (column) {
				case 0:
					return String.class;
				case 1:
					return String.class;
				case 2:
					return String.class;
				case 3:
					return Boolean.class;
				case 4:
					return String.class;
				case 5:
					return String.class;
				default:
					return String.class;
				}
			}
		};
		
		table.setRowHeight(40);
		table.setFont(new Font("Verdana", Font.PLAIN, 17));

		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(1100, 450));

		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(300);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(80);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(150);
		columnModel.getColumn(6).setPreferredWidth(150);

		tablePan.add(scroll);

		tableSearchPan.add(searchPan, BorderLayout.PAGE_START);
		tableSearchPan.add(tablePan, BorderLayout.CENTER);
	}
}
