package AdminView;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminView {
	public static class AdminMain extends JFrame {
		private LoginPanel LP = new LoginPanel();
		private static Container c;
		JPanel panel = new JPanel();
		JButton customerManagement = new JButton("绊按包府");
		JButton productManagement = new JButton("惑前包府");
		public AdminMain() {
			super("包府磊 Login");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			c = getContentPane();
			c.setLayout(new BorderLayout());
			
			
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 80));
			panel.add(LP);
			c.add(panel, BorderLayout.CENTER);
			setSize(300,300);
			setLocationRelativeTo(null);
			setVisible(true);
		}

		public class LoginPanel extends JPanel {
			JButton customerManagement = new JButton("绊按包府");
			JButton productManagement = new JButton("惑前包府");
			public LoginPanel() {
				setLayout(new GridLayout(2,1,100,22));
				add(customerManagement);
				add(productManagement);
			}
		}	
	}
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton)e.getSource();
			
			if(btn.getText().equals("绊按包府")) {
				
			} else { // 惑前包府
				
			}
		}
	}
//	public class MyWinExit extends WindowAdapter {
//        public void windowClosing(WindowEvent we) {
//            System.exit(0); // 扩档 辆丰
//        }
//    }
//	public static class CustomerWindow extends JFrame {
//		private static Container c;
//		JPanel panel = new JPanel();
//		public CustomerWindow() {
//			super("绊按包府芒");
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			
//			c = getContentPane();
//			c.setLayout(new BorderLayout());
//			
//			
//			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 80));
//			panel.add(LP);
//			c.add(panel, BorderLayout.CENTER);
//			setSize(300,300);
//			setLocationRelativeTo(null);
//			setVisible(true);
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdminMain();
	}

}
