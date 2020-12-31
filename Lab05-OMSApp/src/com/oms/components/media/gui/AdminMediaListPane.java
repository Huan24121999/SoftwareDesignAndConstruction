package com.oms.components.media.gui;

import com.oms.bean.Media;
import com.oms.components.abstractdata.controller.ADataPageController;
import com.oms.components.abstractdata.gui.ADataListPane;
import com.oms.components.abstractdata.gui.ADataSinglePane;
import com.oms.components.media.controller.AdminMediaPageController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class AdminMediaListPane extends ADataListPane<Media> {

    public AdminMediaListPane(ADataPageController<Media> controller) {
        this.controller = controller;
    }

    @Override
    public void decorateSinglePane(ADataSinglePane<Media> singlePane) {
        JButton button = new JButton("Edit");
        singlePane.addDataHandlingComponent(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((AdminMediaPageController)controller).onEdit(singlePane);
            }
        });
    }
}