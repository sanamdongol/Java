package org.work;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm {

	CalculatorForm() {
		Frame frame = new Frame("Calculator");

		Label label = new Label();
		label.setText("Welcome back. \n Lets Add Two Numbers");
		label.setBounds(20, 40, 400, 30);

		frame.add(label);

		Label lblFirstNumber = new Label("First Number");
		lblFirstNumber.setBounds(20, 75, 100, 30);
		frame.add(lblFirstNumber);

		TextField tfFirstNumber = new TextField();
		tfFirstNumber.setBounds(125, 75, 100, 30);
		frame.add(tfFirstNumber);

		Label lblSecondNumber = new Label("Second Number");
		lblSecondNumber.setBounds(20, 110, 100, 30);
		frame.add(lblSecondNumber);

		TextField tfSecondNumber = new TextField();
		tfSecondNumber.setBounds(125, 110, 100, 30);
		frame.add(tfSecondNumber);

		Button btnReset = new Button("Reset");
		btnReset.setBounds(20, 150, 100, 20);
		frame.add(btnReset);

		Button btnCalculate = new Button();
		btnCalculate.setLabel("Calculate");
		btnCalculate.setBounds(125, 150, 100, 20);
		frame.add(btnCalculate);

		Label lbl = new Label("Here is the result");
		lbl.setBounds(20, 185, 200, 20);
		frame.add(lbl);

		Label lblResult = new Label("0");
		lblResult.setBounds(20, 210, 200, 20);
		frame.add(lblResult);

		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO: Check if there are other inputs other than numbers.
				
				String numberFirst = tfFirstNumber.getText();
				String numberSecond = tfSecondNumber.getText();

				if (!numberFirst.isEmpty() && !numberSecond.isEmpty()) {

					System.out.println(numberFirst);
					System.out.println(numberSecond);

					// Convert string to integer
					int a = Integer.parseInt(numberFirst);
					int b = Integer.parseInt(numberSecond);

					int sum = a + b;
					// Converting sum to string
					String myResult = String.valueOf(sum);
					lblResult.setText(myResult);
				} else {
					lblResult.setText("Enter numbers to add");
				}

			}
		});

		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tfFirstNumber.setText(null);
				tfSecondNumber.setText(null);
				lblResult.setText("0");

			}
		});

		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new CalculatorForm();
	}

}
