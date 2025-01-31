public class FoodOrderExample {
    public static void main(String[] args) {
        FoodOrder pizza = new PizzaOrder();
        FoodOrder burguerOrder = new BurguerOrder();

        pizza.prepareOrder();
        System.out.println("--------------");
        burguerOrder.prepareOrder();
    }
}
