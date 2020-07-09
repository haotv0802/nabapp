DROP DATABASE IF EXISTS `haoho`;
CREATE DATABASE IF NOT EXISTS `haoho`;
use haoho;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`      bigint(20) NOT NULL AUTO_INCREMENT,
    `hp`      int        NULL DEFAULT NULL,
    `stamina` int             DEFAULT NULL,
    `atk`     int             DEFAULT NULL,
    `def`     int             DEFAULT NULL,
    `agi`     int             DEFAULT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`
(
    `id`      bigint(20)  NOT NULL AUTO_INCREMENT,
    `name`    int         NULL DEFAULT NULL,
    `price`   int         NULL DEFAULT NULL,
    `branch`  int         NULL DEFAULT NULL,
    `colour`  varchar(20) NULL DEFAULT NULL,
    `created` datetime         DEFAULT now() NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`
(
    `id`         bigint(20)             NOT NULL AUTO_INCREMENT,
    `product_id` bigint                 NOT NULL,
    `created`    datetime DEFAULT now() NOT NULL,
    CONSTRAINT `order_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    PRIMARY KEY (`id`)
);

DELIMITER $$
CREATE PROCEDURE generate_data()
BEGIN
    DECLARE i INT DEFAULT 0;
    WHILE i < 100
        DO
            INSERT INTO `user` (`hp`, `stamina`, `atk`, `def`, `agi`) VALUES (i, i, i, i, i);
            SET i = i + 1;
        END WHILE;
END$$
DELIMITER ;

CALL generate_data();
