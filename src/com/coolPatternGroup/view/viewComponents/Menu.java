package com.coolPatternGroup.view.viewComponents;

import javax.swing.*;
import java.awt.*;

public abstract class Menu extends JMenu {
    private Color popupMenuBackgroundColor;
    private Color popupMenuForegroundColor;

    public Menu() {
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
