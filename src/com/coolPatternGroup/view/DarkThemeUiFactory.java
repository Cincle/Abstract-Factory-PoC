package com.coolPatternGroup.view;

import com.coolPatternGroup.view.themes.darkTheme.*;
import com.coolPatternGroup.view.themes.lightTheme.*;
import com.coolPatternGroup.view.viewComponents.*;

public class DarkThemeUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkThemeMenu();
    }

    @Override
    public MenuBar createMenuBar() {
        return new DarkThemeMenuBar();
    }

    @Override
    public MenuItem creteMenuitem() {
        return new DarkThemeMenuItem();
    }

    @Override
    public Panel createPanel() {
        return new DarkThemePanel();
    }

    @Override
    public TextArea createTextArea() {
        return new DarkThemeTextArea();
    }

    @Override
    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
