public abstract class FoodOrder {

    public final void prepareOrder() {
        selectIngredients();
        cookFood();
        packFood();
    }

    protected abstract void selectIngredients();

    protected abstract void cookFood();

    private void packFood() {
        System.out.println("Packing your food");
    }
}
