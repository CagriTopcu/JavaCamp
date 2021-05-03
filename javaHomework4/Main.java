public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        GameManager gameManager = new GameManager();
        CustomerCheckManager customerCheckManager = new CustomerCheckManager();
        SellGameManager sellGameManager = new SellGameManager();

        Customer customer1 = new Customer(1,"Customer 1", "Customer 1","123456", "1990");
        Customer customer2 = new Customer(2,"Customer 2", "Customer 2", "1234567","1995");

        Game game1 = new Game(1, "Game 1", 75, true,1);
        Game game2 = new Game(2, "Game 2", 90, false);

        Campaign campaign1 = new Campaign(1,"Campaign 1", 10);

        customerManager.add(customer1);
        customerManager.delete(customer1);
        customerManager.update(customer1);

        gameManager.add(game1);
        gameManager.delete(game1);
        gameManager.update(game1);

        customerCheckManager.validateCustomer(customer1);
        sellGameManager.sellGame(game1,customer1,campaign1);
    }
}
