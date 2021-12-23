package com.Badia.orderService.controlers;

import com.Badia.orderService.VO.ResponseTemplateVo;
import com.Badia.orderService.models.Orders;
import com.Badia.orderService.services.OrderService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@Slf4j
@RequestMapping("/Orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Orders saveOrder(@RequestBody Orders order){
//        return 'test';
        return orderService.saveOrder(order);
    }

//    @GetMapping("/{id}")
//    public Orders getOrderById(@PathVariable("id") Integer orderId){
//        log.info("Inside findProductById in Product Controller");
//        return orderService.getOrderById(orderId);
//    }

    @GetMapping("/")
    public List<Orders> getProducts() {
        return (List<Orders>) orderService.getOrders();
    }

    @GetMapping("/{id}")
    public ResponseTemplateVo getOrderWithProduct(@PathVariable("id") Integer id){
        return orderService.getOrderWithProduct(id);
    }

}