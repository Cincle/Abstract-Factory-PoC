package com.coolPatternGroup.view;

import com.coolPatternGroup.view.viewComponents.Button;
import com.coolPatternGroup.view.viewComponents.Menu;
import com.coolPatternGroup.view.viewComponents.MenuBar;
import com.coolPatternGroup.view.viewComponents.MenuItem;
import com.coolPatternGroup.view.viewComponents.Panel;
import com.coolPatternGroup.view.viewComponents.TextArea;
import com.coolPatternGroup.view.viewComponents.TextField;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class UiBuilder {
    private JFrame mainFrame;
    private String theme;

    private UIFactoryFactory uiFactoryFactory;
    private UIFactory uiFactory;

    private MenuBar menuBar;
    private Menu prefsMenu;
    private MenuItem settingsMenuItem;
    private Panel bottomPanel;
    private TextField textEntryField;
    private Button sendTextButton;
    private TextArea chatBox;

    public UiBuilder() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("com/coolPatternGroup/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        theme = properties.getProperty("theme");

        uiFactoryFactory = new UIFactoryFactory();
        uiFactory = uiFactoryFactory.createUIFactory(theme);

        mainFrame = new JFrame("Super cool chat program");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);

        menuBar = uiFactory.createMenuBar();
        prefsMenu = uiFactory.createMenu();
        settingsMenuItem = uiFactory.creteMenuitem();
        bottomPanel = uiFactory.createPanel();
        textEntryField = uiFactory.createTextField();
        sendTextButton = uiFactory.createButton();
        chatBox = uiFactory.createTextArea();

        prefsMenu.setText("Preferences");
        menuBar.add(prefsMenu);

        settingsMenuItem.setText("Example");
        prefsMenu.add(settingsMenuItem);

        textEntryField.setText("Enter Text");
        textEntryField.setPreferredSize(new Dimension(400, 30));

        sendTextButton.setText("Post");

        bottomPanel.add(textEntryField);
        bottomPanel.add(sendTextButton);

        chatBox.setText("\n Cooldude: Hey what's up dude!\n\n" +
                " Othercooldude: Hey dude! Man this chat sure is cool. \n\n " +
                " Cooldude: It sure is dude. It sure is.");

        mainFrame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        mainFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainFrame.getContentPane().add(BorderLayout.CENTER, chatBox);

        mainFrame.setVisible(true);
    }
}
