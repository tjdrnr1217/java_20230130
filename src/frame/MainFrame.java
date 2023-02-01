package frame;
//2023.02.01(4)
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {
	public MainFrame() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("학생용");
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("학생등록");
		menu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("정보수정");
		menu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("종료");
		menu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("교수용");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("교수등록");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("교수정보");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("종료");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		this.setSize(500,600);
		this.setVisible(true);
	}

}
