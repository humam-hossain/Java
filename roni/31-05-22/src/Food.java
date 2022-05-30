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
        System.out.println("Name: " + m_name + "\nSpecialIngredients: " + m_specialIngredients + "\nPrice: " + m_price + "\nCalories: " + m_calories);
    }
}

