public class PizzaOrder extends FoodOrder {

    @Override
    protected void selectIngredients() {
        System.out.println("Select cheese");
        System.out.println("Select chicken");
        System.out.println("Select tomatoes");
    }

    @Override
    protected void cookFood() {
        System.out.println("Cooking your pizza...");
    }

}
