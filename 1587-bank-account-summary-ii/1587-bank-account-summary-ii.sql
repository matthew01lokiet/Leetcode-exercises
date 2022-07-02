SELECT us.name, SUM(tr.amount) AS balance
FROM Users us
JOIN Transactions tr
ON us.account = tr.account
GROUP BY us.name
HAVING SUM(tr.amount) > 10000;
