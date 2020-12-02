package main.admin;

import javax.swing.JPanel;

import cart.CartController;
import media.controller.admin.AdminBookPageController;
import media.pane.UserBookPageController;

public class OMSAdminController {
	
	public OMSAdminController() {
	}
	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
