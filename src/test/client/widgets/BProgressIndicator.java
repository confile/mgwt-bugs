package test.client.widgets;

import com.google.gwt.core.shared.GWT;
import com.googlecode.mgwt.ui.client.widget.progress.ProgressIndicator;
import com.googlecode.mgwt.ui.client.widget.progress.ProgressIndicatorAppearance;

public class BProgressIndicator extends ProgressIndicator {

	private static final ProgressIndicatorAppearance DEFAULT_APPEARANCE = GWT
			.create(BProgressIndicatorAppearance.class);


	public BProgressIndicator() {
		super(DEFAULT_APPEARANCE);
	}

}
