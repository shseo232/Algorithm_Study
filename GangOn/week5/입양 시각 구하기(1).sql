SELECT HOUR(DATETIME) as HOUR, COUNT(*)
FROM ANIMAL_OUTS
GROUP BY HOUR
HAVING(HOUR >= 9 and HOUR < 20)
ORDER BY HOUR;
