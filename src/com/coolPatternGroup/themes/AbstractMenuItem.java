package com.coolPatternGroup.themes;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractMenuItem extends JMenuItem {
    private Color backgroundColor;
    private Color foregroundColor;

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }
}
