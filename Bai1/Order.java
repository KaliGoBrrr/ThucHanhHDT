/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Order extends OrderDetail {
    
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail [] lineItems;
    private int count;

    public Order() {
    }

    public Order(int orderID, LocalDate orderDate, OrderDetail[] lineItems, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
        this.count = count;
    }

    public Order(int orderID, LocalDate orderDate, OrderDetail[] lineItems) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(OrderDetail[] lineItems) {
        this.lineItems = lineItems;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '}';
    }

    public void addLineItem(Product p, int x){
        lineItems.add(new OrderDetail(p, x));
    }
       
}
