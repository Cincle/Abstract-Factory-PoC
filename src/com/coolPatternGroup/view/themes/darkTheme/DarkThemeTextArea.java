package com.coolPatternGroup.view.themes.darkTheme;

import com.coolPatternGroup.view.viewComponents.TextArea;

import java.awt.*;

public class DarkThemeTextArea extends TextArea {

    public DarkThemeTextArea() {
        this.setBackground(Color.darkGray.darker());
        this.setForeground(Color.lightGray);
    }
}
