package shape;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Graphics;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new JFrame(){
	public void paint(Graphics g){
		shape.Rectangle r1 =new Rectangle(8,4);
			g.drawString("Area of Rectangle is "+r1.getArea(),90 ,150);
		
	
	}

};
frame.setSize(300,300);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setVisible(true);
	}

}
