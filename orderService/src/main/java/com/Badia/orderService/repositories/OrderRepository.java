package com.Badia.orderService.repositories;


import com.Badia.orderService.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

//    public Orders getOrderById(Integer orderId);

     Orders getOrderById(Integer orderId);
}