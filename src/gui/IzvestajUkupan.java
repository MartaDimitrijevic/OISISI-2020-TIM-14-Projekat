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
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumnModel;

public class IzvestajUkupan extends JFrame {
	public IzvestajUkupan() {
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
		JLabel lblTop = new JLabel("Izvestaj");
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

		JPanel izvestaj = new JPanel();
		// lekovi.setPreferredSize(null);
		izvestaj.setBackground(new Color(230, 255, 251));
		izvestaj.setLayout(new FlowLayout(FlowLayout.CENTER));
		GridLayout izvestajLayout = new GridLayout(1, 3);
		izvestajLayout.setHgap(40);
		izvestaj.setLayout(izvestajLayout);

		JButton btn6 = new JButton();
		btn6.setText("<html> <center> Ukupna prodaja<br>svih lekova </center> </html>\n");
		btn6.setFont(new Font("Arial", 0, 20));
		btn6.setBackground(new Color(230, 255, 251));
		izvestaj.add(btn6);

		JButton btn7 = new JButton();
		btn7.setText("<html> <center> Ukupna prodaja svih<br>lekova odabranog proizvodjaca </center> </html>\n");
		btn7.setFont(new Font("Arial", 0, 20));
		btn7.setBackground(new Color(230, 255, 251));
		izvestaj.add(btn7);

		JButton btn8 = new JButton();
		btn8.setText(
				"<html> <center> Ukupna prodaja svih lekova koje<br>je odabrani apotekar prodao </center> </html>\n");
		btn8.setFont(new Font("Arial", 0, 20));
		btn8.setBackground(new Color(230, 255, 251));
		izvestaj.add(btn8);

		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(izvestaj, BorderLayout.CENTER);

		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tablePan, BorderLayout.CENTER);

		showTablePanel(tablePan);

	}

	private void showTablePanel(JPanel tablePan) {

		String column[] = { "Ime", "Sifra", "Proizvodjac", "Recept", "Cena", "Kolicina", "Zarada" };
		String data[][] = { { "Andol", "BR3348G", "Pliva a.d.", "", "220 RSD ", "75", "16,500 RSD" },
				{ "Brufen", "M01AE01", "HEMOFARM A.D.", "", "172 RSD", "133", "22,876 RSD" },
				{ "Kafetin", "N02BE51", "ALKALOD A.D.", " ", "205 RSD", "82", "20,500 RSD" },
				{ "Omeprazol", "A02BC01", "Zdravlje a.d.", " ", "350 RSD", "112", "39,200 RSD" },
				{ "Presing", "E06AX", "HEMOFARM A.D.", " ", "275 RSD", "150", "41,250 RSD " },
				{ "Alfacet", "D07AC13", "GALENIKA A.D.", " ", "863 RSD", "23", "19,849 RSD" },
				{ "Glikosan", "R06AX27", "Slaviamed a.d.", " ", "220 RSD", "85", "18,700 RSD" },
				{ "Riftan", "A07AA09", "HEMOFARM A.D.", " ", "720 RSD", "79", "56,880" },
				{ "Tefor", "N06AX16", "GALENIKA A.D.", " ", "98 RSD", "62", "6,076 RSD" },
				{ "Edicin", "J01XA01", "Lek a.d.", " ", "1,400 RSD ", "123", "172,200 RSD" },
				{ "Amoksicilin", "J01CA04 ", "FARMALOGIST D.O.O.", " ", "145 RSD ", "321", "46,545 RSD" },
				{ "Nexium", "A02BC05", "AastraZeneca d.o.o.", " ", "500 RSD ", "400", "200,000 RSD" },
				{ "Vesicare", "G04BD08", "Astellas d.o.o.", " ", "1,545 RSD ", "111", "171,495 RSD" },
				{ "Triplixam", "C09B0X1", "Servior Ireland", " ", "1,017 RSD ", "40", "40,680 RSD" },
				{ "Serlift", "NO6AB06", "Medico Uno", " ", "345 RSD", "32", "11,040 RSD" },
				{ "Itanem", "J01DHO2", "GALENIKA A.D.", " ", "6,552 RSD", "18", "117,936 RSD" },
				{ "Logest", "G03AA10", "BAYER D.O.O.", " ", "478 RSD", "50", "23,900 RSD" },
				{ "Aluvia", "J05AR10", "ABBVIE.KG.", " ", "9,606 RSD", "75", "720,450 RSD" },
				{ "Galitifen", "RO6AC17", "GALENIKA A.D.", " ", "199 RSD ", "200", "39,800 RSD" },
				{ "Opitiray", "V08ABO7", "MEDICOM D.O.O.", " ", "17,078 RSD ", "378", "6,455,484 RSD" } };

		JTable table = new JTable(data, column);
		table.setBounds(30, 40, 20, 30);
		table.setRowHeight(40);
		table.setFont(new Font("Verdana", Font.PLAIN, 17));
		table.setBackground(new Color(230, 255, 251));
		table.setGridColor(Color.black);

		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(1100, 500)); // x, y, width, height

		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(250);
		columnModel.getColumn(3).setPreferredWidth(100);
		columnModel.getColumn(4).setPreferredWidth(200);
		columnModel.getColumn(5).setPreferredWidth(150);
		columnModel.getColumn(6).setPreferredWidth(200);

		tablePan.add(scroll);
//		tablePan.add(table, BorderLayout.SOUTH);
	}

}
