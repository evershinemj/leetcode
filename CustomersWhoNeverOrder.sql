# Write your MySQL query statement below
SELECT Name AS Customers FROM Customers WHERE Id <> ALL (SELECT CustomerId FROM Customers INNER JOIN Orders ON Customers.Id=Orders.CustomerId);
# SELECT Name AS Customer FROM Customers;
# SELECT Name FROM Customers INNER JOIN Orders ON Customers.Id=Orders.CustomerId;
