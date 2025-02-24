package com.example.shopquanaomk.Dto.ResponDto;

import com.example.shopquanaomk.Enum.OrderStatus;

import java.math.BigDecimal;
import java.time.Instant;

public class OrderDtoResponse {

    private Integer id;


    private String userName;


    private BigDecimal totalPrice;


    private OrderStatus status;


    private Instant createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
