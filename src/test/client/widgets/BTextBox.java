package test.client.widgets;

import com.google.gwt.core.client.GWT;
import com.googlecode.mgwt.ui.client.widget.input.InputAppearance;
import com.googlecode.mgwt.ui.client.widget.input.MTextBox;

public class BTextBox extends MTextBox {

	private static final InputAppearance DEFAULT_APPEARANCE = GWT.create(BInputAppearance.class);
	
	public BTextBox() {
		super(DEFAULT_APPEARANCE);	
	}
	
}
