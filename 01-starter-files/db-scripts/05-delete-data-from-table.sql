USE `full-stack-ecommerce`;

--
-- delete data in all table
--
SET FOREIGN_KEY_CHECKS=0;

TRUNCATE `order_item`;
TRUNCATE `orders`;
TRUNCATE `customer`;
TRUNCATE `address`;

SET FOREIGN_KEY_CHECKS=1;

ALTER TABLE customer ADD UNIQUE (email);