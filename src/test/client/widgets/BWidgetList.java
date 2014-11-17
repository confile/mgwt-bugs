package test.client.widgets;

import com.google.gwt.core.client.GWT;
import com.googlecode.mgwt.ui.client.widget.list.widgetlist.WidgetList;
import com.googlecode.mgwt.ui.client.widget.list.widgetlist.WidgetListAppearance;


public class BWidgetList extends WidgetList {

	private static final WidgetListAppearance DEFAULT_APPEARANCE = GWT.create(BWidgetListAppearance.class);
	
	public BWidgetList() {
		super(DEFAULT_APPEARANCE);	
	}
	
}
