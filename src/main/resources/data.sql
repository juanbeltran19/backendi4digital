CREATE DATABASE dblogs;

CREATE TABLE logsusuarios (
	ID_TRANSACCIONUSUARIO INT(10) NOT NULL AUTO_INCREMENT,
	RESULTADO JSON,
	FECHA VARCHAR(20),
	SERVICIO VARCHAR(20),
	PRIMARY KEY (ID_TRANSACCIONUSUARIO) 
)