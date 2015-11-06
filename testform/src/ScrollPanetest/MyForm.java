package ScrollPanetest;


import java.awt.Adjustable;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.WindowEvent;

public class MyForm extends Frame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm form = new MyForm();
				form.setVisible(true);
			}
		});
	}

	public MyForm() {

		// Create Form Frame
		super("ThaiCreate.Com Java GUI Tutorial");
		setSize(434, 285);
		setLocation(500, 280);
		setLayout(null);

		ScrollPane scroller = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		scroller.add(new MyPanel());

		Adjustable vadjust = scroller.getVAdjustable();
		Adjustable hadjust = scroller.getHAdjustable();
		hadjust.setUnitIncrement(10);
		vadjust.setUnitIncrement(10);
		scroller.setBounds(120, 50, 130, 70);
		scroller.setSize(200, 200);

		add("Center", scroller);

		// Close
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
	}

	class MyPanel extends Panel {

		public Dimension getPreferredSize() {
			return new Dimension(300, 300);
		}

		public void paint(Graphics g) {
			//
			Label lbl1 = new Label("Label Text 1");
			lbl1.setBounds(75, 46, 80, 22);
			add(lbl1);
			
			Label lbl2 = new Label("Label Text 2");
			lbl2.setBounds(244, 108, 80, 22);
			add(lbl2);
			
			Label lbl3 = new Label("Label Text 3");
			lbl3.setBounds(93, 160, 80, 22);
			add(lbl3);
			
			Label lbl4 = new Label("Label Text 4");
			lbl4.setBounds(318, 215, 80, 22);
			add(lbl4);
			
			Label lbl5 = new Label("Label Text 5");
			lbl5.setBounds(294, 46, 80, 22);
			add(lbl5);
		}
	}
	

}

