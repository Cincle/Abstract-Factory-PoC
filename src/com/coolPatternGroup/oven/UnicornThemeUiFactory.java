package com.coolPatternGroup.oven;

import com.coolPatternGroup.oven.*;
import com.coolPatternGroup.view.UIFactory;
import com.coolPatternGroup.view.viewComponents.*;

public class UnicornThemeUiFactory implements UIFactory {
    @Override
    public Button createButton() { return new UnicornThemeButton(); }

    @Override
    public Menu createMenu() {
        return new UnicornThemeMenu();
    }

    @Override
    public MenuBar createMenuBar() {
        return new UnicornThemeMenuBar();
    }

    @Override
    public MenuItem creteMenuitem() {
        return new UnicornThemeMenuItem();
    }

    @Override
    public Panel createPanel() {
        return new UnicornThemePanel();
    }

    @Override
    public TextArea createTextArea() {
        return new UnicornThemeTextArea();
    }

    @Override
    public TextField createTextField() { return new UnicornThemeTextField(); }
}
