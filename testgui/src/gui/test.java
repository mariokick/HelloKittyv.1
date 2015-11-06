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

	// ���¡�� GUI
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
		setTitle("564259135 ��»���ѵ�� �����ǧ 56/36"); // title
		getContentPane().setLayout(null);

		// Menu Bar
		JMenuBar menuBar = new JMenuBar();

		// Menu 1
		JMenu menu1 = new JMenu("Sort");
		JMenuItem menu1_1 = new JMenuItem("Insertion sort"); // ���� ��ǹ sort
		menu1_1.setMnemonic(KeyEvent.VK_E);
		menu1_1.setToolTipText("Open"); // title �ͧ textbox
		menu1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Insertion sort");

				// ��ͤ����textbox

				System.out.println("Insertion");
				sort1.populateArray(A); // �ù������
				System.out.println("��͹ sort");
				sort1.printArray(A); // ����
				sort1.insertionSort(A); // ��кǹ��� sort
				System.out.println("��ѧ sort");
				sort1.printArray(A);

			}
		});
		JMenuItem menu1_2 = new JMenuItem("Quick sort");

		menu1_2.setMnemonic(KeyEvent.VK_Q);
		menu1_2.setToolTipText("Open"); // title �ͧ textbox
		menu1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Quicka sort");
				// ��ͤ����textbox
				System.out.println("Quicka");
				sort2.populateArray(A);
				System.out.println("��͹ sort");
				sort2.printArray(A);
				int low = 0;
				int high = A.length - 1;
				sort2.quickSort(A, low, high);
				System.out.println("��ѧ sort");
				sort2.printArray(A);
				JOptionPane.showMessageDialog(null, "Quicka sort1");
			}
		});

		menu1.add(menu1_1);
		menu1.add(menu1_2);
		menuBar.add(menu1);

		// Menu 2
		JMenu menu2 = new JMenu("Search");
		JMenuItem menu2_1 = new JMenuItem("Search 1"); // ���� ��ǹ Search
		JMenuItem menu2_2 = new JMenuItem("Search 2");
		menu2.add(menu2_1);
		menu2.add(menu2_2);
		menuBar.add(menu2);

		setJMenuBar(menuBar);

		// text
	
	}
}