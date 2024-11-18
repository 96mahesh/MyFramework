package com.project.setup;

import com.project.framework.AssertManager;
import com.project.framework.BaseTest;
import com.project.utils.DataLoaders;
import com.project.utils.UIUtils;

public class InitUtilObjects {
	private UIUtils uiutil;
	private AssertManager assertManager;
	private DataLoaders data ;
	
	public InitUtilObjects() {
		uiutil = new UIUtils();
		assertManager = new AssertManager();
		data = new DataLoaders();
	}
	
	public void setupTestObj() {
		BaseTest.utilObj.get().uiutil.setupTestObj();
		BaseTest.utilObj.get().assertManager.setupTestObj();
		BaseTest.utilObj.get().data.setupTestObj();
	}
	
	public UIUtils getUIUtils() {
		return uiutil;
	}
	
	public DataLoaders getDataLoaders() {
		return data;
	}
	
	public AssertManager getAssertManager() {
		return assertManager;
	}
	
	

}
