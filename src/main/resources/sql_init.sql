CREATE SCHEMA IF NOT EXISTS payments_javaspring;
USE `payments_javaspring`;

CREATE USER IF NOT EXISTS
'payments-api-java'@'localhost' IDENTIFIED BY 'abc123';
ALTER USER 'payments-api-java'@'localhost' IDENTIFIED WITH mysql_native_password BY 'abc123';
GRANT ALL PRIVILEGES ON *.* TO 'payments-api-java'@'localhost';

USE payments_javaspring;
DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(128) NOT NULL,
    `last_name` varchar(128) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1;