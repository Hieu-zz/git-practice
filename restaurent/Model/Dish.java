package restaurent.Model;

public class Dish {
    private int ID, count;
    private String name, ingredient, category;

    public Dish() {
    }

    public Dish(int ID, int count, String name, String ingredient, String category) {
        this.ID = ID;
        this.count = count;
        this.name = name;
        this.ingredient = ingredient;
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    @Override
    public String toString() {
        return "Dish{" +
                "ID=" + ID +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
