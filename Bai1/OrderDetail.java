/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author admin
 */
public class OrderDetail extends Product{
    
    private int quantity;
    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public OrderDetail(int quantity, Product product, String description, String productID, double price) {
        super(description, productID, price);
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }

    public double calcTotalPrice(){
        double tinhthanhtien;
        tinhthanhtien = quantity * price;
        return tinhthanhtien;
    }
}
