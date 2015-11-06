package babu;

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

import javax.swing.table.DefaultTableModel;

//time
import java.util.GregorianCalendar;


public class  GUI  extends JFrame {
			public static void main(String[] args) {
				GUI frameTabel = new  GUI();
				frameTabel.setVisible(true);
			}
			public GUI  (){
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100,100,800,600);
				setTitle("564259110นางสาวจิราภรณ์ ใจมุ่ง 56/36");
				getContentPane().setLayout(null);
				//menubar
				JMenuBar menuBar = new JMenuBar();
				JMenu menu0 = new JMenu("Set Array");
				JMenuItem menu0_1 = new JMenuItem("Input Array Size"); // ชื่อ ส่วน sort
				//GUI 
				
				final JLabel lbl = new JLabel("Sort");
				lbl.setBounds(100,5,50, 50);
				getContentPane().add(lbl);
				
				final JTextField txt = new JTextField(); // ช่องใส่
				txt.setBounds(130, 41, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt);
				txt.setColumns(10);
				
				final JLabel lb2 = new JLabel("Inputarraysies");
				lb2.setBounds(40,41,144, 20);
				getContentPane().add(lb2);
				
				JButton btn1 = new JButton("OK");
				btn1.setBounds(150, 70, 100, 20);
				getContentPane().add(btn1);
				
				final JTextField txt1 = new JTextField(); // ช่องใส่
				txt1.setBounds(130, 121, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt1);
				txt1.setColumns(10);
				
				JButton btn2 = new JButton("Sort");
				btn2.setBounds(200, 150, 100, 20);
				getContentPane().add(btn2);
				
				JButton btn3 = new JButton("Sort");
				btn3.setBounds(100, 150, 100, 20);
				getContentPane().add(btn3);
				
				final JTextField txt2 = new JTextField(); // ช่องใส่
				txt2.setBounds(130, 200, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt2);
				txt2.setColumns(10);

				final JLabel lb3 = new JLabel("Array");
				lb3.setBounds(40,120,144,20);
				getContentPane().add(lb3);

				final JLabel lb4 = new JLabel("Aftersort");
				lb4.setBounds(40,200,144, 20);
				getContentPane().add(lb4);
				
				final JLabel lb5 = new JLabel("Seach");
				lb5.setBounds(550,5,50, 50);
				getContentPane().add(lb5);
				
				final JTextField txt4 = new JTextField(); // ช่องใส่
				txt4.setBounds(550, 41, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt4);
				txt4.setColumns(10);
				
				final JLabel lb6 = new JLabel("Inputkey");
				lb6.setBounds(500,41,144, 20);
				getContentPane().add(lb6);
				
				final JTextField txt5 = new JTextField(); // ช่องใส่
				txt5.setBounds(550, 70, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt5);
				txt5.setColumns(10);
				

				final JLabel lb7 = new JLabel("Array");
				lb7.setBounds(500,70,144, 20);
				getContentPane().add(lb7);
				
				
				JButton btn4 = new JButton("Sort");
				btn4.setBounds(520, 120, 100, 20);
				getContentPane().add(btn4);
				
				JButton btn5 = new JButton("Sort");
				btn5.setBounds(620, 120, 100, 20);
				getContentPane().add(btn5);
				
				final JTextField txt6 = new JTextField(); // ช่องใส่
				txt6.setBounds(550, 200, 144, 20);// ระยะห่างแนวนอน   ห่างแนวตั้ง กว้าง ยาว
				getContentPane().add(txt6);
				txt6.setColumns(10);
				
				
				final JLabel lb8 = new JLabel("Array");
				lb8.setBounds(500,200,144, 20);
				getContentPane().add(lb8);
				
				
				
				
				
				menuBar.add(menu0);
				setJMenuBar(menuBar);
			}
			
}
