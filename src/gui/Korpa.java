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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Korpa extends JFrame {
	public Korpa() {
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
		JLabel lblTop = new JLabel("Korpa");
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

		JPanel searchPan = new JPanel();
		searchPan.setBackground(new Color(230, 255, 251));
		// searchPan.setPreferredSize(new Dimension(20, 180));
		JLabel passwordInput = new JLabel("Unesi sifru recepta :");
		passwordInput.setFont(new Font("Ariel", 0, 30));

		JTextField searchTxt = new JTextField(30);
		searchTxt.setFont(new Font("Serif", Font.ITALIC, 25));

		searchPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		searchPan.add(passwordInput);
		searchPan.add(searchTxt);

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(searchPan, BorderLayout.CENTER);

		/**
		 * main window table
		 */

		JPanel tablePanel = new JPanel();
		tablePanel.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tablePanel, BorderLayout.CENTER);

		tablePanel.setLayout(new BorderLayout());

		showTablePanel(tablePanel);
	}

	private void showTablePanel(JPanel tablePanel) {
		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));

		Object column[] = { "Ime", "Sifra", "Proizvodjac", "Recept", "Cena", "Kolicina" };
		Object data[][] = { { "Andol", "BR3348G", "Pliva a.d.", false, "220 RSD", "17" },
				{ "Omeprazol", "A02BC01", "Zdravlje a.d.", false, "350 RSD", "7" },
				{ "Riftan", "A07AA09", "HEMOFARM A.D.", true, "720 RSD", "3" },
				{ "Vesicare", "G04BD08", "Astellas d.o.o.", false, "1,545 RSD", "2" },
				{ "Serlift", "NO6AB06", "Medico Uno", false, "354 RSD", "8" },
				{ "Itanem", "J01DHO2", "GALENIKA A.D.", false, "6,552 RSD", "4" },
				{ "Brufen", "M01AE01", "HEMOFARM A.D.", false, "172 RSD", "25" },
				{ "Kafetin", "N02BE51", "ALKALOD A.D.", false, "205 RSD", "39" },
				{ "Alfacet", "D07AC13", "GALENIKA A.D.", true, "863 RDS", "12" },
				{ "Glikosan", "R06AX27", "Slaviamed a.d.", true, "220 RSD", "6" },
				{ "Amoksicilin", "J01CA04 ", "FARMALOGIST D.O.O.", false, "145 RSD", "6" },
				{ "Nexium", "A02BC05", "AastraZeneca d.o.o.", false, "500 RSD", "14" },
				{ "Logest", "G03AA10", "BAYER D.O.O.", "", "478 RSD", false, "11" },

		};

		DefaultTableModel model = new DefaultTableModel(data, column);

		JTable table = new JTable(model) {

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
		scroll.setPreferredSize(new Dimension(1100, 300));

		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(300);
		columnModel.getColumn(1).setPreferredWidth(300);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(80);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(150);

		tablePan.add(scroll);

		JPanel pricePan = new JPanel();
		pricePan.setBackground(new Color(230, 255, 251));
		// searchPan.setPreferredSize(new Dimension(20, 180));
		JLabel priceInput = new JLabel("Ukupna cena : ");
		priceInput.setFont(new Font("Ariel", 0, 30));

		JTextField searchTxt = new JTextField(10);
		searchTxt.setFont(new Font("Serif", Font.ITALIC, 30));

		pricePan.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pricePan.add(priceInput);
		pricePan.add(searchTxt);

		JPanel buttons = new JPanel();
		buttons.setBackground(new Color(230, 255, 251));
		BoxLayout menuPanelGlue = new BoxLayout(buttons, BoxLayout.Y_AXIS);
		buttons.setLayout(menuPanelGlue);
		buttons.add(Box.createGlue());

		JPanel btns = new JPanel();
		btns.setBackground(new Color(230, 255, 251));

		JPanel btn1 = new JPanel();
		btn1.setBackground(new Color(230, 255, 251));
		JButton btnKupi = new JButton("Kupi");
		btnKupi.setFont(new Font("Arial", 0, 30));
		btnKupi.setBackground(new Color(0, 204, 255));

		btn1.add(btnKupi);

		JPanel btn2 = new JPanel();
		btn2.setBackground(new Color(230, 255, 251));
		JButton btnOdb = new JButton("Odbij");
		btnOdb.setFont(new Font("Arial", 0, 30));
		btnOdb.setBackground(new Color(255, 55, 0));

		btn2.add(btnOdb);

		btns.add(btn1);
		btns.add(btn2);

		btns.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JPanel btn3 = new JPanel();
		btn3.setBackground(new Color(230, 255, 251));
		JButton btnDelete = new JButton("Obrisi korpu");
		btnDelete.setFont(new Font("Arial", 0, 30));
		btnDelete.setBackground(new Color(255, 255, 255));
		btn3.setLayout(new FlowLayout(FlowLayout.RIGHT));

		btn3.add(btnDelete);

		buttons.add(btns);
		buttons.add(btn3);

		tablePanel.add(tablePan, BorderLayout.NORTH);
		tablePanel.add(pricePan, BorderLayout.CENTER);
//		tablePanel.add(btns, BorderLayout.SOUTH);
//		tablePanel.add(btn3, BorderLayout.PAGE_END);
		tablePanel.add(buttons, BorderLayout.SOUTH);
	}

}
