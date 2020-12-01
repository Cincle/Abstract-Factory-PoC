package com.coolPatternGroup.view;

import com.coolPatternGroup.view.themes.vomit.*;
import com.coolPatternGroup.view.viewComponents.*;

public class VomitThemeUiFactory implements UIFactory{
    @Override
    public Button createButton() { return new VomitThemeButton(); }

    @Override
    public Menu createMenu() {
        return new VomitThemeMenu();
    }

    @Override
    public MenuBar createMenuBar() {
        return new VomitThemeMenuBar();
    }

    @Override
    public MenuItem creteMenuitem() {
        return new VomitThemeMenuItem();
    }

    @Override
    public Panel createPanel() {
        return new VomitThemePanel();
    }

    @Override
    public TextArea createTextArea() {
        return new VomitThemeTextArea();
    }

    @Override
    public TextField createTextField() {
        System.out.println("aoiergkjabg");
        return new VomitThemeTextField();
    }
}
