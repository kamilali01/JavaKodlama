public class ProductManager {

    public void add(Product product){
        
        if(ProductValidator.isvalid(product)){
        System.out.println("Eklendi");
        }
        else{
            System.out.println("Urun bilgileri gecersizdir");
        }
    }
    
}
