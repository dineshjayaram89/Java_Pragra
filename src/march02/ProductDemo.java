package march02;

import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Product1");
        Product p2 = new Product(2, "Product2");
        Product p3 = new Product(3, "Product3");
        Product p4 = new Product(4, "Product4");
        Product p5 = new Product(5, "Product5");

        Map<Product,Float> productSet = new HashMap<>();
        productSet.put(p1, 100.0f);
        productSet.put(p2, 110.0f);
        productSet.put(p3, 120.0f);
        productSet.put(p4, 130.0f);
        productSet.put(p5, 140.0f);

        Set<Product> products = productSet.keySet();
        Collection<Float> productPrice = productSet.values();

        for (Product p : products){
            //System.out.println(p);
            System.out.print("Id : " + p.getProdId());
            System.out.println("Name : " + p.getProdName());
        }
        System.out.println();
        for (float f : productPrice){
            System.out.println(f);
        }
        Object[] pArray = products.toArray();
        Object[] priceArray = productPrice.toArray();

        System.out.println("\nUsed To Array\n");

        for (int i = 0; i < productSet.size(); i++) {
            System.out.println(pArray[i]);
            System.out.println("Price: "+ priceArray[i]);
            System.out.println();
        }
    }
}
