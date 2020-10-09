package Spring_demo1.Drink;

/**
 * 顾客购买奶茶的需求
 * species 奶茶种类
 * sugar 加糖量
 * size 容量
 */

public class Demands {
    private String species;
    private String sugar;
    private String size;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
