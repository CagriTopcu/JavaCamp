public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop 1", 7000, "16 GB Ram", 10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Laptop 2");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(6500);

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Computers");

        System.out.println(category1.getName());
        System.out.println(product2.getUnitPriceAfterDiscount());

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product2);
    }
}
