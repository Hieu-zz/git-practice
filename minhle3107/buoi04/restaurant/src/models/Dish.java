package models;

public class Dish {
    int id;
    String name;
    String ingredient;
    String category;
    int count;

    public Dish() {
    }

    public Dish(int id, String name, String ingredient, String category, int count) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
        this.category = category;
        this.count = count;
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


    public void order(int quantity) {
        count += quantity;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", category='" + category + '\'' +
                ", count=" + count +
                '}';
    }
}
