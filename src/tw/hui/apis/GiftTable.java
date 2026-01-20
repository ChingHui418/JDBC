package tw.hui.apis;

import java.awt.DefaultFocusTraversalPolicy;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiftTable extends JTable{
	private GiftModel giftModel;
	private GiftDAO dao;
	
	public GiftTable() {
		
		try {
			dao = new GiftDAO();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		giftModel = new GiftModel();
		setModel(giftModel);
		giftModel.setColumnIdentifiers(dao.getFields());
		
	}
	
	public void delData() {
//		System.out.println(getSelectedRow());
		if(getSelectedRow() !=-1 ) {
			dao.delRow(getSelectedRow());
			repaint();
		}
	}
	
	private class GiftModel extends DefaultTableModel {

		@Override
		public int getRowCount() {
//			System.out.println(dao.getRows());
			return dao.getRows();
		}

		@Override
		public int getColumnCount() {
			return dao.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			// return String.format("Hui %d x %d", row, column);
			return dao.getData(row, column);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			// System.out.println(aValue + ":" + row + ":" + column);
			dao.updateDate((String)aValue, row, column);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return column !=0;
		}
		
		
	}
}
