package Menu;

import java.awt.*;
import java.util.List;

public class Menu extends Frame {
    public List<Item> items;

    public Menu () {
        this.setTitle("Menu");
        this.setSize(800,600);
        this.setLayout(null);
        this.setVisible(true);


    }

    public void addToMenu(Item i) {
        items.add(i);
    }

    private String showMenu() {
        StringBuffer str = new StringBuffer();
        for(Item i : items) {
            str.append(i + "\n");
        }
        return str.toString();
    }

}
