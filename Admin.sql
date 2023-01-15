
create database  pams_add;
use pams_add;
drop table if exists PAMS_Admin;
create table PAMS_Admin(
Admin_Name varchar(30),
Admin_password varchar(64)
);
INSERT INTO PAMS_Admin(Admin_Name,Admin_Password)
VALUES('ERESHA','eresha');
select*from PAMS_Admin;
