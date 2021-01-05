package com.oms.factory;
import java.util.HashMap;

import javax.swing.JPanel;

import com.oms.components.media.controller.UserMediaPageController;
public class UserPageFactory {
	private static UserPageFactory instance=new UserPageFactory();
	public static UserPageFactory getInstace() {
		return instance;
	}
	private HashMap<String,UserMediaPageController> m_list= new HashMap<String,UserMediaPageController>();
	public void register(String type, UserMediaPageController controller) {
		m_list.put(type,controller);
	}
	public JPanel createPage(String type) {
		return m_list.get(type).getDataPagePane();
	}
}
