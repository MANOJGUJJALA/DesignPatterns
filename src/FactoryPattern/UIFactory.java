package src.FactoryPattern;

import src.FactoryPattern.components.button.Button;
import src.FactoryPattern.components.dropdown.Dropdown;
import src.FactoryPattern.components.menu.Menu;

public interface UIFactory {

    Menu CreateMenu();
    Dropdown CreateDropdown();
    Button CreateButton();
}
