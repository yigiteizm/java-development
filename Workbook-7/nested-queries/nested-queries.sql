-- Qusetion 1:Most expensive product name

SELECT ProductName
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
FROM products);

-- Qusetion 2:Order ID,shipping name, and shipping adress of orders.alter




SELECT Orders.OrderID, Orders.ShipName, Orders.ShipAdress
FROM Orders
WHERE Orders.ShipVia = (
SELECT ShipperID
FROM Shippers
WHERE CompanyName = 'Federal Shipping'
);



-- 3. Order IDs of orders that ordered "Sasquatch Ale"
SELECT OrderID
FROM `Order Details`
WHERE ProductID = (
  SELECT ProductID
  FROM Products
  WHERE ProductName = 'Sasquatch Ale'
);

-- 4. Name of the employee that sold order 10266
SELECT FirstName, LastName
FROM Employees
WHERE EmployeeID = (
  SELECT EmployeeID
  FROM Orders
  WHERE OrderID = 10266
);

-- 5. Name of the customer that bought order 10266
SELECT CompanyName
FROM Customers
WHERE CustomerID = (
  SELECT CustomerID
  FROM Orders
  WHERE OrderID = 10266
);