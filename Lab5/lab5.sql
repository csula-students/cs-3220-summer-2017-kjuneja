 LAB 5
 //Query to create new table fooditems.

CREATE TABLE FoodItems (
    ID INTEGER AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    Price DECIMAL(18,2)
    
)
//Query to create new table orders.

 CREATE TABLE Orders (
    ID INTEGER AUTO_INCREMENT PRIMARY KEY,
    Customer_Name VARCHAR(255) NOT NULL,
    Created DATETIME
    
)
//Query to create new table orderfood.

 CREATE TABLE OrderFoods (
    OrderID INTEGER ,
    FoodID INTEGER ,
    Quantity INTEGER 
    
)
//Query to create new table shoppingcart.

CREATE TABLE ShoppingCart (
    ID INTEGER ,
    Customer_Name VARCHAR(255) NOT NULL,
    FoodID INTEGER,
    Quantity INTEGER
    
)

// Query to insert default values in fooditems table.

Insert Into FoodItems values(1,'Hamburger','A Hamburger', 9.99),
(2,'Fries','Some Fries', 4.99), (3,'Coke','Coke Cola', 2.99);

// Query to insert default values in orders table.

Insert Into Orders values(1, 'Eric','2017-07-20 13:35:55'),
(2, 'John','2017-07-22 10:35:55'), (3, 'Jane','2017-07-22 15:35:55'), 
(4, 'Alice','2017-07-22 16:35:55');


// Query to insert default values in orderfoods table.

Insert Into OrderFoods values (1,1,1),(1,2,2),(2,2,2),
(2,3,1),(3,3,1),(4,2,1),(4,3,2);

// Query to insert default values in shoppingcart table.

Insert Into ShoppingCart values (1,'Anonymous',1,2),(1,'Anonymous',2,1),
(1,'Anonymous',2,1),
(2,'Mike',1,1),(2,'Mike',2,1),(3,'Bob',3,1);

// Query to update food item name from Hamburger to Salad

Update FoodItems set Name = 'Salad' where id =1;

// Query to update customer name from Jane to Doe

Update Orders set Customer_Name = 'Doe' where id =3;

// Query to find out which food item has the most orders

Select name from FoodItems INNER JOIN OrderFoods ON FoodItems.ID = OrderFoods.FoodID  
group by OrderFoods.FoodID order by Sum(OrderFoods.Quantity) DESC limit 1 ;

// Query to find out which food item in least shopping cart

Select name from FoodItems INNER JOIN ShoppingCart ON FoodItems.ID = ShoppingCart.FoodID  
group by ShoppingCart.FoodID order by Sum(ShoppingCart.Quantity) ASC limit 1;

// Query to find out the order statuses that is created today

SELECT * FROM Orders WHERE DATE(created) = CURDATE();

// Query to find out all restaurant food items

Select * From FoodItems;

// Query to find out all restaurant order statuses

Select * from Orders; 

// Query to delete restaurant food items table

Drop table FoodItems;

// Query to delete restaurant order statuses table

Drop table Orders;

// Query to delete restaurant cart table

Drop table ShoppingCart;
