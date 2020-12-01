package com.coolPatternGroup.view;

import com.coolPatternGroup.view.themes.lightTheme.*;
import com.coolPatternGroup.view.viewComponents.*;

public class LightThemeUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public Menu createMenu() {
        return new LightThemeMenu();
    }

    @Override
    public MenuBar createMenuBar() {
        return new LightThemeMenuBar();
    }

    @Override
    public MenuItem creteMenuitem() {
        return new LightThemeMenuItem();
    }

    @Override
    public Panel createPanel() {
        return new LightThemePanel();
    }

    @Override
    public TextArea createTextArea() {
        return new LightThemeTextArea();
    }

    @Override
    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
