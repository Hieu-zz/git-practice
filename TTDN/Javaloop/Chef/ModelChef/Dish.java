package Chef.ModelChef;

public class Dish {
    int Id;
    String name;
    String ingredents;
    String category;
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Dish() {
    }

    public Dish(int id, String name, String ingredents, String category,int count) {
        Id = id;
        this.name = name;
        this.ingredents = ingredents;
        this.category = category;
        this.count = 0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredents() {
        return ingredents;
    }

    public void setIngredents(String ingredents) {
        this.ingredents = ingredents;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int sell (int quatity){
        return quatity;
    }

    @Override
    public String toString() {
        return "Dish: " +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", ingredents='" + ingredents + '\'' +
                ", category='" + category;
    }
}
