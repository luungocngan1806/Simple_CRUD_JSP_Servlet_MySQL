CREATE SCHEMA `schoolschema` DEFAULT CHARACTER SET `UTF8MB4`  ;

USE `schoolschema`;

CREATE TABLE `student` 
(
	`id` 			BIGINT 			PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` 			NVARCHAR(20) 	NULL,
    `mail`			VARCHAR(50) 	NULL,
    `address` 		VARCHAR(100) 	NULL
)	CHARACTER SET `UTF8MB4`;
