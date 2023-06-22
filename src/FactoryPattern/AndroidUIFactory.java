package src.FactoryPattern;

import src.FactoryPattern.components.button.AndroidButton;
import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.dropdown.AndroidDropdown;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.menu.AndroidMenu;
import src.FactoryPattern.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }
}
