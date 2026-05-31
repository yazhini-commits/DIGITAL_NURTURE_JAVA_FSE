SELECT u.user_id, u.full_name, u.email
FROM Users u
WHERE u.user_id NOT IN (
    SELECT user_id 
    FROM Registrations 
    WHERE registration_date >= DATE_SUB(CURDATE(), INTERVAL 90 DAY)
);
