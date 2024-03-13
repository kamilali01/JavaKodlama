public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Black");
        Product product1=new Product();
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
