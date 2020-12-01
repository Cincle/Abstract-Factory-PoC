package com.coolPatternGroup;

import com.coolPatternGroup.themes.AbstractMenuBar;
import com.coolPatternGroup.themes.lightTheme.LightThemeMenu;
import com.coolPatternGroup.themes.lightTheme.LightThemeMenuBar;

import javax.swing.*;
import java.awt.*;

public class UiBuilder {
    JFrame mainFrame;

    public UiBuilder() {
        mainFrame = new JFrame("Cool Design Pattern");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);

        AbstractMenuBar menuBar = new LightThemeMenuBar();

        JMenu prefsMenu = new LightThemeMenu();
        prefsMenu.setText("Preferences");
//
//        prefsMenu.setForeground(Color.red);
//        prefsMenu.setBackground(Color.red);
//        prefsMenu.setOpaque(false);
//        prefsMenu.getPopupMenu().setBackground(Color.green);
//        prefsMenu.getPopupMenu().setForeground(Color.blue);
        menuBar.add(prefsMenu);

        JMenuItem exampleItem = new JMenuItem("Example");
//        exampleItem.setForeground(Color.yellow);
//        exampleItem.setBackground(Color.cyan);
        prefsMenu.add(exampleItem);


        JPanel bottomPanel = new JPanel();
        JTextField textEntryField = new JTextField();
        textEntryField.setText("Enter Text");
        textEntryField.setPreferredSize(new Dimension(400, 30));
        JButton sendtext = new JButton();
        sendtext.setText("Post");

        bottomPanel.add(textEntryField);
        bottomPanel.add(sendtext);

        JTextArea chatBox = new JTextArea();
        chatBox.setText("ExampleText");
        chatBox.setForeground(Color.RED);

        mainFrame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        mainFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainFrame.getContentPane().add(BorderLayout.CENTER, chatBox);



        mainFrame.setVisible(true);
    }
}
