package com.coolPatternGroup.view;

import com.coolPatternGroup.view.viewComponents.*;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public MenuBar createMenuBar();
    public MenuItem creteMenuitem();
    public Panel createPanel();
    public TextArea createTextArea();
    public TextField createTextField();
}
