public class ProductValidator {  //bu class static olamaz

    static{
        System.out.println("Static yapici blok calisti");
    }

    public ProductValidator() {
        System.out.println("Yapici blok calisti");
    }

    public static boolean isvalid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void bisey(){

    }

    public static class BaskaBirClass{  //innerclass static ola bilir
        public static void sil(){

        }
    }
}
