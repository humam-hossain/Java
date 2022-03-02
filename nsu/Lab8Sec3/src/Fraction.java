public class Fraction {
    int numerator, denominator;
    
    Fraction(){

    }

    Fraction(int nominator, int denominator){
        this.numerator = nominator;
        this.denominator = denominator;
    }

    int getNumerator(){
        return this.numerator;
    }

    int getDenominator(){
        return this.denominator;
    }

    void setNumerator(int numerator){
        this.numerator = numerator;
    }

    void setDenominator(int denominator){
        this.denominator = denominator;
    }
    
    void add(Fraction fraction){
        this.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        this.denominator = this.denominator * fraction.denominator;
    }

    void sub(Fraction fraction){
        this.numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        this.denominator = this.denominator * fraction.denominator;
    }

    void multiplication(Fraction fraction){
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
    }

    void division(Fraction fraction){
        this.numerator = this.numerator * fraction.denominator;
        this.denominator = this.denominator * fraction.numerator;
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
