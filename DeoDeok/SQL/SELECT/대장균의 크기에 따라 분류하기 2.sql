-- 코드를 작성해주세요
WITH ECOLI_DATA  AS (
    SELECT 
        ID,NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS COLONY_NAME
    FROM ECOLI_DATA 
) 
SELECT
    ID,(
    CASE
        WHEN COLONY_NAME = 1 THEN 'CRITICAL'
        WHEN COLONY_NAME = 2 THEN 'HIGH'
        WHEN COLONY_NAME = 3 THEN 'MEDIUM'
        ELSE 'LOW'
        END 
    ) as COLONY_NAME
    FROM 
         ECOLI_DATA
    ORDER BY ID
