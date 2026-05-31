SELECT user_id, event_id, COUNT(registration_id) AS registration_count
FROM Registrations
GROUP BY user_id, event_id
HAVING COUNT(registration_id) > 1;
