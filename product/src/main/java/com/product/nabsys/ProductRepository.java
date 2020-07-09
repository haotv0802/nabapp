package com.product.nabsys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by haoho on 6/24/20.
 */
@Repository("productRepository")
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByBranch(int branch);
}
