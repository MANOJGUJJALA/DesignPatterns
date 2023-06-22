package src.FactoryPattern;

import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.button.IOSButton;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.dropdown.IOSDropdown;
import src.FactoryPattern.components.menu.IOSMenu;
import src.FactoryPattern.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button CreateButton() {
        return new IOSButton();
    }
}
