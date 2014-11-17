package test.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.googlecode.mgwt.ui.client.widget.list.widgetlist.WidgetListAbstractAppearance;
import com.googlecode.mgwt.ui.client.widget.list.widgetlist.WidgetListAppearance.WidgetListCss;

public class BWidgetListAppearance extends WidgetListAbstractAppearance {

	static {
		Resources.INSTANCE.css().ensureInjected();
	}

	interface Css extends WidgetListCss {
		
	}	
	
	interface Resources extends ClientBundle {

		Resources INSTANCE = GWT.create(Resources.class);

		@Source({ "widgetlist.css" })
//		@Source({ "com/googlecode/mgwt/ui/client/widget/list/widgetlist/widgetlist.css", "widgetlist.css" })
		Css css();
	}

	@Override
	public WidgetListCss css() {
		return Resources.INSTANCE.css();
	}

}
