package test.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.googlecode.mgwt.ui.client.widget.progress.ProgressIndicatorAbstractAppearance;

public class BProgressIndicatorAppearance extends
				ProgressIndicatorAbstractAppearance {

	static {
		Resources.INSTANCE.css().ensureInjected();
	}

	
	interface Css extends ProgressIndicatorCss {
		
	}
	
	interface Resources extends ClientBundle {

		Resources INSTANCE = GWT.create(Resources.class);

		@Source({ "bprogressindicator.css" })
		Css css();
	}

	@Override
	public ProgressIndicatorCss css() {
		return Resources.INSTANCE.css();
	}

}
