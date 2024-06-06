package cos.layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBorderLayout {

	public MyBorderLayout() {
		JFrame frame = new JFrame();
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");

		frame.add(b1, BorderLayout.NORTH);
		frame.add(b2, BorderLayout.SOUTH);
		frame.add(b3, BorderLayout.EAST);
		frame.add(b4, BorderLayout.WEST);
		frame.add(b5, BorderLayout.CENTER);

		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyBorderLayout();

	}

}
