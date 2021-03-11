DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE `proveedor` (
  `id` char(4) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;



DROP TABLE IF EXISTS `pieza`;
CREATE TABLE `pieza` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;


DROP TABLE IF EXISTS `suministra`;
CREATE TABLE `suministra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigopieza` int NOT NULL,
  `idproveedor` char(4) NOT NULL,
  `precio` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `pieza_FK_1` FOREIGN KEY (`codigopieza`) REFERENCES `pieza` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `proveedor_FK_1` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO pieza (nombre) values ('tuerca');
INSERT INTO pieza (nombre) values ('tornillo');

INSERT INTO proveedor (id,nombre) values ('AAAA','Bricomania');
INSERT INTO proveedor (id,nombre) values ('BBBB','Bauhaus');

INSERT INTO suministra (codigopieza,idproveedor,precio) VALUES (1,'AAAA',222);
INSERT INTO suministra (codigopieza,idproveedor,precio) VALUES (2,'BBBB',152);