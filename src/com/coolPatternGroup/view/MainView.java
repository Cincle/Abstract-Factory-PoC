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

public class MainView {
    private JFrame mainViewFrame;
    private String theme;

    private UIFactoryProvider uiFactoryProvider;
    private UIFactory uiFactory;

    private MenuBar menuBar;
    private Menu prefsMenu;
    private MenuItem settingsMenuItem;
    private Panel bottomPanel;
    private TextField textEntryField;
    private Button sendTextButton;
    private TextArea chatBox;

    public MainView() {
        this.theme = initTheme();
        initViewFrame();
        initViewComponents();
        configViewComponents();
        configViewFrame();
    }

    /**
     * Loads config.properties file into Properties object.
     * Fetches theme from properties object.
     * @return theme string set in config.properties file.
     */
    private String initTheme() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("com/coolPatternGroup/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty("theme");
    }

    /**
     * Initializes the view's main JFrame.
     */

    private void initViewFrame() {
        this.mainViewFrame = new JFrame("Super cool chat program");
        this.mainViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainViewFrame.setSize(800, 600);
    }

    /**
     * Constructs the view components of the main view dependent on the theme.
     */
    private void initViewComponents() {
        //Initializes the UIFactory provider.
        uiFactoryProvider = new UIFactoryProvider();

        //Use the UIFactory provider to initialize a UIFactory which its concrete implementation depends on the theme.
        uiFactory = uiFactoryProvider.createUIFactory(theme);

        //Builds the view components which its concrete implementation depends on the UIFactory.
        menuBar = uiFactory.createMenuBar();
        prefsMenu = uiFactory.createMenu();
        settingsMenuItem = uiFactory.creteMenuitem();
        bottomPanel = uiFactory.createPanel();
        textEntryField = uiFactory.createTextField();
        sendTextButton = uiFactory.createButton();
        chatBox = uiFactory.createTextArea();
    }

    /**
     * Configures the initialized view components.
     */

    private void configViewComponents() {
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
    }

    /**
     * Configuration of the view's main JFrame.
     */
    private void configViewFrame() {
        mainViewFrame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        mainViewFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainViewFrame.getContentPane().add(BorderLayout.CENTER, chatBox);

        mainViewFrame.setVisible(true);
    }
}
