-- Qusetion 1:Number of Suppliers

SELECT COUNT(*) AS SupplierCount
FROM Suppliers;


-- Qusetion 2:Sum of all employee Salaries

SELECT SUM(Salary) AS TotalSalary
FROM suppliers;

-- Qusetion 3:Pice of the cheapest item

SELECT MIN(UnitPrice) AS CheapestPrice
FROM Products;

-- Qusetion 4:Average price of items

SELECT AVG(UnitPrice) AS AveragePrice
FROM Products;

-- Qusetion 5:Price of the most expensive item

SELECT MAX(UnitPrice) AS MostExpensivePrice
FROM Products;


-- Qusetion 6:Supplier ID and number of items supplied

SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID;

-- Qusetion 7:What is the Category ID of each category

SELECT CategoryID, AVG(UnitPrice) AS AveragePrice
FROM products
GROUP BY CategoryID;

-- Qusetion 8:Supplier ID and number of items supplied for suppliers

SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID
HAVING ItemCount >= 5;


-- Qusetion 9:Listing Product ID,product name. and inventory  value

SELECT ProductID,ProductName,UnitPrice * UnitInStock As InventoryValue
FROM products
ORDER BY InventoryValue DESC , ProductName ASC;


