package com.coolPatternGroup.themes;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractMenuBar extends JMenuBar {
    private Color bgColor;
    private Color borderColor;

    public void setBackgroundColor(Color color) {
        this.bgColor = color;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(bgColor);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    }
}
