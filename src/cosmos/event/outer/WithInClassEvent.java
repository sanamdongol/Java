package cosmos.event.outer;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithInClassEvent implements ActionListener {

	TextField tf;

	public WithInClassEvent() {
		Frame frame = new Frame("Other Class");

		tf = new TextField();
		tf.setBounds(10, 40, 150, 20);
		frame.add(tf);

		Button btn = new Button("Click");
		btn.setBounds(10, 65, 150, 20);
		frame.add(btn);

		// register listener by passing current instance
		btn.addActionListener(this);

		frame.setLayout(null);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new WithInClassEvent();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Within class");
	}

}
