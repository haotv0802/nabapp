DROP DATABASE IF EXISTS `haoho`;
CREATE DATABASE IF NOT EXISTS `haoho`;
use haoho;

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`
(
    `id`      BIGINT(20)    NOT NULL AUTO_INCREMENT,
    `name`    VARCHAR(20)   NULL     DEFAULT NULL,
    `price`   DECIMAL(10, 5) NULL     DEFAULT NULL,
    `branch`  VARCHAR(20)   NULL     DEFAULT NULL,
    `colour`  VARCHAR(20)   NULL     DEFAULT NULL,
    `created` DATETIME      NOT NULL DEFAULT now(),
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`
(
    `id`         BIGINT(20) NOT NULL AUTO_INCREMENT,
    `product_id` BIGINT     NOT NULL,
    `created`    DATETIME   NOT NULL DEFAULT now(),
    CONSTRAINT `order_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    PRIMARY KEY (`id`)
);


INSERT INTO product (`name`, `price`, `branch`, `colour`)
VALUES ('PRODUCT 1', 200.0, '01', 'RED'),
       ('PRODUCT 2', 100.0, '02', 'GREEN'),
       ('PRODUCT 3', 300.0, '03', 'BLUE'),
       ('PRODUCT 4', 400.0, '04', 'YELLOW')
