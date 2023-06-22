package src.FactoryPattern;

import src.FactoryPattern.components.MacUIFacttory;

public class UIFactoryFactory {
    public static UIFactory CreateUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform){
            case IOS -> new IOSUIFactory();
            case Android -> new AndroidUIFactory();
            case Windows -> new WindowsUIFactory();
            case MAC -> new MacUIFacttory();
        };
    }

}
