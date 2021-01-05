package com.oms.components.media.cd.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.components.media.book.gui.BookSearchPane;
import com.oms.components.media.book.gui.BookSinglePane;
import com.oms.components.media.cd.gui.CdSearchPane;
import com.oms.components.media.cd.gui.CdSinglePane;
import com.oms.components.media.controller.AdminMediaPageController;
import com.oms.components.media.gui.MediaSearchPane;
import com.oms.components.media.gui.MediaSinglePane;
import com.oms.factory.AdminPageFactory;
import com.oms.factory.UserPageFactory;
import com.oms.serverapi.ImediaApi;
import com.oms.serverapi.MediaApi;

public class AdminCdPageController extends AdminMediaPageController{
	static {
		AdminPageFactory.getInstace().register("cd",new AdminCdPageController());
	}
	ImediaApi m_api= MediaApi.getInstace();
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return m_api.getCds(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new CdSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new CdSearchPane();
	}
	
	@Override
	public Media updateMedia(Media media) {
		return null;
	}
}
