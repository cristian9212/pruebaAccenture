CREATE TABLE factura ( id_factura INTEGER AUTO_INCREMENT,
                      fecha_compra INTEGER NOT NULL,
                      valor_total INTEGER NOT NULL,
                      iva INTEGER NOT NULL,
                      cargo_domicilio INTEGER NOT NULL,
                      id_usuario INTEGER,
                      PRIMARY KEY (id_factura),
                      FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)); 
                      
 CREATE table producto(id_producto integer AUTO_INCREMENT,
                      nombre_producto integer not null,
                      valor_producto integer not null,
                      PRIMARY KEY (id_producto));
                      
 CREATE table  facturaXproducto(id_factura_x_producto integer AUTO_INCREMENT,
                                id_factura INTEGER,
                                id_producto INTEGER,
                                PRIMARY KEY (id_factura_x_producto),
                                FOREIGN KEY(id_factura) REFERENCES factura(id_factura),
                                FOREIGN kEY(id_producto) REFERENCES producto(id_producto));