package qlnh.Modal;

public class Dish {
    private int id;
    private String name;
    private String ingredient; // Sửa lỗi chính tả từ "igredient" thành "ingredient"
    private String category;
    private int count;
    private int quantity;

    public Dish(int id, String name, String ingredient, String category, int count, int quantity) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
        this.category = category;
        this.count = count;
        this.quantity = quantity;
    }

    public Dish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", category='" + category + '\'' +
                ", count=" + count +
                ", quantity=" + quantity +
                '}';
    }
}
