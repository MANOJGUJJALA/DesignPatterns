package src.FactoryPattern;

import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.button.WindowsButton;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.dropdown.WindowsDropdown;
import src.FactoryPattern.components.menu.Menu;
import src.FactoryPattern.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu CreateMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new WindowsDropdown();
    }

    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }
}
