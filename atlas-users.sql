Use ATLASBANKING;
create database ATLASUSERS;

create table atlas_users(
userId int not null primary key,
password varchar(12) not null,
firstName varchar(90) not null,
lastName varchar(90) not null,
phoneNumber varchar(11) not null,
eMail varchar(70) not null,
address varchar(70) not null,
balance int not null
);

insert into atlas_users values
(101,'helloworld95', 'Sophia','Herald','07986540389','sophiaherald@hotmail.com','64 Zoo Lane', 30000),
(102,'helloworld95','Imani','Obi','08725354681','imaniobi@hotmail.com','1 Washington Heights',20000),
(103,'helloworld95','Ada','Duru','07954638371','adaduru@hotmail.com','The White House',10000),
(104,'helloworld95','Omari','Bennett','02097165321','omaribennett@hotmail.com','10 Buckingham Palace',500),
(105,'helloworld95','Harry','Smith','07843083291','harrysmith@hotmail.com','32 Eiffel Tower Road',75000);

select * from atlas_users;
