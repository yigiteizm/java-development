-- Question 1: Most expensive product name
SELECT ProductName
FROM Products
WHERE UnitPrice = (SELECT MAX(UnitPrice) FROM Products);
-- Question 2: Cheapest product name
SELECT ProductName
FROM Products
WHERE UnitPrice = (SELECT MIN(UnitPrice) FROM Products);
-- Question 3: Number of products in each category
SELECT Categories.CategoryName, COUNT(Products.ProductID) AS ProductCount
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
GROUP BY Categories.CategoryName;
-- Question 4: Supplier providing the most products
SELECT Suppliers.CompanyName, COUNT(Products.ProductID) AS ProductCount
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
GROUP BY Suppliers.CompanyName
ORDER BY ProductCount DESC
LIMIT 1;
-- Question 5: Products with no orders
SELECT ProductName
FROM Products
WHERE ProductID NOT IN (SELECT ProductID FROM OrderDetails);
-- Question 6: Total revenue for each product
SELECT Products.ProductName, SUM(OrderDetails.Quantity * OrderDetails.UnitPrice) AS TotalRevenue
FROM OrderDetails
JOIN Products ON OrderDetails.ProductID = Products.ProductID
GROUP BY Products.ProductName
ORDER BY TotalRevenue DESC;
-- Question 7: Employee who handled the most orders
SELECT Employees.FirstName, Employees.LastName, COUNT(Orders.OrderID) AS OrderCount
FROM Orders
JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
GROUP BY Employees.EmployeeID
ORDER BY OrderCount DESC
-- Question 8: Average price of products in each category



-- Question 9: Customers who placed the largest number of orders



-- Question 10: Products with stock below reorder level

