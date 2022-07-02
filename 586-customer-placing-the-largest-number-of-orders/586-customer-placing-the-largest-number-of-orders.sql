# Write your MySQL query statement below
SELECT customer_number FROM (
    SELECT customer_number, COUNT(*) FROM Orders
    GROUP BY customer_number
    ORDER BY COUNT(*) DESC
    LIMIT 1
) AS biggest_number_of_orders;