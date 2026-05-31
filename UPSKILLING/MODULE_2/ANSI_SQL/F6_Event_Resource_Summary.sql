SELECT event_id, 
       SUM(CASE WHEN resource_type = 'pdf' THEN 1 ELSE 0 END) AS pdf_count,
       SUM(CASE WHEN resource_type = 'image' THEN 1 ELSE 0 END) AS image_count,
       SUM(CASE WHEN resource_type = 'link' THEN 1 ELSE 0 END) AS link_count,
       COUNT(resource_id) AS total_resources
FROM Resources
GROUP BY event_id;
