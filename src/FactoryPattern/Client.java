package src.FactoryPattern;

import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.menu.Menu;

public class Client {

    public static void main(String[] args) {

    Flutter flutter = new Flutter(SupportedPlatform.MAC);

    UIFactory uiFactory=flutter.CreateUIfactory();

    Menu menu=uiFactory.CreateMenu();
    Button button=uiFactory.CreateButton();

    Dropdown dropdown=uiFactory.CreateDropdown();
    }



}
