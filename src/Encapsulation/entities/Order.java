package Encapsulation.entities;

import Constructors.entities.Product;

import java.util.Date;

public class Order {
    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        super();
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }
}
