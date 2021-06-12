DROP TABLE IF EXISTS `branch_office`;
CREATE TABLE `branch_office` (
  `id_branch_office` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` int DEFAULT NULL,
  `id_turn` int DEFAULT NULL,
  `id_stock` int DEFAULT NULL,
  `id_person` int DEFAULT NULL,
  PRIMARY KEY (`id_branch_office`),
  KEY `fk_turn_branch_office` (`id_turn`),
  KEY `fk_person_branch_office` (`id_person`),
  KEY `fk_stock_branch_office` (`id_stock`),
  CONSTRAINT `fk_person_branch_office` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`),
  CONSTRAINT `fk_stock_branch_office` FOREIGN KEY (`id_stock`) REFERENCES `stock` (`id_stock`),
  CONSTRAINT `fk_turn_branch_office` FOREIGN KEY (`id_turn`) REFERENCES `turn` (`id_turn`)
)

INSERT INTO `branch_office` VALUES (1,'La Plata','la plata 123',14785236,1,1,1),
(2,'Chacarita','chacarita 147',96325874,2,2,2),
(3,'San Telmo','san telmo 852',12365478,3,4,3),
(4,'San Justo','san justo 369',98745632,1,3,4),
(5,'Lanus','lanus 753',35786942,2,1,5),
(6,'La Plata','la plata 123',14785236,1,1,1),
(7,'Chacarita','chacarita 147',96325874,2,2,2),
(8,'San Telmo','san telmo 852',12365478,3,4,3),
(9,'San Justo','san justo 369',98745632,1,3,4),
(17,'Lanus','lanus 753',35786942,2,1,5);

DROP TABLE IF EXISTS `garment`;
CREATE TABLE `garment` (
  `id_garment` int NOT NULL AUTO_INCREMENT,
  `size` varchar(20) NOT NULL,
  `season` varchar(20) NOT NULL,
  `price` int NOT NULL,
  `year` int DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_garment`)
)

INSERT INTO `garment` VALUES (1,'M','spring',200,2021,'remera'),
(2,'L','summer',300,2020,'pantalon'),
(3,'XL','fall',500,2021,'vestido'),
(4,'S','winter',400,2019,'camisa');

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id_person` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `dni` int NOT NULL,
  `age` int DEFAULT NULL,
  `id_turn` int DEFAULT NULL,
  `id_role` int DEFAULT NULL,
  PRIMARY KEY (`id_person`),
  KEY `fk_turn_person` (`id_turn`),
  KEY `fk_role_person` (`id_role`),
  CONSTRAINT `fk_role_person` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`),
  CONSTRAINT `fk_turn_person` FOREIGN KEY (`id_turn`) REFERENCES `turn` (`id_turn`)
)

INSERT INTO `person` VALUES (1,'lucas','martines',147852369,21,1,2),
(2,'juana','estevez',852963741,25,1,2),
(3,'maria','lopez',741852963,32,2,1),
(4,'malena','perez',741852999,41,3,3),
(5,'luana','rodriguez',741852852,37,2,3),
(6,'ruana','rodriguez',741852852,37,2,3),
(7,'lucas','martines',147852369,21,1,2),
(8,'maria','lopez',741852963,32,2,1),
(9,'malena','perez',741852999,41,3,3),
(10,'juana','estevez',852963741,25,1,3),
(11,'luana','rodriguez',741852852,37,2,3),
(13,'maria','lopez',741852963,32,2,1),
(14,'malena','perez',741852999,41,3,3),
(15,'juana','estevez',852963741,25,1,1);

DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `id_resource` int NOT NULL AUTO_INCREMENT,
  `type_resource` varchar(45) NOT NULL,
  PRIMARY KEY (`id_resource`)
)

INSERT INTO `resource` VALUES (1,'create'),
,(3,'update'),
(4,'delete');

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id_role` int NOT NULL AUTO_INCREMENT,
  `type_rol` varchar(45) NOT NULL,
  PRIMARY KEY (`id_role`)
)
INSERT INTO `role` VALUES (1,'manager'),
(2,'local manager'),
(3,'seller'),
(4,'client');

DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `id_role_resource` int NOT NULL AUTO_INCREMENT,
  `id_role` int NOT NULL,
  `id_resource` int NOT NULL,
  PRIMARY KEY (`id_role_resource`),
  KEY `fk_role_role_resource` (`id_role`),
  KEY `fk_resource_role_resource` (`id_resource`),
  CONSTRAINT `fk_resource_role_resource` FOREIGN KEY (`id_resource`) REFERENCES `resource` (`id_resource`),
  CONSTRAINT `fk_role_role_resource` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`)
)

INSERT INTO `role_resource` VALUES (1,1,1),
(2,1,2),
(3,1,3),
(4,1,2),
(5,2,2),
(6,2,3),
(7,2,1),
(8,3,2),
(9,3,3),
(10,3,2);

DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `id_sale` int NOT NULL AUTO_INCREMENT,
  `id_person` int DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `id_branch_office` int DEFAULT NULL,
  `update_` date NOT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`id_sale`),
  KEY `fk_person_sale` (`id_person`),
  KEY `fk_branch_office_sale` (`id_branch_office`),
  CONSTRAINT `fk_branch_office_sale` FOREIGN KEY (`id_branch_office`) REFERENCES `branch_office` (`id_branch_office`),
  CONSTRAINT `fk_person_sale` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`)
)

INSERT INTO `sale` VALUES (1,1,'venta por menor',200,1,1,'2021-05-06',200),
(2,4,'ultimo en stock',300,2,2,'2021-05-05',600),
(3,5,'de la nueva temporada',400,3,3,'2021-04-06',1200),
(4,6,'primer venta del día',500,2,4,'2021-01-05',2000),
(5,1,'ultima venta del día',200,2,5,'2020-11-05',400),
(6,6,'compra sorpresa',300,6,4,'2020-09-17',1800),
(34,NULL,'venta por menor especial',200,1,1,'2021-05-06',200);

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id_stock` int NOT NULL AUTO_INCREMENT,
  `update_` date NOT NULL,
  `id_garment` int DEFAULT NULL,
  `amount` int NOT NULL,
  PRIMARY KEY (`id_stock`),
  KEY `fk_garment_stock` (`id_garment`),
  CONSTRAINT `fk_garment_stock` FOREIGN KEY (`id_garment`) REFERENCES `garment` (`id_garment`)
)

INSERT INTO `stock` VALUES (1,'2021-02-17',1,20),
(2,'2021-02-17',1,20),
(3,'2021-05-17',2,30),
(4,'2021-04-20',3,5),
(5,'2020-12-04',4,52),
(9,'2021-02-17',1,20),
(10,'2021-05-17',2,30),
(11,'2021-04-20',3,5),
(12,'2020-12-04',4,52);

DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `id_ticket` int NOT NULL AUTO_INCREMENT,
  `id_sale` int DEFAULT NULL,
  `id_person` int DEFAULT NULL,
  `id_branch_office` int DEFAULT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`id_ticket`),
  KEY `fk_sale_ticket` (`id_sale`),
  KEY `fk_person_ticket` (`id_person`),
  KEY `fk_branch_office_ticket` (`id_branch_office`),
  CONSTRAINT `fk_branch_office_ticket` FOREIGN KEY (`id_branch_office`) REFERENCES `branch_office` (`id_branch_office`),
  CONSTRAINT `fk_person_ticket` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`),
  CONSTRAINT `fk_sale_ticket` FOREIGN KEY (`id_sale`) REFERENCES `sale` (`id_sale`)
)

INSERT INTO `ticket` VALUES (1,1,5,1,1200),
(2,2,4,2,2000),
(3,3,3,3,3000),
(4,4,2,4,5000),
(5,5,1,5,1400),
(6,6,5,1,3000);

DROP TABLE IF EXISTS `turn`;
CREATE TABLE `turn` (
  `id_turn` int NOT NULL AUTO_INCREMENT,
  `type_turno` varchar(45) NOT NULL,
  PRIMARY KEY (`id_turn`)
)

INSERT INTO `turn` VALUES (1,'morning'),
(2,'afternoon'),
(3,'night');



