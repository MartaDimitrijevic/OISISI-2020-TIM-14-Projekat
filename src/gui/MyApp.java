package gui;


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
	
}
