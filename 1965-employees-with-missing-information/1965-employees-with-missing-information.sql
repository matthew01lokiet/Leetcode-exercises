SELECT employee_id FROM (
    SELECT Em.employee_id FROM Employees AS Em
    WHERE NOT EXISTS (
        SELECT Sa.employee_id FROM Salaries AS Sa
        WHERE Sa.employee_id = Em.employee_id
    )
    UNION
    SELECT Sa.employee_id FROM Salaries AS Sa
    WHERE NOT EXISTS (
        SELECT Em.employee_id FROM Employees AS Em
        WHERE Sa.employee_id = Em.employee_id
    )
) AS missing_data
ORDER BY employee_id ASC;