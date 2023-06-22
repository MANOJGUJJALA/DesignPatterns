package src.FactoryPattern.components;

import src.FactoryPattern.UIFactory;
import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.button.MacButton;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.dropdown.MacDropdown;
import src.FactoryPattern.components.menu.MacMenu;
import src.FactoryPattern.components.menu.Menu;

public class MacUIFacttory implements UIFactory {
    @Override
    public Menu CreateMenu() {
        return new MacMenu();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new MacDropdown();
    }

    @Override
    public Button CreateButton() {
        return new MacButton();
    }
}
