package cos.layouts;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoSection {
	
	public TwoSection() {
		Frame frame = new Frame("Two Section");
		frame.setLayout(new BorderLayout());

		Panel leftPanel = new Panel();
		// leftPanel.setSize(200, 400);
		leftPanel.setBackground(Color.GRAY);

		Button btnLeft = new Button("Left");
		leftPanel.add(btnLeft);
		//leftPanel.setPreferredSize(new Dimension(200, 400));

		frame.add(leftPanel, BorderLayout.WEST);
		

		Panel rightPanel = new Panel();
		// rightPanel.setSize(200, 400);
		rightPanel.setBackground(Color.WHITE);

		Label label = new Label("Right");
		rightPanel.add(label);

		rightPanel.setPreferredSize(new Dimension(200, 400));
		frame.add(rightPanel, BorderLayout.CENTER);

		
		btnLeft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("hello");
				rightPanel.setBackground(Color.ORANGE);
				leftPanel.setBackground(Color.RED);
				
			}
		});
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new TwoSection();
	}

}
