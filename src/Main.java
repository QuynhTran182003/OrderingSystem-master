import Menu.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        // create items
        Item m1 = new Sushi("Tuna Maki", 119, 202, new ImageIcon("avo maki.jpg"));
        Item m2 = new Sushi("Tuna Maki", 119, 201, new ImageIcon("cucumber maki.jpg"));
        Item m3 = new Sushi("Tuna Maki", 119, 213, new ImageIcon("maki salmon.jpg"));
        Item m4 = new Sushi("Tuna Maki", 119, 214, new ImageIcon("maki tuna.jpg"));
        Item cali1 = new Sushi("Salmon Roll", 229, 501, new ImageIcon("salmon roll.jpg"));
        Item cali2 = new Sushi("Tuna Roll", 239, 502, new ImageIcon("tuna roll.jpg"));
        Item cali3 = new Sushi("Shrimp Roll", 249, 503, new ImageIcon("shrimp roll.jpg"));
        Item sd1 = new Soft_Drinks("Coca-Cola", 49, 1, new ImageIcon("coca.jpg"));
        Item sd2 = new Soft_Drinks("Mango Juice", 49, 2, new ImageIcon("mango juice.jpg"));
        Item sd3 = new Soft_Drinks("7-Up", 49, 3, new ImageIcon("7up.jpg"));
        Item c1 = new Cocktails("Mojito", 129, 4, new ImageIcon("mojito.jpg"));
        Item c2 = new Cocktails("Mojito-Strawberry", 129, 5, new ImageIcon("mojito strawberry.png"));
        Item c3 = new Cocktails("Mojito-PassionFruit", 129, 6, new ImageIcon("MojitoPassion.jpg"));
        Item bb1 = new Bubble_Tea("Lychee", 109, 111, new ImageIcon("lychee.png"));
        Item bb2 = new Bubble_Tea("Mango", 109, 112, new ImageIcon("Mango bubble tea.jpg"));
        Item bb3 = new Bubble_Tea("Matcha", 119, 124, new ImageIcon("matcha.jpg"));

        // add all of items to menu
        menu.addToMenu(m1);
        menu.addToMenu(m2);
        menu.addToMenu(m3);
        menu.addToMenu(m4);
        menu.addToMenu(cali1);
        menu.addToMenu(cali2);
        menu.addToMenu(cali3);
        menu.addToMenu(sd1);
        menu.addToMenu(sd2);
        menu.addToMenu(sd3);
        menu.addToMenu(c1);
        menu.addToMenu(c2);
        menu.addToMenu(c3);
        menu.addToMenu(bb1);
        menu.addToMenu(bb2);
        menu.addToMenu(bb3);

        MyFrame fr = new MyFrame();
    }
}
