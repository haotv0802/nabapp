package com.product.nabsys;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "`product`")
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`price`")
    private BigDecimal price;

    @Column(name = "`branch`")
    private String branch;

    @Column(name = "`colour`")
    private String colour;

    @Column(name = "`created`")
    private Date created;

}
