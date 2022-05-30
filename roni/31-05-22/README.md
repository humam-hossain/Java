# Lab - 2

### Food Class

```java


public class Food {
    private String m_name, m_specialIngredients;
    private double m_price;
    private float m_calories;

    Food(){

    }

    Food(String name, String specialIngredients, double price, float calories){
        m_name = name;
        m_specialIngredients = specialIngredients;
        m_price = price;
        m_calories = calories;
    }

    // setters
    void setName(String name){
        m_name = name;
    }
    void setIngredients(String specialIngredients){
        m_specialIngredients = specialIngredients;
    }
    void setPrice(double price){
        m_price = price;
    }
    void setCalories(float calories){
        m_calories = calories;
    }

    // getters
    String getName(){
        return m_name;
    }
    String getSpecialIngredients(){
        return m_specialIngredients;
    }
    double getPrice(){
        return m_price;
    }
    float getCalories(){
        return m_calories;
    }

    void showDetails(){
        System.out.println("Name: " + m_name + "\nSpecialIngredients: " + m_specialIngredients + "\nPrice: " + 
        m_price + "\nCalories: " + m_calories);
    }
}


```

### Start Class

```java
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
```