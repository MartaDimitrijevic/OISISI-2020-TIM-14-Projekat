package gui;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumnModel;

public class ReceptiPretraga extends JFrame {
	public ReceptiPretraga() {
		super();
		setTitle("OISISI-2020-TIM-14");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		/**
		 * main window menu
		 */

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));

		showMenuPanel(panCenter);

//		add(panLeft, BorderLayout.WEST);
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

		JPanel pretraga = new JPanel();
		pretraga.setLayout(new BorderLayout());
		pretraga.setBackground(new Color(230, 255, 251));

		JPanel pretragaPanel = new JPanel();
		JLabel lblPretraga = new JLabel("Pretraga po :");
		// pretragaPanel.setPreferredSize(null);
		pretragaPanel.setBackground(new Color(230, 255, 251));
		lblPretraga.setFont(new Font("Ariel", 0, 25));
		pretragaPanel.add(lblPretraga);

		JPanel raddioButtons = new JPanel();
		GridLayout raddioLayout = new GridLayout(1, 4);
		raddioLayout.setHgap(2);
		raddioButtons.setBackground(new Color(230, 255, 251));
		raddioButtons.setLayout(raddioLayout);

		JRadioButton radBtn1 = new JRadioButton("Sifri");
		radBtn1.setFont(new Font("Arial", 0, 23));
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Lekaru");
		radBtn2.setFont(new Font("Arial", 0, 23));
		radBtn2.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn3 = new JRadioButton("JMBG");
		radBtn3.setFont(new Font("Arial", 0, 23));
		radBtn3.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn4 = new JRadioButton("Leku");
		radBtn4.setFont(new Font("Arial", 0, 23));
		radBtn4.setBackground(new Color(230, 255, 251));

		ButtonGroup pretragaPo = new ButtonGroup();

		pretragaPo.add(radBtn1);
		pretragaPo.add(radBtn2);
		pretragaPo.add(radBtn3);
		pretragaPo.add(radBtn4);

		String radioText = "";

		if (radBtn1.isSelected()) {radioText = radBtn1.getText();}
		if (radBtn2.isSelected()) {radioText = radBtn2.getText();}
		if (radBtn3.isSelected()) {radioText = radBtn3.getText();}
		if (radBtn4.isSelected()) {radioText = radBtn4.getText();}

		raddioButtons.add(radBtn1);
		raddioButtons.add(radBtn2);
		raddioButtons.add(radBtn3);
		raddioButtons.add(radBtn4);

		pretraga.add(pretragaPanel, BorderLayout.WEST);
//		pretraga.add(raddioButtons, BorderLayout.CENTER);
		pretraga.add(raddioButtons);

//		menuPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(recepti, BorderLayout.CENTER);
		menuPan.add(pretraga, BorderLayout.SOUTH);

//		panCenter.add(menuPan);

		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));

//		//add(panCenter);

		class PretragaAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(pretragaPo.getSelection().getActionCommand());
				String pretrazi = pretragaPo.getSelection().getActionCommand();
				System.out.println("action " + pretrazi);
				if (pretrazi.equals("Sifri")) {
//					System.out.println("action sifri " + pretrazi);
//					showTablePanel(tablePan, pretrazi);
				}
			}

		}

		ActionListener PretragaAction = new PretragaAction();
		radBtn1.addActionListener(PretragaAction);

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tablePan, BorderLayout.CENTER);

		/**
		 * main window table
		 */

		JPanel tableSearchPan = new JPanel();
		tableSearchPan.setBackground(new Color(230, 255, 251));

		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tableSearchPan, BorderLayout.CENTER);

		tableSearchPan.setLayout(new BorderLayout());

	}

//	private void showTablePanel(JPanel tableSearchPan) {
//		JPanel searchPan = new JPanel();
//		searchPan.setBackground(new Color(230, 255, 251));
//		// searchPan.setPreferredSize(new Dimension(20, 180));
//		JTextField searchTxt = new JTextField(30);
//		searchTxt.setFont(new Font("Ariel", 0, 20));
//		searchPan.setLayout(new FlowLayout(FlowLayout.LEFT));
//		searchPan.add(searchTxt);
//
//		JPanel tablePan = new JPanel();
//		tablePan.setBackground(new Color(230, 255, 251));
//
//		String column[] = { "Sifra", "Lekar", "JMBG", "Lek" };
//		String data[][] = { { "1021145", "Petar Arsic", "3004962724819", "Amoksicilin" },
//				{ "1325153", "Tijana Matic", "2405986075118", "Hemomycin" },
//				{ "1749372", "Sara Simovic", "2207200915274", "Propafen" },
//				{ "2149375", "Marija Jovanovic", "0806196711318", "Bactrim" },
//				{ "2619384", "Pavle Vojvodic", "1808998122043", "Eritromicin" },
//				{ "2857193", "Marina Vukotic", "2804970002332", "Milenol" },
//				{ "3026210", "Sara Nedovic", "2408959161274", "Ciprocinal" },
//				{ "3321875", "Petar Arsic", "0408997725036", "Palitrex" },
//				{ "3325483", "Vasilije Ilic", "1505948110855", "Madopar" },
//				{ "5193728", "Aleksandar Maric", "1409959171930", "Spalmotil" },
//				{ "5418673", "Igor Janjic", "3010005190025", "Cetirizin" },
//				{ "5974216", "Aleksandar Petrovic", "3103984002340", "Daktanol" },
//				{ "6538147", "Milan Adamovic", "2411991090716", "Methyldopa" },
//				{ "6724933", "Pavle Savic", "0702972011052", "Iruzid" },
//				{ "6967825", "Helena Velickovic", "0104959233015", "Revatio" },
//				{ "8468571", "Marija Jovanovic", "2701997082355", "Panklav" } };
//
//		JTable table = new JTable(data, column);
//		table.setRowHeight(40);
//		table.setFont(new Font("Verdana", Font.PLAIN, 17));
//
//		JScrollPane scroll = new JScrollPane(table);
//		scroll.setPreferredSize(new Dimension(1100, 450));
//
//		TableColumnModel columnModel = table.getColumnModel();
//		columnModel.getColumn(0).setPreferredWidth(200);
//		columnModel.getColumn(1).setPreferredWidth(300);
//		columnModel.getColumn(2).setPreferredWidth(200);
//		columnModel.getColumn(3).setPreferredWidth(200);
//
//		tablePan.add(scroll);
//
//		tableSearchPan.add(searchPan, BorderLayout.PAGE_START);
//		tableSearchPan.add(tablePan, BorderLayout.CENTER);
//	}

}
