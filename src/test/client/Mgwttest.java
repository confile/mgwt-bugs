package test.client;

import test.client.widgets.BTextBox;
import test.client.widgets.BWidgetList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Mgwttest implements EntryPoint {
	
	@Override
	public void onModuleLoad() {
	
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(final Throwable e) {
            	
            	GWT.log("UncaughtException: ", e);
            	Window.alert("UncaughtException: "+e);
               	
            }
        });
		
		// SuperDevModeUtil.showDevMode();

		// set viewport and other settings for mobile
		ViewPort viewPort = new MGWTSettings.ViewPort();

		viewPort.setUserScaleAble(false).setMinimumScale(1.0)
				.setMinimumScale(1.0).setMaximumScale(1.0);
		// viewPort.setHeightToDeviceHeight().setWidthToDeviceWidth(); // !! do
		// not use this note the content is bigger than the screen if you use
		// this option

		MGWTSettings settings = new MGWTSettings();
		settings.setViewPort(viewPort);
		settings.setFullscreen(true);
		settings.setFixIOS71BodyBug(true);
		settings.setPreventScrolling(true);

		settings.setStatusBarStyle(MGWTSettings.StatusBarStyle.BLACK);

		// MGWT.showAddressBar(false); //TODO check 2.0
		MGWT.applySettings(settings);
		
		
		// test
		
		BWidgetList list = new BWidgetList();
		list.setRound(false);
		
		BTextBox textBox1 = new BTextBox();
		textBox1.setPlaceHolder("text1");
		
		BTextBox textBox2 = new BTextBox();
		textBox2.setPlaceHolder("text2");
		
		BTextBox textBox3 = new BTextBox();
		textBox3.setPlaceHolder("text3");
		
		list.add(textBox1);
		list.add(textBox2);
		list.add(textBox3);
		
		
		
		RootPanel.get().add(list);		
	}
	
	
	
	
	
}
