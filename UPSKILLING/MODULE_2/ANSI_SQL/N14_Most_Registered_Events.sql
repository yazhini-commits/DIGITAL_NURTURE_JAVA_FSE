SELECT event_id, COUNT(registration_id) AS total_registrations
FROM Registrations
GROUP BY event_id
ORDER BY total_registrations DESC
LIMIT 3;
