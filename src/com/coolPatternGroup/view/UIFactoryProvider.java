package com.coolPatternGroup.view;

import com.coolPatternGroup.oven.UnicornThemeUiFactory;

public class UIFactoryProvider {
    private UIFactory uiFactoryToReturn;

    /**
     *
     * @param theme The theme for which factories should be returned.
     * @return UIFactory interface which's concrete implementation depends on the selected theme.
     */
    public UIFactory createUIFactory(String theme) {
        switch (theme) {
            case "light":
                uiFactoryToReturn = new LightThemeUiFactory();
                break;
            case "dark":
                uiFactoryToReturn = new DarkThemeUiFactory();
                break;
            default:
                uiFactoryToReturn = new LightThemeUiFactory();
        }
        return uiFactoryToReturn;
    }
}
