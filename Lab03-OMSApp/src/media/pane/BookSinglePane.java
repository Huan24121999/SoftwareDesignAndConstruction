package media.pane;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;


@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	
	private JLabel labelPublisher;
	private JLabel labelLanguage;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
		
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof Book) {
			Book book = (Book) t;
			
			labelPublisher.setText("Publisher: " + book.getPublisher());
			labelLanguage.setText("Language: " + book.getLanguage());
		}
	}
}
