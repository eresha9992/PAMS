-- DDL--
DROP DATABASE HOSPTIAL;
CREATE DATABASE HOSPTIAL;
USE HOSPTIAL;
DROP TABLE IF EXISTS RECEPTIONIST;
CREATE TABLE RECEPTIONIST 
(
R_NAME VARCHAR(10) NOT NULL,
R_ID INT PRIMARY KEY,
R_GENDER CHAR,
R_DESIGINATION VARCHAR(100),
R_DATE_OF_BIRTH DATE,
R_AGE INT,
R_SHIFT_TIME VARCHAR(10),
R_CONTACT_NUMBER VARCHAR(10),
R_ADDRESS VARCHAR(10),
check(R_ID<=2)
);
insert into RECEPTIONIST values('a',1,'m','sp','2021-10-20',21,'d','99999999','mum');
insert into RECEPTIONIST values('akash',2,'m','manager','2018-08-15',23,'nightshift','9071293820','kolkatta');
insert into RECEPTIONIST values('usha',3,'f','hr','2015-06-13',28,'nightshift','9449727220','mysore');
select * from RECEPTIONIST;
drop table RECEPTIONIST;
-- DQL
SELECT * FROM RECEPTIONIST;
SELECT * FROM RECEPTIONIST LIMIT 2;
-- DCL
CREATE USER 'ERESHA'@'LOCALHOST';
CREATE USER 'RAMESH'@'LOCALHOST';
CREATE USER 'SHAIK'@'LOCALHOST';
SELECT * FROM MYSQL.USER;
SELECT USER();
SELECT version();
FLUSH privileges;
-- grant
GRANT SELECT, INSERT,UPDATE,DELETE ON RECEPTIONIST TO 'ERESHA'@'LOCALHOST';
GRANT ALL ON RECEPTIONIST TO 'ERESHA'@'LOCALHOST';
SHOW GRANTS;

-- REVOKE--
REVOKE SELECT,INSERT,UPDATE,DELETE ON RECEPTIONIST FROM 'ERESHA'@'LOCALHOST';
 REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'ERESHA'@'LOCALHOST';
 