package com.coolPatternGroup.view;

public class UIFactoryFactory {
    private UIFactory uiFactoryToReturn;

    public UIFactory createUIFactory(String theme) {
        switch (theme) {
            case "light":
                uiFactoryToReturn = new LightThemeUiFactory();
                break;
            case "dark":
                uiFactoryToReturn = new DarkThemeUiFactory();
                break;
            case "vomit":
                uiFactoryToReturn = new VomitThemeUiFactory();
                break;
            default:
                uiFactoryToReturn = new LightThemeUiFactory();
        }
        return uiFactoryToReturn;
    }
}
