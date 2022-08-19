package entities;

public class CurrencyConverter {
    public double precoDollar;
    public double qtdDollar;

    public double totalComIof (){
        return (qtdDollar * precoDollar) * 06/100 + (qtdDollar * precoDollar) ;

    }
}
