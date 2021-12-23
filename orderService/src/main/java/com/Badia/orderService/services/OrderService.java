package com.Badia.orderService.services;

import com.Badia.orderService.VO.Product;
import com.Badia.orderService.VO.ResponseTemplateVo;
import com.Badia.orderService.models.Orders;
import com.Badia.orderService.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
//import org.springframework.web.client.RestTemplate;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;


    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    public Orders getOrderById(Integer orderId) {
        return orderRepository.getOrderById(orderId);
    }


    public ResponseTemplateVo getOrderWithProduct(Integer id) {
        ResponseTemplateVo vo = new ResponseTemplateVo();
        Orders order = orderRepository.getOrderById(id);
        Product product = restTemplate.getForObject("http://localhost:9191/Products/" + order.getProduct_id(),
                Product.class);
        vo.setOrders(order);
        vo.setProduct(product);
        return vo;
    }
}
