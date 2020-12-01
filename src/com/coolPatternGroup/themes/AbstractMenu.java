package com.coolPatternGroup.themes;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractMenu extends JMenu {
    private Color popupMenuBackgroundColor;
    private Color popupMenuForegroundColor;

    public AbstractMenu() {
        this.setOpaque(false);
    }

    public void setPopupMenuBackgroundColor(Color popupMenuBackgroundColor) {
        this.popupMenuBackgroundColor = popupMenuBackgroundColor;
        this.getPopupMenu().setBackground(popupMenuBackgroundColor);
    }

    public void setPopupMenuForegroundColor(Color popupMenuForegroundColor) {
        this.popupMenuForegroundColor = popupMenuForegroundColor;
        this.getPopupMenu().setForeground(popupMenuForegroundColor);
    }
}
