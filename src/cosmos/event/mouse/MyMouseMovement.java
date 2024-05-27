package cosmos.event.mouse;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseMovement {

	Label lbl;

	public MyMouseMovement() {
		Frame frame = new Frame("Mouse Movement");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//		lbl = new Label();
//		lbl.setBounds(30, 30, 100, 100);
//		frame.add(lbl);

		frame.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("===Mouse Moved Start===");
				System.out.println(e.getX());
				System.out.println("===Mouse Moved end===");
				

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("===Mouse Dragged Start===");
				System.out.println(e.getY());
				System.out.println("===Mouse Dragged End===");

			}
		});

		frame.setVisible(true);
		frame.setSize(800, 800);
	}

	public static void main(String[] args) {
		new MyMouseMovement();

	}

}
