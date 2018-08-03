package com.cgi.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class CompComparableDemo
{
    private static Comparator<Product> COMPARATOR = new Comparator<Product>()
    {
    // This is where the sorting happens.
        public int compare(Product o1, Product o2)
        {
            return o1.getPrice() - o2.getPrice();
        }
    };
     
    public static void main(String[] args)
    {
    Product product1 = new Product(1, 20);
    Product product2 = new Product(1, 1);
    Product product3 = new Product(3, 30);
    Product product4 = new Product(6, 6);
    Product product5 = new Product(4, 45);
    Product product6 = new Product(6, 3);
     
    List<Product> products = new ArrayList<Product>(6);
    products.add(product1);
    products.add(product2);
    products.add(product3);
    products.add(product4);
    products.add(product5);
    products.add(product6);
     
    for (Product product : products)
        System.out.println("Before sorting on price: " + product.getPrice());
     
    Collections.sort(products, COMPARATOR);
     
    for (Product product : products)
        System.out.println("After sorting on price: " + product.getPrice());
    }
}
 
class Product
{
    int code, price;
 
    public Product(int code, int price)
    {
    this.code = code;
    this.price = price;
    }
 
    public int getCode()
    {
        return code;
    }
 
    public int getPrice()
    {
        return price;
    }
}