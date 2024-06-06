package cos.layouts;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

public class FormSection {

	public FormSection() {
		Frame frame = new Frame("Form Section");
		frame.setLayout(new BorderLayout());

		Panel leftPanel = new Panel();

		Label lblEmail = new Label("Email");
		leftPanel.add(lblEmail);

		TextField tfEmail = new TextField();
		leftPanel.add(tfEmail);

		Button btnLeft = new Button("Submit");
		leftPanel.add(btnLeft);

		leftPanel.setBackground(Color.GRAY);
		leftPanel.setPreferredSize(new Dimension(250, 500));
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		frame.add(leftPanel, BorderLayout.WEST);

		Panel rightPanel = new Panel();
		Label lblRight = new Label("User ko Email");
		rightPanel.add(lblRight);

		Label userLeLekhkoLabel = new Label();
		userLeLekhkoLabel.setBackground(Color.CYAN);
		rightPanel.add(userLeLekhkoLabel);

		rightPanel.setBackground(Color.WHITE);
		rightPanel.setPreferredSize(new Dimension(250, 500));
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		frame.add(rightPanel, BorderLayout.EAST);

		btnLeft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userKoEmail = tfEmail.getText() + " ";
				userLeLekhkoLabel.setText(userKoEmail);
			}
		});

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FormSection();
	}

}
