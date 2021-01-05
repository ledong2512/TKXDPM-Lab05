package com.oms.components.media.cd.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Media;
import com.oms.components.cart.controller.CartController;
import com.oms.components.media.book.gui.BookSearchPane;
import com.oms.components.media.book.gui.BookSinglePane;
import com.oms.components.media.cd.gui.CdSearchPane;
import com.oms.components.media.cd.gui.CdSinglePane;
import com.oms.components.media.controller.UserMediaPageController;
import com.oms.components.media.gui.MediaSearchPane;
import com.oms.components.media.gui.MediaSinglePane;
import com.oms.factory.UserPageFactory;
import com.oms.serverapi.MediaApi;

public class UserCdPageController extends UserMediaPageController{
	static {
		UserPageFactory.getInstace().register("cd",new UserCdPageController());
	}
	public UserCdPageController() {
		super();
	}
	public UserCdPageController(CartController cartController) {
		super(cartController);
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return  MediaApi.getInstace().getCds(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new CdSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new CdSearchPane();
	}
}
