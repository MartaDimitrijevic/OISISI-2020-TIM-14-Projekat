package gui;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class MyTableModel implements TableModel {
	private Object[] columns = { "Sifra", "Lekar", "Datum i vreme" };
	private Object [][] data = { { "1021145", "Petar Arsic", "2020.03.06.  14:49" },
			{ "1325153", "Tijana Matic", "2020.05.24.  07:51" },
			{ "1749372", "Sara Simovic", "2019.07.22.  15:27" },
			{ "2149375", "Marija Jovanovic", "2020.06.08.  11:31" },
			{ "2619384", "Pavle Vojvodic", "2019.08.18.  12:20" },
			{ "2857193", "Marina Vukotic", "2020.04.28.  18:06" },
			{ "3026210", "Sara Nedovic", "2019.08.04.  16:12" }, 
			{ "3321875", "Petar Arsic", "2020.02.13.  13:36" },
			{ "3325483", "Vasilije Ilic", "2020.05.15.  11:08" },
			{ "5193728", "Aleksandar Maric", "2019.09.14.  17:19" },
			{ "5418673", "Igor Janjic", "2019.10.30. 19:25" },
			{ "5974216", "Aleksandar Petrovic", "2020.03.31.  20:43" },
			{ "6538147", "Milan Adamovic", "2019.11.24.  09:16" },
			{ "6724933", "Pavle Savic", "2020.02.07. 10:52" },
			{ "6967825", "Helena Velickovic", "2020.04.01.  23:30" },
			{ "8468571", "Marija Jovanovic", "2020.01.27.  23:55" } }; 
	
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
