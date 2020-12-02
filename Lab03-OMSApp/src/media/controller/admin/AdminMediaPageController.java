package media.controller.admin;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.IDataManageController;
import editdialog.BookEditDialog;
import editdialog.MediaEditDialog;

public abstract class AdminMediaPageController extends ADataPageController<Media> {
	//private CartController cartController;
	//private MediaEditDialog mediaEditDialog;
	
	public AdminMediaPageController() {
		super();
	}
	
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	public void editProductInformation(Media media) {
		if (media instanceof Book) {
			IDataManageController<Media> adminEditBookController=new AdminEditBookController();
			MediaEditDialog mediaEditDialog =new BookEditDialog(media, adminEditBookController);
			mediaEditDialog.setVisible(true);
		}
		
		
	}
}
