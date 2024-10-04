package org.example.quanlynhahang.models;

public class Dish {
    public int ID;
    public String Name;
    public String Ingredients;
    public String Category;
    public int Count;

    public Dish() {
    }

    public Dish(int ID, String name, String ingredients, String category, int count) {
        this.ID = ID;
        Name = name;
        Ingredients = ingredients;
        Category = category;
        Count = count;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }


    @Override
    public String toString() {
        return "Dish{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Ingredients='" + Ingredients + '\'' +
                ", Category='" + Category + '\'' +
                ", Count=" + Count +
                '}';
    }
}
