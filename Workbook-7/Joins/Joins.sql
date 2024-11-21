-- Question 1: List the product id, product name, unit price, and category name of all products.


SELECT 
    Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
ORDER BY 
    Categories.CategoryName, 
    Products.ProductName;
-- Question 2: List the product id, product name, unit price, and supplier name of all products that cost more than $75.

SELECT 
    Products.ProductID, Products.ProductName, Products.UnitPrice, Suppliers.CompanyName AS SupplierName
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE 
    Products.UnitPrice > 75
ORDER BY 
    Products.ProductName;
-- Question 3: List the product id, product name, unit price, category name, and supplier name of every product.


SELECT 
    Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName, Suppliers.CompanyName AS SupplierName
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
ORDER BY 
    Products.ProductName;
-- Question 4: What is the product name(s) and categories of the most expensive products?


SELECT 
    Products.ProductName,  Categories.CategoryName, Products.UnitPrice
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE 
    Products.UnitPrice = (SELECT MAX(UnitPrice) FROM Products);
-- Question 5: List the order id, ship name, ship address, and shipping company name of every order that shipped to Germany.


SELECT 
    Orders.OrderID, Orders.ShipName, Orders.ShipAddress, Shippers.CompanyName AS ShippingCompanyName
FROM Orders
JOIN Shippers ON Orders.ShipVia = Shippers.ShipperID
WHERE 
    Orders.ShipCountry = 'Germany';
-- Question 6: List the order id, order date, ship name, and ship address of all orders that ordered "Sasquatch Ale".

SELECT 
    Orders.OrderID, 
    Orders.OrderDate, 
    Orders.ShipName, 
    Orders.ShipAddress
FROM Orders
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
JOIN Products ON OrderDetails.ProductID = Products.ProductID
WHERE 
    Products.ProductName = 'Sasquatch Ale';