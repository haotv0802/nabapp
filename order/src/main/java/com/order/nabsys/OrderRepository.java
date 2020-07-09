package com.order.nabsys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by haoho on 6/24/20.
 */
@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByProductId(int productId);
}
