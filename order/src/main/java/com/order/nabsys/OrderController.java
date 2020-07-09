package com.order.nabsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by haoho on 7/9/20.
 */
@RestController
@RequestMapping(path = "/svc")
public class OrderController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(@Qualifier("orderRepository") OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping ("/order/list")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
