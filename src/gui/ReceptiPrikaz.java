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
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumnModel;

public class ReceptiPrikaz extends JFrame {
	public ReceptiPrikaz() {
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
		//recepti.setPreferredSize(null);
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

		JPanel sortiranje = new JPanel();
		sortiranje.setLayout(new BorderLayout());
		sortiranje.setBackground(new Color(230, 255, 251));
		
		JPanel sortirajPanel = new JPanel();
		JLabel lblSort = new JLabel("Sortiraj po :");
		//sortirajPanel.setPreferredSize(null);
		sortirajPanel.setBackground(new Color(230, 255, 251));
		lblSort.setFont(new Font("Ariel", 0, 25));
		sortirajPanel.add(lblSort);

		JPanel raddioButtons = new JPanel();
		GridLayout raddioLayout = new GridLayout(1, 3);
		raddioLayout.setHgap(2);
		raddioButtons.setBackground(new Color(230, 255, 251));
		raddioButtons.setLayout(raddioLayout);
		
		JRadioButton radBtn1 = new JRadioButton("Sifri");
		radBtn1.setActionCommand("Sifri");
		radBtn1.setFont(new Font("Arial", 0, 23));
		radBtn1.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn2 = new JRadioButton("Lekaru");
		radBtn2.setFont(new Font("Arial", 0, 23));
		radBtn2.setBackground(new Color(230, 255, 251));

		JRadioButton radBtn3 = new JRadioButton("Datumu");
		radBtn3.setFont(new Font("Arial", 0, 23));
		radBtn3.setBackground(new Color(230, 255, 251));

		ButtonGroup sortirajPo = new ButtonGroup( );

		sortirajPo.add(radBtn1);
		sortirajPo.add(radBtn2);
		sortirajPo.add(radBtn3);
		
		String radioText = "";
			
		if (radBtn1.isSelected()) {radioText = radBtn1.getText(); }
		if (radBtn2.isSelected()) {radioText = radBtn2.getText(); }
		if (radBtn3.isSelected()) {radioText = radBtn3.getText(); }
		
		raddioButtons.add(radBtn1);
		raddioButtons.add(radBtn2);
		raddioButtons.add(radBtn3);

		sortiranje.add(sortirajPanel, BorderLayout.WEST);
//		sortiranje.add(raddioButtons, BorderLayout.CENTER);
		sortiranje.add(raddioButtons);
		
//		menuPan.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuPan.add(naslov, BorderLayout.NORTH);
		menuPan.add(recepti, BorderLayout.CENTER);
		menuPan.add(sortiranje, BorderLayout.SOUTH);

//		panCenter.add(menuPan);

		JPanel tablePan = new JPanel();
		tablePan.setBackground(new Color(230, 255, 251));

		
		
		
		

		// add(panCenter);
//		if(radBtn1.isSelected() || radBtn2.isSelected() || radBtn3.isSelected())
//			showTablePanel(tablePan, "");
		
		class SortirajAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(sortirajPo.getSelection().getActionCommand());
				String sortiraj = sortirajPo.getSelection().getActionCommand();
				System.out.println("action " + sortiraj);
				if (sortiraj.equals("Sifri")) {
//					System.out.println("action sifri " + sortiraj);
//					showTablePanel(tablePan, sortiraj);
				}
			}
			
		}
		ActionListener sortirajAction = new SortirajAction();
		radBtn1.addActionListener(sortirajAction);
		
		panCenter.add(menuPan, BorderLayout.NORTH);
		panCenter.add(tablePan, BorderLayout.CENTER);
	}
	

	/**
	 * main window table
	 */

//	private void showTablePanel(JPanel tablePan, String sortiraj) {
//		String column[] = { "Sifra", "Lekar", "Datum i vreme" };
//		String data[][] = { { "1021145", "Petar Arsic", "06.03.2020.  14:49" },
//				{ "1325153", "Tijana Matic", "24.05.2020.  07:51" },
//				{ "1749372", "Sara Simovic", "22.07.2019.  15:27" },
//				{ "2149375", "Marija Jovanovic", "08.06.2020.  11:31" },
//				{ "2619384", "Pavle Vojvodic", "18.08.2019.  12:20" },
//				{ "2857193", "Marina Vukotic", "28.04.2020.  18:06" },
//				{ "3026210", "Sara Nedovic", "24.08.2019.  16:12" }, 
//				{ "3321875", "Petar Arsic", "13.02.2020.  13:36" },
//				{ "3325483", "Vasilije Ilic", "15.05.2020.  11:08" },
//				{ "5193728", "Aleksandar Maric", "14.09.2019.  17:19" },
//				{ "5418673", "Igor Janjic", "30.10.2019.  19:25" },
//				{ "5974216", "Aleksandar Petrovic", "31.03.2020.  20:43" },
//				{ "6538147", "Milan Adamovic", "24.11.2019.  09:16" },
//				{ "6724933", "Pavle Savic", "07.02.2020.  10:52" },
//				{ "6967825", "Helena Velickovic", "01.04.2020.  23:30" },
//				{ "8468571", "Marija Jovanovic", "27.01.2020.  23:55" } };
//		
//		System.out.println("Sortiraj " + sortiraj);
//		JTable table = new JTable(data, column);
////		if(!sortiraj.isEmpty()) {
////			System.out.println("Sortiraj empty " + sortiraj);
//			
//			table.setRowHeight(40);	
//			table.setFont(new Font("Verdana", Font.PLAIN, 17));
////			table.setAutoCreateRowSorter(true);
//			JScrollPane scroll = new JScrollPane(table);
//		    scroll.setPreferredSize(new Dimension(1100, 500));
//	    
//			TableColumnModel columnModel = table.getColumnModel();
//			columnModel.getColumn(0).setPreferredWidth(100);
//			columnModel.getColumn(1).setPreferredWidth(600);
//			columnModel.getColumn(2).setPreferredWidth(150);
//			
//			tablePan.add(scroll);
////		}
////		tablePan.add(table, BorderLayout.SOUTH);
//	}
	

}
