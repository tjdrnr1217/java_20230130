package frame;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;

public class BookFrame extends JFrame{
	public BookFrame() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("0");
		menuBar.add(mnNewMenu);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("1");
		mnNewMenu.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_4 = new JCheckBoxMenuItem("2");
		mnNewMenu.add(chckbxmntmNewCheckItem_4);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_5 = new JCheckBoxMenuItem("3");
		mnNewMenu.add(chckbxmntmNewCheckItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("x");
		menuBar.add(mnNewMenu_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("4");
		mnNewMenu_1.add(chckbxmntmNewCheckItem_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("5");
		mnNewMenu_1.add(chckbxmntmNewCheckItem_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("6");
		mnNewMenu_1.add(chckbxmntmNewCheckItem_1);
		
		this.setSize(500,600);
		this.setVisible(true);
	}

}
