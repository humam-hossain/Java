public class Start {
    public static void main(String[] args) {
        Food food1 = new Food();
        Food food2 = new Food("Kacchi", "Bashmoti rice", 300, 375);

        food1.setName("Chicken Burger");
        food1.setIngredients("Chicken");
        food1.setPrice(200);
        food1.setCalories(150);

        food1.showDetails();
        System.out.println();

        System.out.println("Name: " + food2.getName());
        System.out.println("Special Ingradients: " + food2.getSpecialIngredients());
        System.out.println("Price: " + food2.getPrice());
        System.out.println("Calories: " + food2.getCalories());
    }
}
