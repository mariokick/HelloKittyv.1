package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

//time
import java.util.GregorianCalendar;

public class test extends JFrame {
	// การsort
	public Insertion sort1 = new Insertion();
	public Quickaa sort2 = new Quickaa();

	public Setarray setarray = new Setarray();

	public int size;
	public int A[] = new int[size]; // array
	double sum = 0.0; // เวลา

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

		JMenu menu0 = new JMenu("Set Array");
		JMenuItem menu0_1 = new JMenuItem("Input Array Size"); // ชื่อ ส่วน sort
		menu0_1.setMnemonic(KeyEvent.VK_E);
		menu0_1.setToolTipText("Open"); // title ของ textbox
		menu0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null,
						"Please input value size array");

				// Text Field
				final JTextField txt = new JTextField(); // ช่องใส่
				txt.setBounds(103, 41, 144, 20);
				getContentPane().add(txt);
				txt.setColumns(10);
				//sumarray
				final JTextField sumarray = new JTextField(); // ช่องใส่
				sumarray.setBounds(103, 150, 144, 20);
				getContentPane().add(sumarray);
				sumarray.setColumns(10);
				// Label
				final JLabel lbl = new JLabel("Result");
				lbl.setBounds(103, 120, 144, 14);
				getContentPane().add(lbl);

		
				// Button กดเพิ่มแรนดอม
				JButton btn1 = new JButton("OK");
				btn1.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
						final JTextField sumarray = new JTextField(); // ช่องใส่
						sumarray.setBounds(103, 150, 144, 20);
						getContentPane().add(sumarray);
						sumarray.setColumns(10);
						
						size = Integer.parseInt(txt.getText());
						setarray.setarraysize(size);
						A = new int[size]; // array
						sort1.populateArray(A);
						lbl.setText("Set array size : " + size);
						
						sumarray.setText("Array : " + Arrays.toString(A));
					}
				});

				btn1.setBounds(128, 72, 99, 23);
				getContentPane().add(btn1);
				// ข้อความในtextbox

			}
		});

		menu0.add(menu0_1);

		menuBar.add(menu0);

		// Menu 1
		JMenu menu1 = new JMenu("Sort");
		JMenuItem menu1_1 = new JMenuItem("Insertion sort"); // ชื่อ ส่วน sort
		menu1_1.setMnemonic(KeyEvent.VK_E);
		menu1_1.setToolTipText("Open"); // title ของ textbox
		menu1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				int[] arrayaftersort = A;
				double start = System.nanoTime();

				sort1.insertionSort(arrayaftersort); // กระบวนการ sort

				double end = System.nanoTime();
				sum = end - start;

				JOptionPane.showMessageDialog(
						null,
						"Insertion sort Size array = " + size
								+ "\n After sort : "
								+ Arrays.toString(arrayaftersort)
								+ "\nTime use : " + sum); // แสดงarrayก่อนsort
				// ข้อความในtextbox
				// แสดงlabel หลังsort
				final JLabel lbl2 = new JLabel("Array after sort :");
				lbl2.setBounds(103, 170, 144, 14);
				getContentPane().add(lbl2);
				lbl2.setText("After sort : " + Arrays.toString(arrayaftersort));
				start = 0;
				end = 0;
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 362, 249);

			}
		});
		JMenuItem menu1_2 = new JMenuItem("Quick sort");

		menu1_2.setMnemonic(KeyEvent.VK_Q);
		menu1_2.setToolTipText("Open"); // title ของ textbox
		menu1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int[] arrayaftersort = A;
				int low = 0;
				int high = arrayaftersort.length - 1;
				double start = System.nanoTime();
				sort2.quickSort(arrayaftersort, low, high);
				double end = System.nanoTime();
				sum = end - start;
				JOptionPane.showMessageDialog(null,
						"Quicka sort Size array = " + size + "\n After sort : "
								+ Arrays.toString(arrayaftersort)
								+ "\nTime use : " + sum);
				// ข้อความในtextbox
				// แสดงlabel หลังsort
				final JLabel lbl2 = new JLabel("Array after sort :");
				lbl2.setBounds(103, 160, 144, 14);
				getContentPane().add(lbl2);
				lbl2.setText("After sort : " + Arrays.toString(arrayaftersort));
				start = 0;
				end = 0;
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 362, 249);

			}
		});

		menu1.add(menu1_1);
		menu1.add(menu1_2);
		menuBar.add(menu1);

		// Menu 2
		JMenu menu2 = new JMenu("Search");
	
		JMenuItem menu2_1 = new JMenuItem("binarySearch "); // ชื่อ ส่วน Search
		menu2_1.setMnemonic(KeyEvent.VK_Q);
		menu2_1.setToolTipText("Open"); // title ของ textbox
		menu2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,"Please input value Search :");
		
		}
	});
		JMenuItem menu2_2 = new JMenuItem("Search 2");
		menu2.add(menu2_1);
		menu2.add(menu2_2);
		menuBar.add(menu2);

		setJMenuBar(menuBar);

		// text

	}
	
	
}
