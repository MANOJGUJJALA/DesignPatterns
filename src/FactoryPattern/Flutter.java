package src.FactoryPattern;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Setting some theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting some refresh rate");
    }

    public UIFactory CreateUIfactory(){
        return UIFactoryFactory.CreateUIFactory(this.supportedPlatform);
    }


}
