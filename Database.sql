Create Database Project2;
Use Project2;
Create Table TShirts(name varchar(25), price int, availability bit);
Create Table Trousers(name varchar(25), price int, availability bit);
Create Table Shorts(name varchar(25), price int, availability bit);
Create Table Skirts(name varchar(25), price int, availability bit);
Drop Table TShirts;
Drop Table Trousers;
Drop Table Skirts;
Drop Table Shorts;
Create Table TShirts(ID int, name varchar(25), price int, availability bit, Primary Key(ID));
Create Table Trousers(ID int, name varchar(25), price int, availability bit,Primary Key(ID));
Create Table Shorts(ID int, name varchar(25), price int, availability bit,Primary Key(ID));
Create Table Skirts(ID int, name varchar(25), price int, availability bit,Primary Key(ID));
Insert Into TShirts Values (12345, "Crop Shirt", 35, 1); 
Insert Into TShirts Values (12346, "Dress Shirt", 46, 1); 
Insert Into TShirts Values (12347, "Office Shirt", 23, 1);
Insert Into Trousers Values (12345, "Jeans", 35, 1); 
Insert Into Trousers Values (12346, "Slacks", 46, 1); 
Insert Into Trousers Values (12347, "Cargo trousers", 23, 1);
Insert Into Shorts Values (12345, "Booty shorts", 35, 1); 
Insert Into Shorts Values (12346, "Three-quatered shorts", 46, 1); 
Insert Into Shorts Values (12347, "Beach shorts", 23, 1);
Insert Into Skirts Values (12345, "Pencil Skirt", 35, 1); 
Insert Into Skirts Values (12346, "Flared skirt", 46, 1); 
Insert Into Skirts Values (12347, "Maxi skirt", 23, 1);
Drop Table TShirts;
Drop Table Trousers;
Drop Table Skirts;
Drop Table Shorts;
Create Table TShirts(ID int, name varchar(25), price float, availability bit, Primary Key(ID));
Create Table Trousers(ID int, name varchar(25), price float, availability bit,Primary Key(ID));
Create Table Shorts(ID int, name varchar(25), price float, availability bit,Primary Key(ID));
Create Table Skirts(ID int, name varchar(25), price float, availability bit,Primary Key(ID));
Insert Into TShirts Values (12345, "Crop Shirt", 35.00, 1); 
Insert Into TShirts Values (12346, "Dress Shirt", 46.50, 1); 
Insert Into TShirts Values (12347, "Office Shirt", 23.99, 1);
Insert Into Trousers Values (12345, "Jeans", 35.00, 1); 
Insert Into Trousers Values (12346, "Slacks", 46.30, 1); 
Insert Into Trousers Values (12347, "Cargo trousers", 23.60, 1);
Insert Into Shorts Values (12345, "Booty shorts", 35.25, 1); 
Insert Into Shorts Values (12346, "Three-quatered shorts", 46.40, 1); 
Insert Into Shorts Values (12347, "Beach shorts", 23.33, 1);
Insert Into Skirts Values (12345, "Pencil Skirt", 35.60, 1); 
Insert Into Skirts Values (12346, "Flared skirt", 46.20, 1); 
Insert Into Skirts Values (12347, "Maxi skirt", 23.55, 1);