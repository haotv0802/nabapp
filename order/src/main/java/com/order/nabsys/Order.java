package com.order.nabsys;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "`order`")
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`product_id`")
    private Long productId;

    @Column(name = "`quantity`")
    private Integer quantity;

    @Column(name = "`total`")
    private BigDecimal total;

    @Column(name = "`created`")
    private Date created;

}
