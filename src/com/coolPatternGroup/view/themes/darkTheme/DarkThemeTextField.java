package com.coolPatternGroup.view.themes.darkTheme;

import com.coolPatternGroup.view.viewComponents.TextField;

import java.awt.*;

public class DarkThemeTextField extends TextField {

    public DarkThemeTextField() {
        this.setBackground(Color.darkGray.darker());
        this.setForeground(Color.lightGray);
    }
}
