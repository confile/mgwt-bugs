package test.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.googlecode.mgwt.ui.client.widget.input.InputAppearance;
import com.googlecode.mgwt.ui.client.widget.input.InputAppearance.InputCss;

public class BInputAppearance implements InputAppearance {

	static {
		Resources.INSTANCE.css().ensureInjected();
	}
	
	interface Css extends InputCss {
		
	}

	interface Resources extends ClientBundle {

		Resources INSTANCE = GWT.create(Resources.class);

		@Source({ "input.css" })
//		@Source({ "com/googlecode/mgwt/ui/client/widget/input/input.css", "input.css" })
		Css css();
	}

	@Override
	public InputCss css() {
		return Resources.INSTANCE.css();
	}

}
