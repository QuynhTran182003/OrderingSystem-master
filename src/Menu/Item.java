package Menu;

import javax.swing.*;

public class Item {
    protected String name;
    protected double price;
    protected int code;
    protected ImageIcon img;

    public Item(String name, double price, int code, ImageIcon img) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.img = img;
    }
    public Item(String name, double price, int code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }
// get set region
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
// end region

    @Override
    public String toString() {
        return "Name of product: " + this.name + ", price: " + this.price + "CZK" + ", code: " + this.code;
    }
}
