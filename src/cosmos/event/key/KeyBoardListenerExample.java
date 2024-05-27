package cosmos.event.key;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardListenerExample {

	public KeyBoardListenerExample() {

		Frame frame = new Frame();

		TextField tf = new TextField();
		tf.setBounds(20, 80, 200, 30);
		frame.add(tf);

		Label lbl = new Label("You will see key events here");
		lbl.setBounds(20, 20, 200, 30);
		frame.add(lbl);

		Label lbl5 = new Label();
		lbl5.setBounds(20, 120, 400, 30);
		frame.add(lbl5);

		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Key Typed");
				System.out.println("Key Typed");

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Key Released");
				System.out.println("Key Released");

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Key Pressed");
				System.out.println("Key Pressed");

				System.out.println(tf.getText().length() + "alphabets pressed");

				if (tf.getText().length() == 5 || tf.getText().length() <= 8) {
					lbl5.setText("Alpha entered 5 times will disapper after 8");
				} else {
					lbl5.setText("");
				}

			}
		});

		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400, 400);

	}

	public static void main(String[] args) {

		new KeyBoardListenerExample();
	}

}
