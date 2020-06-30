package gui;

import javax.swing.event.TableModelListener;

public class MyTableModelIzvestajProizvodjaca {
	private Object[] columns = { "Ime", "Sifra", "Proizvodjac", "Recept", "Cena", "Kolicina", "Zarada" };
	private Object[][] data= { { "Andol", "BR3348G", "Pliva a.d.", false, "220 RSD", "17", "" },
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
			{ "Logest", "G03AA10", "BAYER D.O.O.", "", "478 RSD", false, "11", "" }};
	
	public int getRowCount() {
		return data.length;
	}

	public int getColumnCount() {
		return data[0].length;
	}

	public String getColumnName(int columnIndex) {
		return (String) columns[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return data[0][columnIndex].getClass();
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = aValue;
	}

	public void addTableModelListener(TableModelListener l) {

	}

	public void removeTableModelListener(TableModelListener l) {

	}
}
