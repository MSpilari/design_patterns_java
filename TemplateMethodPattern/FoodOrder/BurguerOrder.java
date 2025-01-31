public class BurguerOrder extends FoodOrder {

    @Override
    protected void selectIngredients() {
        System.out.println("Select hamburguer");
        System.out.println("Select cheese");
        System.out.println("Select tomatoes");
        System.out.println("Select ketchup");
        System.out.println("Select mustard");
        System.out.println("Select onions");
    }

    @Override
    protected void cookFood() {
        System.out.println("Cooking your burguer...");
    }

}
