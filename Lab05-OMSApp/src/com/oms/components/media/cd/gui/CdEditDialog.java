package com.oms.components.media.cd.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.media.gui.PhysicalMediaEditDialog;

@SuppressWarnings("serial")
public class CdEditDialog extends PhysicalMediaEditDialog{
	
	private JTextField publisherField;
	private JTextField languageField;
	
	public CdEditDialog(Media media, IDataManageController<Media> controller) {
		super(media, controller);
	}

	@Override
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof Book) {
			Book book = (Book) t;
			
			int row = getLastRowIndex();
			JLabel publisherLabel = new JLabel("Publisher");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(publisherLabel, c);
			publisherField = new JTextField(15);
			publisherField.setText(book.getPublisher());
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(publisherField, c);
			
			
			row = getLastRowIndex();
			JLabel languageLabel = new JLabel("Language");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(languageLabel, c);
			languageField = new JTextField(15);
			languageField.setText(book.getLanguage());
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(languageField, c);
		}
	}

	@Override
	public Media getNewData() {
		super.getNewData();
		
		if (t instanceof Book) {
			Book book = (Book) t;
			
			book.setPublisher(publisherField.getText());
			book.setLanguage(languageField.getText());
		}
		
		return t;
	}
}