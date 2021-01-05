package com.oms.factory;
import java.util.HashMap;

import javax.swing.JPanel;

import com.oms.components.media.controller.AdminMediaPageController;
public class AdminPageFactory {
	private static AdminPageFactory instance=new AdminPageFactory();
	public static AdminPageFactory getInstace() {
		return instance;
	}
	private HashMap<String,AdminMediaPageController> m_list= new HashMap<String,AdminMediaPageController>();
	public void register(String type, AdminMediaPageController controller) {
		m_list.put(type,controller);
	}
	public JPanel createPage(String type) {
		return m_list.get(type).getDataPagePane();
	}
}
