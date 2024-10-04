package entity;

import java.io.Serializable;

public class MonAn implements Serializable {
    private int id;
    private String name;
    private String ingredients;
    private String category;
    private int count;


    public MonAn() {
    }

    public MonAn(int id, String name, String ingredients, String category, int count) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
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

    @Override
    public String toString() {
        return "MonAn[" +
                "id=" + id +
                "| name='" + name + '\'' +
                "| ingredients='" + ingredients + '\'' +
                "| category='" + category + '\'' +
                "| count=" + count +
                ']';
    }
}
