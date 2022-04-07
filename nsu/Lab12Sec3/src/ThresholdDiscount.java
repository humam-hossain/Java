public class ThresholdDiscount implements Discountable{
    double threshold;
    double discount;

    ThresholdDiscount(double threshold, double discount){
        this.threshold = threshold;
        this.discount = discount;
    }

    double getThreshold(){
        return this.threshold;
    }
    double getDiscount(){
        return this.discount;
    }

    void setThreshold(double threshold){
        this.threshold = threshold;
    }
    void setDiscount(double discount){
        this.discount = discount;
    }

    @Override
    public double discountedPrice(double price) {
        if(price > this.threshold){
            return price - discount;
        }

        return price;
    }
}
