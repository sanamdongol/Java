package cos.layouts;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MyPanel extends JFrame {

	MyPanel() {
		JPanel panelOne = new JPanel();
		panelOne.setBounds(20, 10, 200, 200);
		panelOne.setBackground(Color.red);
		panelOne.setLayout(new BoxLayout(panelOne, BoxLayout.Y_AXIS));

		JLabel lblEmail = new JLabel("Email");
		JTextField tfEmail = new JTextField();
		JLabel lblPin = new JLabel("PIN");
		JTextField tfPIN = new JTextField();
		JButton btn = new JButton("Login");

		panelOne.add(lblEmail);
		panelOne.add(tfEmail);
		panelOne.add(lblPin);
		panelOne.add(tfPIN);
		panelOne.add(btn);

		add(panelOne);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);

		JPanel panelTwo = new JPanel();

		JLabel lblDisplay = new JLabel("See Magic");
		panelTwo.add(lblDisplay);

		panelTwo.setBackground(Color.gray);
		panelTwo.setBounds(220, 210, 200, 200);
		add(panelTwo);

		tfPIN.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				System.out.println(tfPIN.getText().toString());
				lblDisplay.setText(tfPIN.getText().toString().toLowerCase());
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String email = tfEmail.getText().toString();
				lblDisplay.setText(email.toUpperCase());

			}
		});

	}

}
