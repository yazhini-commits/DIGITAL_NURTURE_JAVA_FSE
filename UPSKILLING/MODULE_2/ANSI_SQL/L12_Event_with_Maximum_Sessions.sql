SELECT event_id, COUNT(session_id) AS session_count
FROM Sessions
GROUP BY event_id
HAVING COUNT(session_id) = (
    SELECT MAX(session_count)
    FROM (
        SELECT COUNT(session_id) AS session_count
        FROM Sessions
        GROUP BY event_id
    ) AS session_counts
);
