CREATE TABLE FoodItems (
    ID INTEGER AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    ImageURL VARCHAR(255) NOT NULL, 
    Price DECIMAL(18,2)
    
)
Insert Into FoodItems values(1,'Hamburger','A Hamburger','http://assets.epicurious.com/photos/57c5c6d9cf9e9ad43de2d96e/master/pass/the-ultimate-hamburger.jpg', 9.99),
(2,'Fries','Some Fries','https://img.grouponcdn.com/deal/n53u4s7o1GbfXboD2Cbr/TF-700x420/v1/c700x420.jpg' ,4.99), (3,'Coke','Coke Cola','https://i.ytimg.com/vi/paUElsgY3Dc/maxresdefault.jpg', 2.99);
