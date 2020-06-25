package gui;

<<<<<<< HEAD
import javax.swing.SwingUtilities;

public class MyApp {

	public MyApp() {
		super();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			/*public void run() {
				KorisnikPrijava mf = new KorisnikPrijava();
				mf.setVisible(true);
			}*/
			
			public void run() {
				ReceptiPrikaz mainFrame = new ReceptiPrikaz();
				mainFrame.setVisible(true);
			}
		});

	}

=======

import javax.swing.SwingUtilities;


public class MyApp 
{
	
	public MyApp()
	{
		super();
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				KorisnikPrijava mf = new KorisnikPrijava();
				mf.setVisible(true);
			}
		});
		
	}
	
>>>>>>> branch 'master' of https://github.com/MartaDimitrijevic/OISISI-2020-TIM-14-Test1.git
}
