SELECT us.name, tr.travelled_distance FROM (
    SELECT us.id, ISNULL(SUM(ri.distance), 0) AS travelled_distance
    FROM Users us
    LEFT JOIN Rides ri
    ON us.id = ri.user_id
    GROUP BY us.id
) AS tr
JOIN Users us
ON us.id = tr.id
ORDER BY tr.travelled_distance DESC, us.name;