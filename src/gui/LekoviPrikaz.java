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

public class LekoviPrikaz extends JFrame {
	public LekoviPrikaz() {
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
				//naslov.setPreferredSize(null);
				naslov.setBackground(new Color(230, 255, 251));
				naslov.setLayout(new FlowLayout(FlowLayout.LEFT));
				
				JPanel labelaLekovi = new JPanel();
				JLabel lblTop = new JLabel("Lekovi");
				labelaLekovi.setBackground(new Color(230, 255, 251));
				lblTop.setFont(new Font("Ariel", 0, 55));
				labelaLekovi.add(lblTop);
			//    lblTop.setVerticalAlignment(SwingConstants.TOP);
				//lblTop.setHorizontalAlignment(SwingConstants.LEFT);
				
				//labelaLekovi.setLayout(new FlowLayout(FlowLayout.LEFT));
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
				//lekovi.setPreferredSize(null);
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
		
				
				JPanel sortirajPanel = new JPanel();
				sortirajPanel.setBackground(new Color(230, 255, 251));
				// panCenter.add(lblSort, BorderLayout.CENTER);
				
				
				JLabel lblSort = new JLabel("Sortiraj po :");
				lblSort.setFont(new Font("Ariel", 0, 25));
				sortirajPanel.add(lblSort);
				
				
				JRadioButton radBtn1 = new JRadioButton("Ime");
				radBtn1.setFont(new Font("Arial", 0, 23));
				radBtn1.setBackground(new Color(230, 255, 251));

				JRadioButton radBtn2 = new JRadioButton("Proizvodjac");
				radBtn2.setFont(new Font("Arial", 0, 23));
				radBtn2.setBackground(new Color(230, 255, 251));

				JRadioButton radBtn3 = new JRadioButton("Cena");
				radBtn3.setFont(new Font("Arial", 0, 23));
				radBtn3.setBackground(new Color(230, 255, 251));
				
				ButtonGroup bg1 = new ButtonGroup();
				
				bg1.add(radBtn1);
				bg1.add(radBtn2);
				bg1.add(radBtn3);
				
				String radioText = "";
				
				if (radBtn1.isSelected()) {radioText = radBtn1.getText();}
				if (radBtn2.isSelected()) {radioText = radBtn2.getText();}
				if (radBtn3.isSelected()) {radioText = radBtn3.getText();}

				sortirajPanel.add(radBtn1);
				sortirajPanel.add(radBtn2);
				sortirajPanel.add(radBtn3);

				sortirajPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
				

//				menuPan.setLayout(new FlowLayout(FlowLayout.LEFT));
				menuPan.add(naslov, BorderLayout.NORTH);
				menuPan.add(lekovi, BorderLayout.CENTER);
				menuPan.add(sortirajPanel, BorderLayout.SOUTH);

//				panCenter.add(menuPan);
				
				JPanel tablePan = new JPanel();
				tablePan.setBackground(new Color(230, 255, 251));
//				
//				tablePan.setLayout(new FlowLayout(FlowLayout.CENTER));
				panCenter.add(menuPan, BorderLayout.NORTH);
				panCenter.add(tablePan, BorderLayout.CENTER);

				// add(panCenter);
				showTablePanel(tablePan);
		}
			
			
			
			
			private void showTablePanel(JPanel tablePan){
				
				String column[] = { "Ime", "Sifra", "Proizvodjac", "Recept", "Cena" };
				String data[][] = { { "Andol", "BR3348G", "Pliva a.d.", " ", "220 RSD" },
						{ "Brufen", "M01AE01", "HEMOFARM A.D.", " ", "172 RSD" },
						{ "Kafetin", "N02BE51", "ALKALOD A.D."," ", "205 RSD" },
						{ "Omeprazol", "A02BC01", "Zdravlje a.d.", " ", "350 RSD" },
						{ "Presing", "E06AX", "HEMOFARM A.D.", " ", "275 RSD" },
						{ "Alfacet", "D07AC13", "GALENIKA A.D.", "", "863 RDS" },
						{ "Glikosan", "R06AX27", "Slaviamed a.d.", "", "220 RSD" }, 
						{ "Riftan", "A07AA09", "HEMOFARM A.D.", "", "720 RSD" },
						{ "Tefor", "N06AX16", "GALENIKA A.D.","","98 RSD" },
						{ "Edicin", "J01XA01", "Lek a.d.", "","1,400 RSD" },
						{ "Amoksicilin", "J01CA04 ", "FARMALOGIST D.O.O.","", "145 RSD" },
						{ "Nexium", "A02BC05", "AastraZeneca d.o.o.","","500 RSD" },
						{ "Vesicare", "G04BD08", "Astellas d.o.o.","","1,545 RSD" },
						{ "Triplixam", "C09B0X1", "Servior Ireland", "", "1,017 RSD" },
						{ "Serlift", "NO6AB06", "Medico Uno", "", "354 RSD" },
						{ "Itanem", "J01DHO2", "GALENIKA A.D.","","6,552 RSD" },
						{ "Logest", "G03AA10", "BAYER D.O.O.","","478 RSD" } ,
						{ "Aluvia", "J05AR10", "ABBVIE.KG.","","9,606 RSD" } ,
						{ "Galitifen", "RO6AC17", "GALENIKA A.D.","","199 RSD" } ,
						{ "Opitiray", "V08ABO7", "MEDICOM D.O.O.","","17,078 RSD" } 
				};
				
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
				columnModel.getColumn(2).setPreferredWidth(350);
				columnModel.getColumn(3).setPreferredWidth(200);
				columnModel.getColumn(4).setPreferredWidth(200);
				
				tablePan.add(scroll);
//				tablePan.add(table, BorderLayout.SOUTH);
				
			}
			
			
			
			
		}
