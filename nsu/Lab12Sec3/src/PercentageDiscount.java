public class PercentageDiscount implements Discountable{
    private double percentage;

    PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    double getPercentage(){
        return this.percentage;
    }

    void setPercentage(double percentage){
        this.percentage = percentage;
    }

    @Override
    public double discountedPrice(double price) {
        return price * (1 - this.percentage/100);
    }
}

