-- Qusetion 1:

--products

-- Qusetion 2:

SELECT ProductID, ProductName, UnitPrice
FROM Products;

-- Qusetion 3:

SELECT ProductID, ProductName, UnitPrice
FROM Products
ORDER BY UnitPrice ASC;

-- Qusetion 4:

SELECT *
FROM Products
WHERE UnitPrice <= 7.50;

-- Qusetion 5:

SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Qusetion 6:

SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;

-- Qusetion 7:

SELECT *
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnOrder > 0
ORDER BY ProductName;

-- Qusetion 8:

-- Categories

-- Qusetion 9:

SELECT *
FROM Categories;

-- Qusetion 10:

SELECT * 
FROM Products
WHERE CategoryID = 8;

-- Qusetion 11:

SELECT FirstName, Lastname
FROM employees;


-- Qusetion 12:

SELECT *
FROM Employees
WHERE Title LIKE '%Manager%' ;

-- Qusetion 13:

SELECT DISTINCT Title
FROM Employees;

-- Qusetion 14:

SELECT *
FROM employees
WHERE Salary BETWEEN 2000 and 2500;

-- Qusetion 15:
SELECT*

FROM Suppliers;

-- Qusetion 16:
SELECT *
FROM Products
WHERE SupplierID = 4;