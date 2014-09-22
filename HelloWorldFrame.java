//This is the main file
/**
 * 
 */
package helloworld;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

/**
 * @author eriha 
 * 
 * Test
 *
 */
public class HelloWorldFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JMenuBar jJMenuBar = null;

	private JMenu jMenu = null;

	private JMenuItem jMenuItem = null;

	private JButton jButton = null;

	private JLabel jLabel = null;

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("File");
			jMenu.add(getJMenuItem());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("Exit");
			jMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					System.exit(0);
				}
			});
		}
		return jMenuItem;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Push me");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				jLabel.setForeground(new Color(0,0,255));//RGB
				}
			});
		}
		return jButton;
	}

	/**
	 * @param args
	 */
	//This is the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HelloWorldFrame thisClass = new HelloWorldFrame();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public HelloWorldFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("HelloWorldFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.insets = new Insets(6, 100, 22, 100);
			gridBagConstraints2.gridy = 1;
			gridBagConstraints2.ipadx = 7;
			gridBagConstraints2.ipady = 18;
			gridBagConstraints2.gridx = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.insets = new Insets(57, 98, 6, 94);
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.ipadx = 16;
			gridBagConstraints1.ipady = 1;
			gridBagConstraints1.gridx = 0;
			jLabel = new JLabel();
			jLabel.setFont(new Font("Arial", Font.BOLD, 14));
			jLabel.setText("Hello World!");
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getJButton(), gridBagConstraints1);
			jContentPane.add(jLabel, gridBagConstraints2);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="118,54"
