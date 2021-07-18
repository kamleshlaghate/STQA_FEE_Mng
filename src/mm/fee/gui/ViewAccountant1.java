package mm.fee.gui;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mm.fee.database.Accountant;
import mm.fee.database.AccountantDao;

public class ViewAccountant1 extends JFrame {
	static ViewAccountant1 frame;
	public ViewAccountant1() {
		//Code to view data in JTable
		List<Accountant> list=AccountantDao.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			
			data[row][0]=a.getName();
			data[row][1]=a.getPassword();
			data[row][2]=a.getEmail();
			data[row][3]=a.getContactno();
			row++;
		}
		String columnNames[]={"Name","Password","Email","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		setBounds(100, 100, 800, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAccountant1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
