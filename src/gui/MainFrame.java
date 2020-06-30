package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MainFrame extends JFrame {

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("OISISI-2020-TIM-14");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));
		panCenter.setBackground(new Color(230, 255, 251));
//		panCenter.setVisible(false);
//		prikaziRecepte(panCenter);
		initMenuButtons(panCenter);

		add(panCenter, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	private void initMenuButtons(JPanel panCenter) {
		// TODO Auto-generated method stub
//		panCenter.setVisible(false);
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
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				prikaziRecepte(panCenter);
				panCenter.setVisible(true);

			}
		});
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
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				prikaziIzvestaj(panCenter);
				panCenter.setVisible(true);

			}
		});
		panLeft.add(btn4);

		Icon icon5 = new ImageIcon("images/korpa1.png");
		JButton btn5 = new JButton("Korpa", icon5);
		btn5.setFont(new Font("Arial", 0, 20));
		btn5.setBackground(new Color(154, 255, 197));
		btn5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn5.setHorizontalTextPosition(SwingConstants.CENTER);
		panLeft.add(btn5);

		add(panLeft, BorderLayout.WEST);
	}

	private void prikaziRecepte(JPanel panCenter) {
		panCenter.setVisible(false);
		JPanel receptiPanel = new JPanel();
		BoxLayout menuPanelGlue = new BoxLayout(receptiPanel, BoxLayout.Y_AXIS);
		receptiPanel.setLayout(menuPanelGlue);
		receptiPanel.setBackground(new Color(230, 255, 251));
		receptiPanel.setPreferredSize(new Dimension(20, 180));
//		panCenter.add(menuPan, BorderLayout.NORTH);
		receptiPanel.add(Box.createGlue());

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

		// table
		JPanel tablePan = new JPanel();
		JPanel tablePanPret = new JPanel();
		JTable tabelaRecepti = initTable();
		JTable tabelaReceptiPret = initPretragaTable();

		JScrollPane tableScroll = new JScrollPane(tabelaRecepti);
		JScrollPane tableScrollPret = new JScrollPane(tabelaReceptiPret);

		tablePan.setVisible(false);
		tablePanPret.setVisible(false);

		//////////////////

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(230, 255, 251));

		JPanel formPanel = new JPanel();

		JPanel sortiranje = sortirajPanel(receptiPanel, tablePan, tabelaRecepti);
		sortiranje.setVisible(false);

		JPanel pretraga = pretragaPanel(receptiPanel, tablePanPret, tabelaReceptiPret);
		pretraga.setVisible(false);

		JPanel kreiranje = kreirajPanel(receptiPanel, formPanel);
		kreiranje.setVisible(false);

		JButton btn6 = new JButton("Prikaz recepata");
		btn6.setFont(new Font("Arial", 0, 30));
		btn6.setBackground(new Color(230, 255, 251));
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pretraga.setVisible(false);
				sortiranje.setVisible(true);
				kreiranje.setVisible(false);
//				tablePan.setVisible(true);
				tablePan.setVisible(false);

				tablePanPret.setVisible(false);
			}
		});
		recepti.add(btn6);

		JButton btn7 = new JButton("Pretraga recepata");
		btn7.setFont(new Font("Arial", 0, 30));
		btn7.setBackground(new Color(230, 255, 251));
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sortiranje.setVisible(false);
				pretraga.setVisible(true);
				kreiranje.setVisible(false);
				tablePanPret.setVisible(true);
				tablePan.setVisible(false);
			}
		});
		recepti.add(btn7);

		JButton btn8 = new JButton("Kreirati novi recept");
		btn8.setFont(new Font("Arial", 0, 30));
		btn8.setBackground(new Color(230, 255, 251));
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				sortiranje.setVisible(false);
				pretraga.setVisible(false);
				kreiranje.setVisible(true);
				tablePan.setVisible(false);
				tablePanPret.setVisible(false);
			}
		});
		recepti.add(btn8);

//		menuPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		receptiPanel.add(naslov, BorderLayout.NORTH);
		receptiPanel.add(recepti, BorderLayout.CENTER);
		receptiPanel.add(sortiranje, BorderLayout.SOUTH);
		receptiPanel.add(pretraga, BorderLayout.SOUTH);
		tablePan.add(tableScroll, BorderLayout.CENTER);
		tablePanPret.add(tableScrollPret, BorderLayout.CENTER);

		panCenter.setBackground(new Color(230, 255, 251));
		panCenter.add(receptiPanel, BorderLayout.NORTH);

		bottomPanel.add(tablePan, BorderLayout.CENTER);
		bottomPanel.add(tablePanPret, BorderLayout.CENTER);
		bottomPanel.add(kreiranje, BorderLayout.CENTER);

		panCenter.add(bottomPanel, BorderLayout.CENTER);

		add(panCenter, BorderLayout.CENTER);
	}

	private JPanel sortirajPanel(JPanel receptiPanel, JPanel tablePan, JTable tabelaRecepti) {
		JPanel sortiranje = new JPanel();
		sortiranje.setVisible(false);
		sortiranje.setLayout(new BorderLayout());
		sortiranje.setBackground(new Color(230, 255, 251));

		JPanel sortiraniPanel = new JPanel();
		JLabel lblSort = new JLabel("Sortiraj po :");
		// sortirajPanel.setPreferredSize(null);
		sortiraniPanel.setBackground(new Color(230, 255, 251));
		lblSort.setFont(new Font("Ariel", 0, 25));
		sortiraniPanel.add(lblSort);

		JPanel raddioButtons = new JPanel();
		GridLayout raddioLayout = new GridLayout(1, 3);
		raddioLayout.setHgap(2);
		raddioButtons.setBackground(new Color(230, 255, 251));
		raddioButtons.setLayout(raddioLayout);

		JRadioButton radBtn1 = new JRadioButton("Sifri");
		radBtn1.setActionCommand("Sifri");
		radBtn1.setFont(new Font("Arial", 0, 23));
		radBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				TableRowSorter<MyTableModel> sorter = new TableRowSorter<MyTableModel>(new MyTableModel());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);
				tablePan.setVisible(true);
			}
		});
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Lekaru");
		radBtn2.setFont(new Font("Arial", 0, 23));
		radBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				TableRowSorter<MyTableModel> sorter = new TableRowSorter<MyTableModel>(new MyTableModel());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePan.setVisible(true);

			}
		});
		radBtn2.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn3 = new JRadioButton("Datumu");
		radBtn3.setFont(new Font("Arial", 0, 23));

		radBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("akcija " + e.getActionCommand());
				TableRowSorter<MyTableModel> sorter = new TableRowSorter<MyTableModel>(new MyTableModel());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePan.setVisible(true);

			}
		});
		radBtn3.setBackground(new Color(230, 255, 251));

		ButtonGroup sortirajPo = new ButtonGroup();

		sortirajPo.add(radBtn1);
		sortirajPo.add(radBtn2);
		sortirajPo.add(radBtn3);

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

		raddioButtons.add(radBtn1);
		raddioButtons.add(radBtn2);
		raddioButtons.add(radBtn3);

		sortiranje.add(sortiraniPanel, BorderLayout.WEST);
//		sortiranje.add(raddioButtons, BorderLayout.CENTER);
		sortiranje.add(raddioButtons);

		sortiraniPanel.add(tablePan, BorderLayout.CENTER);
		return sortiranje;
	}

	private JTable initTable() {
		JTable tablePan = new JTable(new MyTableModel());
		tablePan.setSize(1000, 1000);

		// Pozeljna velicina pogleda tabele u okviru scrollpane-a. Layout
		// manager uzima ovu osobinu u obzir.
		tablePan.setPreferredScrollableViewportSize(new Dimension(1000, 500));

		// Sirenje tabele kompletno po visini pogleda scrollpane-a.
		tablePan.setFillsViewportHeight(true);
		tablePan.setRowHeight(40);

		return tablePan;

	}

	private JTable initPretragaTable() {
		JTable tablePanPret = new JTable(new MyTableModelPretraga());
		tablePanPret.setSize(1000, 1000);

		tablePanPret.setPreferredScrollableViewportSize(new Dimension(1000, 500));
		tablePanPret.setFillsViewportHeight(true);
		tablePanPret.setRowHeight(40);
		return tablePanPret;
	}

	private JPanel pretragaPanel(JPanel receptiPanel, JPanel tablePanPret, JTable tabelaRecepti) {
		JPanel pretraga = new JPanel();
		pretraga.setVisible(false);
		pretraga.setLayout(new BorderLayout());
		pretraga.setBackground(new Color(230, 255, 251));
//

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
		radBtn1.setActionCommand("Sifri");
		radBtn1.setFont(new Font("Arial", 0, 23));
		radBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TableRowSorter<MyTableModelPretraga> sorter = new TableRowSorter<MyTableModelPretraga>(
						new MyTableModelPretraga());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePanPret.setVisible(true);

			}
		});
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Lekaru");
//		radBtn2.setActionCommand("Lekaru");
		radBtn2.setFont(new Font("Arial", 0, 23));
		radBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TableRowSorter<MyTableModelPretraga> sorter = new TableRowSorter<MyTableModelPretraga>(
						new MyTableModelPretraga());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePanPret.setVisible(true);
			}
		});
		radBtn2.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn3 = new JRadioButton("JMBG");
		radBtn3.setFont(new Font("Arial", 0, 23));
		radBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TableRowSorter<MyTableModelPretraga> sorter = new TableRowSorter<MyTableModelPretraga>(
						new MyTableModelPretraga());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePanPret.setVisible(true);
			}
		});
		radBtn3.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn4 = new JRadioButton("Leku");
		radBtn4.setFont(new Font("Arial", 0, 23));
		radBtn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TableRowSorter<MyTableModelPretraga> sorter = new TableRowSorter<MyTableModelPretraga>(
						new MyTableModelPretraga());
				tabelaRecepti.setRowSorter(sorter);

				List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
				sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);

				tablePanPret.setVisible(true);

			}
		});
		radBtn4.setBackground(new Color(230, 255, 251));

		ButtonGroup pretragaPo = new ButtonGroup();

		pretragaPo.add(radBtn1);
		pretragaPo.add(radBtn2);
		pretragaPo.add(radBtn3);
		pretragaPo.add(radBtn4);

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
		if (radBtn4.isSelected()) {
			radioText = radBtn4.getText();
		}

		raddioButtons.add(radBtn1);
		raddioButtons.add(radBtn2);
		raddioButtons.add(radBtn3);
		raddioButtons.add(radBtn4);

		pretraga.add(pretragaPanel, BorderLayout.WEST);
//		pretraga.add(raddioButtons, BorderLayout.CENTER);
		pretraga.add(raddioButtons);

		JPanel searchPan = new JPanel();
		searchPan.setVisible(true);
		searchPan.setBackground(new Color(230, 255, 251));
		// searchPan.setPreferredSize(new Dimension(20, 180));
		JTextField searchTxt = new JTextField(30);
		searchTxt.setFont(new Font("Ariel", 0, 20));
		searchPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		searchPan.add(searchTxt);

		pretraga.add(searchPan, BorderLayout.SOUTH);
		pretragaPanel.add(tablePanPret, BorderLayout.CENTER);

		return pretraga;

	}

	private JPanel kreirajPanel(JPanel receptiPanel, JPanel formPanel) {

		JPanel paramPan = new JPanel();
		paramPan.setVisible(false);
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
		return paramPan;

	}

	private void prikaziIzvestaj(JPanel panCenter) {
		panCenter.setBackground(new Color(230, 255, 251));
		panCenter.setVisible(false);
		
		JPanel ukLekProizTablePan = new JPanel();
		ukLekProizTablePan.setBackground(new Color(230, 255, 251));
		

		JPanel izvestajPanel = new JPanel();
		BoxLayout menuPanelGlue = new BoxLayout(izvestajPanel, BoxLayout.Y_AXIS);
		izvestajPanel.setLayout(menuPanelGlue);
		izvestajPanel.setBackground(new Color(230, 255, 251));
		izvestajPanel.setPreferredSize(new Dimension(20, 180));
		izvestajPanel.add(Box.createGlue());

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
		
		// table
//		JPanel tableIzvProizPan = new JPanel();
//		JTable tabelaIzvestajProizvodnje= initTableIzvestajProiz();

//		JScrollPane tableScroll = new JScrollPane(tabelaIzvestajProizvodnje);
//
//		tableIzvProizPan.setVisible(false);

		//////////////////
		
		JPanel ukuProdLek = new JPanel();
		// recepti.setPreferredSize(null);
		ukuProdLek.setBackground(new Color(230, 255, 251));
//		recepti.setLayout(new FlowLayout(FlowLayout.CENTER));
		GridLayout receptiLayout = new GridLayout(1, 3);
		receptiLayout.setHgap(20);
		ukuProdLek.setLayout(receptiLayout);
		
//		JPanel ukupnoLekova = ukLekPanel();
//		ukupnoLekova.setVisible(false);
		
//		JPanel ukupnoLekovaProiz = ukLekProizPanel(ukLekProizTablePan);
//		ukupnoLekovaProiz.setVisible(false);
		
//		JPanel ukupnoLekovaApotekara = ukLekApotPanel();
//		ukupnoLekovaApotekara.setVisible(false);

		JButton btn6 = new JButton();
		btn6.setText("<html> <center> Ukupna prodaja <br> svih lekova </center> </html> \n");
		btn6.setFont(new Font("Arial", 0, 20));
		btn6.setBackground(new Color(230, 255, 251));
		ukuProdLek.add(btn6);

		JButton btn7 = new JButton();
		btn7.setText("<html> <center> Ukupna prodaja svih <br> lekova odabranog proizvodjaca </center> </html> \n");
		btn7.setFont(new Font("Arial", 0, 20));
		btn7.setBackground(new Color(230, 255, 251));
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				ukupnoLekova.setVisible(false);
//				ukupnoLekovaProiz.setVisible(true);
//				ukupnoLekovaApotekara.setVisible(false);
			}
		});
		ukuProdLek.add(btn7);

		JButton btn8 = new JButton();
		btn8.setText(
				"<html> <center> Ukupna prodaja svih lekova koje <br> je odabrani apotekar prodao </center> </html> \n");
		btn8.setFont(new Font("Arial", 0, 20));
		btn8.setBackground(new Color(230, 255, 251));
		ukuProdLek.add(btn8);

		izvestajPanel.add(naslov, BorderLayout.NORTH);
		izvestajPanel.add(ukuProdLek, BorderLayout.CENTER);

		JPanel tableSearchPan = new JPanel();
		tableSearchPan.setBackground(new Color(230, 255, 251));

		panCenter.add(izvestajPanel, BorderLayout.NORTH);
		panCenter.add(tableSearchPan, BorderLayout.CENTER);

		tableSearchPan.setLayout(new BorderLayout());

		JPanel searchPan = new JPanel();
		searchPan.setBackground(new Color(230, 255, 251));
	}
	
//	private JTable initTableIzvestajProiz() {
//		JTable tablePan = new JTable(new MyTableModelIzvestajProizvodjaca);
//		tablePan.setSize(1000, 1000);
//
//		// Pozeljna velicina pogleda tabele u okviru scrollpane-a. Layout
//		// manager uzima ovu osobinu u obzir.
//		tablePan.setPreferredScrollableViewportSize(new Dimension(1000, 500));
//
//		// Sirenje tabele kompletno po visini pogleda scrollpane-a.
//		tablePan.setFillsViewportHeight(true);
//		tablePan.setRowHeight(40);
//
//		return tablePan;
//
//	}

//	private JPanel ukLekProizPanel(JPanel ukLekProizTablePan)
//	{
//		JPanel searchPan = new JPanel();
//		searchPan.setBackground(new Color(230, 255, 251));
//		JLabel searchProiz = new JLabel("Proizvodjac :");
//		searchProiz.setFont(new Font("Ariel", 0, 20));
//		searchPan.add(searchProiz);
//		// searchPan.setPreferredSize(new Dimension(20, 180));
//		JTextField searchTxt = new JTextField(30);
//		searchTxt.setFont(new Font("Ariel", 0, 20));
//		searchPan.setLayout(new FlowLayout(FlowLayout.LEFT));
//		searchPan.add(searchTxt);
//		
//		JTable tableIzvestaj;
//		tableIzvestaj = new JTable(new MyTableModelIzvestajProizvodjaca()); {
//
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			public Class getColumnClass(int column) {
//				switch (column) {
//				case 0:
//					return String.class;
//				case 1:
//					return String.class;
//				case 2:
//					return String.class;
//				case 3:
//					return Boolean.class;
//				case 4:
//					return String.class;
//				case 5:
//					return String.class;
//				default:
//					return String.class;
//				}
//			}
//		};
//
//		table.setRowHeight(40);
//		table.setFont(new Font("Verdana", Font.PLAIN, 17));
//
//		JScrollPane scroll = new JScrollPane(table);
//		scroll.setPreferredSize(new Dimension(1100, 450));
//	}
}
