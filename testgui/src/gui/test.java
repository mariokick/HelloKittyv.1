package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class test extends JFrame {
	public int number = 1;
	public Insertion sort1 = new Insertion();
	public Quickaa sort2 = new Quickaa();
	public int A[] = new int[100];

	// เรียกใช้ GUI
	public static void main(String[] args) {
		test frameTabel = new test();
		frameTabel.setVisible(true);
	}

	// Insertion

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 249);
		setTitle("564259135 นายปิยวัตร์ พุ่มพวง 56/36"); // title
		getContentPane().setLayout(null);

		// Menu Bar
		JMenuBar menuBar = new JMenuBar();

		// Menu 1
		JMenu menu1 = new JMenu("Sort");
		JMenuItem menu1_1 = new JMenuItem("Insertion sort"); // ชื่อ ส่วน sort
		menu1_1.setMnemonic(KeyEvent.VK_E);
		menu1_1.setToolTipText("Open"); // title ของ textbox
		menu1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Insertion sort");

				// ข้อความในtextbox

				System.out.println("Insertion");
				sort1.populateArray(A); // แรนดอมค่า
				System.out.println("ก่อน sort");
				sort1.printArray(A); // ปริ้น
				sort1.insertionSort(A); // กระบวนการ sort
				System.out.println("หลัง sort");
				sort1.printArray(A);

			}
		});
		JMenuItem menu1_2 = new JMenuItem("Quick sort");

		menu1_2.setMnemonic(KeyEvent.VK_Q);
		menu1_2.setToolTipText("Open"); // title ของ textbox
		menu1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Quicka sort");
				// ข้อความในtextbox
				System.out.println("Quicka");
				sort2.populateArray(A);
				System.out.println("ก่อน sort");
				sort2.printArray(A);
				int low = 0;
				int high = A.length - 1;
				sort2.quickSort(A, low, high);
				System.out.println("หลัง sort");
				sort2.printArray(A);
				JOptionPane.showMessageDialog(null, "Quicka sort1");
			}
		});

		menu1.add(menu1_1);
		menu1.add(menu1_2);
		menuBar.add(menu1);

		// Menu 2
		JMenu menu2 = new JMenu("Search");
		JMenuItem menu2_1 = new JMenuItem("Search 1"); // ชื่อ ส่วน Search
		JMenuItem menu2_2 = new JMenuItem("Search 2");
		menu2.add(menu2_1);
		menu2.add(menu2_2);
		menuBar.add(menu2);

		setJMenuBar(menuBar);

		// text
	
	}
}