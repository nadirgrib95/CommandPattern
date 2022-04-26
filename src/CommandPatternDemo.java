public class CommandPatternDemo {

    public static void main(String[] args) {

        Stock abcStcok = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStcok);
        SellStock sellStockOrder = new SellStock(abcStcok);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
