package media.controller.admin;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.IDataManageController;
import api.MediaApi;

public class AdminEditBookController implements IDataManageController<Media> {
	@Override
	public void create(Media t) {
		// Do nothing
	}
	@Override
	public void delete(Media t) {
		// Do nothing
	}
	@Override
	public void read(Media t) {
		// Do nothing
	}
	@Override
	public void update(Media t) {
		MediaApi mediaApi=new MediaApi();
		mediaApi.updateBook((Book)t);
	}

}
