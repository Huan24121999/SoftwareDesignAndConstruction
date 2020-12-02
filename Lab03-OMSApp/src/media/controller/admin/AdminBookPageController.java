package media.controller.admin;

import java.util.List;
import java.util.Map;

import com.oms.bean.Media;

import api.MediaApi;
import media.pane.BookSearchPane;
import media.pane.BookSinglePane;
import media.pane.MediaSearchPane;
import media.pane.MediaSinglePane;

public class AdminBookPageController extends AdminMediaPageController{
	public AdminBookPageController() {
		super();
	}
	
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
}
