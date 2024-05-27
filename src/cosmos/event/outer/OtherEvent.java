package cosmos.event.outer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherEvent implements ActionListener {

	OuterEventMainClass objHere;

	OtherEvent(OuterEventMainClass obj) {
		this.objHere = obj;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		objHere.tf.setText("Setting Value");
	}

}
