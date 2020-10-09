package Spring_demo1.Drink;

/**
 * 奶茶店制作奶茶，完成顾客需求
 */

public class DrinkMaker {
    private String beverageShop = null;
    private Demands demands = null;

//    public String getBeverageShop() {
//        return beverageShop;
//    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

//    public Demands getDemands() {
//        return demands;
//    }

    public void setDemands(Demands demands) {
        this.demands = demands;
    }

    public String makeDrink() {
        String drink = "您好，您的 [" + demands.getSize() + demands.getSugar() + demands.getSpecies()
                + "] 已经由" + beverageShop + "奶茶店制作完成" + "\n" + "请取餐，祝您用餐愉快";
        return drink;
    }
}
