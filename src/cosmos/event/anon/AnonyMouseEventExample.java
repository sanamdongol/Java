package cosmos.event.anon;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonyMouseEventExample {

	public AnonyMouseEventExample() {

		Frame frame = new Frame();

		TextField tf = new TextField();
		tf.setBounds(10, 40, 150, 20);
		frame.add(tf);

		Button btn = new Button("Click");
		btn.setBounds(10, 65, 150, 20);
		frame.add(btn);

		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  System.out.println("Hello");
				
			}
		});
		
		
		frame.setLayout(null);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new AnonyMouseEventExample();
	}

}
