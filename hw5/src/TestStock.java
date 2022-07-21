/**
 * Write a test program named TestStock that creates a Stock object
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOD", "Google Inc.");
        stock.setPreviousClosingPrice(100);
        stock.setCurrentPrice(90);
        System.out.println(stock.changePercent()+" %");

    //Facebook
        Stock facebookSt = new Stock("META", "Facebook Inc.");
        facebookSt.setPreviousClosingPrice(1000);
        facebookSt.setCurrentPrice(11000);
        System.out.println(facebookSt.changePercent()+" %");

    // Amazon
        Stock amazonSt = new Stock("AMZN", "Amazon Inc.");
        amazonSt.setPreviousClosingPrice(1000);
        amazonSt.setCurrentPrice(12000);
        System.out.println(amazonSt.changePercent()+" %");

    }
}
