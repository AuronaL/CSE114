/**
 * Design a class named Stock that contains
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    /**
     * Construct a stock with a specified symbol and name
     */
    public Stock( String sym, String name) {
        this.name = name;
        this.symbol = sym;
    }

    /**
     * Getter & Setter
     */
    //The accessor method for all data
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // The mutator methods for previousClosingPrice and currentPrice.

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //%
    public double changePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice *100;
    }
}
