package collection;

import java.util.*;

public class Product {

    private final String name;
    private final float price;
    private final double quantity;
    private boolean checked;

    public Product(String name, float price, double quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setChecked() {
        checked = true;
    }
    public boolean isChecked() { return checked; }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s руб., Количество: %s кг., Продукт куплен: %s", this.name,
                this.price, this.quantity, checkedString);
    }
}
