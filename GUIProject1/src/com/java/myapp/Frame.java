package com.java.myapp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JTextArea;

public class Frame {
	public Insertion sort1 = new Insertion();
	public Quickaa sort2 = new Quickaa();
	public int x = 0;

	public BinarySearch Search1 = new BinarySearch();
	public Select Search2 = new Select();
	public Setarray setarray = new Setarray();
	public int size;
	public int A[] = new int[size]; // array
	double sum = 0.0;
	public int keysearch;
	private JFrame frmSortAndSearch;
	private JTextField TextInputSizearray;
	private JLabel lblNewLabel;
	private JButton btnInsertionsort;
	private JButton btnQuicksort;
	private JLabel lblNewLabel_1;
	private JMenuBar menuBar;
	private JLabel lblNewLabel_2;
	private JTextField Inputkeysearch;
	private JButton btnBinarySearch;
	private JLabel lblSearch;
	private JButton btnQuick_Select;
	private JTextField ShowPosition;
	private JLabel lblNewLabel_3;
	private JMenuBar menuBar_1;
	private JTextArea txtShowArray;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					
					window.frmSortAndSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ‡Menubar

		frmSortAndSearch = new JFrame();
		frmSortAndSearch.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Smile computer\\Desktop\\FKWT-45.png"));
		frmSortAndSearch.setTitle("Sort and Search");
		frmSortAndSearch.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frmSortAndSearch.getContentPane().setBackground(new Color(0, 255, 153));
		frmSortAndSearch.setBackground(new Color(70, 130, 180));
		frmSortAndSearch.getContentPane().setForeground(Color.MAGENTA);
		frmSortAndSearch.setBounds(100, 100, 450, 400);
		frmSortAndSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSortAndSearch.getContentPane().setLayout(null);
		// ‡Menubar
		JMenuBar menuBar = new JMenuBar();
		frmSortAndSearch.setJMenuBar(menuBar);

		// Menu 1
		JMenu menu1 = new JMenu("File"); // ‡¡πŸ™◊ËÕ File
		JMenuItem close = new JMenuItem("Exit");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				System.exit(0);
			}
		});
		menu1.add(close); // manu1 „ÀÈ‡æ‘Ë¡ close ‡¢È“‰ª„π‡¡πŸ ∑’Ë°”Àπ¥‰«È
		menuBar.add(menu1); // °“√‡æ‘Ë¡‡¡πŸ„ÀÈÕ¬ŸË„π From

		JLabel lblArray = new JLabel("Input Size");
		lblArray.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArray.setBounds(104, 11, 74, 29);
		frmSortAndSearch.getContentPane().add(lblArray);

		TextInputSizearray = new JTextField();
		TextInputSizearray.setBounds(187, 15, 86, 20);
		frmSortAndSearch.getContentPane().add(TextInputSizearray);
		TextInputSizearray.setColumns(10);

		JButton btnRandomArray = new JButton("Set Size");
		btnRandomArray.setBackground(Color.WHITE);
		btnRandomArray.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRandomArray.setToolTipText("Make array by random");
		btnRandomArray.setBounds(187, 46, 86, 23);
		frmSortAndSearch.getContentPane().add(btnRandomArray);

		lblNewLabel = new JLabel("Array :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 134, 46, 40);
		frmSortAndSearch.getContentPane().add(lblNewLabel);

		btnInsertionsort = new JButton("Insertion Sort");
		btnInsertionsort.setBackground(Color.WHITE);
		btnInsertionsort
				.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnInsertionsort.setToolTipText("Insertion sort");
		btnInsertionsort.setBounds(104, 100, 114, 23);
		frmSortAndSearch.getContentPane().add(btnInsertionsort);

		btnQuicksort = new JButton("Quick Sort");
		btnQuicksort.setBackground(Color.WHITE);
		btnQuicksort.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnQuicksort.setToolTipText("Quick sort");
		btnQuicksort.setBounds(228, 100, 127, 23);
		frmSortAndSearch.getContentPane().add(btnQuicksort);

		lblNewLabel_1 = new JLabel("Sort");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(214, 69, 59, 20);
		frmSortAndSearch.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Input value");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(104, 240, 74, 29);
		frmSortAndSearch.getContentPane().add(lblNewLabel_2);

		Inputkeysearch = new JTextField();
		Inputkeysearch.setToolTipText("key use Search ");
		Inputkeysearch.setBounds(187, 244, 86, 20);
		frmSortAndSearch.getContentPane().add(Inputkeysearch);
		Inputkeysearch.setColumns(10);

		btnBinarySearch = new JButton("BinarySearch");
		btnBinarySearch
				.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnBinarySearch.setBackground(Color.WHITE);
		btnBinarySearch.setToolTipText("BinarySearch");
		btnBinarySearch.setBounds(104, 275, 114, 23);
		frmSortAndSearch.getContentPane().add(btnBinarySearch);

		lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSearch.setBounds(214, 213, 59, 20);
		frmSortAndSearch.getContentPane().add(lblSearch);

		btnQuick_Select = new JButton("Select");
		btnQuick_Select
				.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnQuick_Select.setBackground(Color.WHITE);
		btnQuick_Select.setToolTipText("Select Check have");
		btnQuick_Select.setBounds(228, 275, 127, 23);
		frmSortAndSearch.getContentPane().add(btnQuick_Select);

		ShowPosition = new JTextField();
		ShowPosition.setToolTipText("Find True-false");
		ShowPosition.setBounds(187, 309, 86, 20);
		frmSortAndSearch.getContentPane().add(ShowPosition);
		ShowPosition.setColumns(10);

		lblNewLabel_3 = new JLabel("Find");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(104, 305, 59, 29);
		frmSortAndSearch.getContentPane().add(lblNewLabel_3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 134, 260, 69);
		frmSortAndSearch.getContentPane().add(scrollPane);
		
		txtShowArray = new JTextArea();
		scrollPane.setViewportView(txtShowArray);
		txtShowArray.setLineWrap(true);
		txtShowArray.setRows(15);
		txtShowArray.setColumns(15);

		// ‡¡◊ËÕ„ Ë¢π“¥ ·≈È« ·√π¥Õ¡§Ë“
		btnRandomArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				size = Integer.parseInt(TextInputSizearray.getText());
				setarray.setarraysize(size);
				A = new int[size]; // array
				sort1.populateArray(A);
				System.out.println(Arrays.toString(A));
				txtShowArray.setText("Array : " + Arrays.toString(A));

				// ‡™Á§ «Ë“¬—ß‰¡Ë∂Ÿ°sort
				x=1;
			}
		});
		// btnInsertion
		btnInsertionsort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double start1 = System.nanoTime();

				sort1.insertionSort(A); // °√–∫«π°“√ sort

				double end1 = System.nanoTime();

				double nanouse = end1 - start1;
				double timeuse = (nanouse * (Math.pow(10, -9)));

				JOptionPane.showMessageDialog(null,
						"Insertion sort Size array = " + size
								+ "\n After sort : " + Arrays.toString(A)
								+ "\n" + "time use Start = : " + start1 + "\n"
								+ "time use end = : " + end1 + "\n"
								+ "use time = : " + timeuse + " Second");
				// ¢ÈÕ§«“¡„πtextbox
				// · ¥ßlabel À≈—ßsort

				timeuse = 0;
				start1 = 0;
				end1 = 0;
				nanouse = 0;
				x=0;
				txtShowArray.setText("Array : " + Arrays.toString(A));
				System.out.println(Arrays.toString(A));
			}
		});

		// btnQuick
		btnQuicksort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double start = System.nanoTime();
			
				int low = 0;
				int high = A.length - 1;

				sort2.quickSort(A, low, high);

				double end = System.nanoTime();
				double nanouse = end - start;
				double timeuse = nanouse * (Math.pow(10, -9));
				txtShowArray.setText("Array : " + Arrays.toString(A));
				JOptionPane.showMessageDialog(null,
						"Quicka sort Size array = " + size + "\n After sort : "
								+ Arrays.toString(A) + "\n"
								+ "time use Start = : " + start + "\n"
								+ "time use end = : " + end + "\n"
								+ "use time = : " + timeuse + " Second");

				// ¢ÈÕ§«“¡„πtextbox
				// · ¥ßlabel À≈—ßsort

				timeuse = 0;
				start = 0;
				end = 0;
				nanouse = 0;
x=0;
				System.out.println(Arrays.toString(A));
			}
		});

		btnQuick_Select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				keysearch = Integer.parseInt(Inputkeysearch.getText());

				double start = System.nanoTime();
				int A1[] = A;
				// System.out.print(Search1.Selection_Select1(A,keysearch));
				// System.out.print(Search2.QuickSelect1(A, keysearch));
				boolean position = Search2.Select1(A1, keysearch);
				double end = System.nanoTime();
				ShowPosition.setText(Boolean.toString(position));

				double nanouse = end - start;
				double timeuse = nanouse * (Math.pow(10, -9));
			
				JOptionPane.showMessageDialog(null, "key search = : "
						+ keysearch + "\n" + "Search = : " + position + "\n"
						+ "time use Start = : " + start + "\n"
						+ "time use end = : " + end + "\n" + "Time use = : "
						+ timeuse + " Second");
				timeuse = 0;
				start = 0;
				end = 0;
				nanouse = 0;
				
			
			}
		});
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double start = 0;
				double end = 0;
				int position1 = 0;
				x=0;
				double nanouse = 0;
				double timeuse = 0;
				for (int i = 1; i < A.length; i++) {
					if (A[i-1] <= A[i]) {
					
						x =x+0;
						
						
					} 
					else {
						System.out.println("x = "+x);
						x = x+1;

					}
					System.out.println(A[0]+" "+A[i]+"x= "+x);
				}
				System.out.println("sum= "+x);
				if (x == 0) {
					keysearch = Integer.parseInt(Inputkeysearch.getText());
					start = System.nanoTime();
					position1 = Search1.BinarySearch(A, keysearch);
					end = System.nanoTime();

					nanouse = end - start;
					timeuse = nanouse * (Math.pow(10, -9));

					// ‡™Á§ æ∫‰¡Ëæ∫
					if (position1 == -1) {
						ShowPosition.setText("No find");
						JOptionPane.showMessageDialog(null, "key search = : "
								+ keysearch + "\n" + "Search = : " + "No find "
								+ "\n" + "time use Start = : " + start + "\n"
								+ "time use end = : " + end + "\n"
								+ "Time use = : " + timeuse + " Second");

					} else {

						ShowPosition.setText("Position = "
								+ Integer.toString(position1));
						JOptionPane.showMessageDialog(null, "key search = : "
								+ keysearch + "\n" + "Search = : " + position1
								+ "\n" + "time use Start = : " + start + "\n"
								+ "time use end = : " + end + "\n"
								+ "Time use = : " + timeuse + " Second");

					}
//¬—ß‰¡Ësort
				} else {

					JOptionPane.showMessageDialog(null, "After Sort!!!!");
				}

				timeuse = 0;
				start = 0;
				end = 0;
				nanouse = 0;
			position1 = 0;
			x=0;
			}
		});
	}
}
