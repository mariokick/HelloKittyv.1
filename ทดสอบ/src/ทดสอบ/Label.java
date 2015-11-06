package ∑¥ Õ∫;


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



	public class Label extends JFrame {
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					Label frame = new Label();
					frame.setVisible(true);
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Label() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 362, 249);
			setTitle("ThaiCreate.Com Java GUI Tutorial");
			getContentPane().setLayout(null);
			
			// Label 1
			JLabel label1 = new JLabel("Welcome to..");
			label1.setBounds(130, 49, 99, 14);
			getContentPane().add(label1);
			
			// Label 2
			JLabel label2 = new JLabel();
			label2.setText("ThaiCreate.Com");
			label2.setBounds(111, 74, 128, 14);
			label2.setHorizontalTextPosition(JLabel.CENTER);
			getContentPane().add(label2);
			
			// Label 3 (Icon)
			JLabel lbl3 = new JLabel(new ImageIcon(getClass().getResource("save.gif")));
			lbl3.setBounds(142, 119, 46, 14);
			getContentPane().add(lbl3);

		}

	}
