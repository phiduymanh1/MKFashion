package com.example.shopquanaomk.Dto.ResponDto;

import java.math.BigDecimal;

public class OrderItemResponse {
    private Integer id;
    private Integer orderId;
    private String productName;
    private Integer quantity;
    private BigDecimal price;

    public OrderItemResponse(Integer id, Integer orderId, String productName, Integer quantity, BigDecimal price) {
        this.id = id;
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
