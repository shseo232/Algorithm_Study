WITH first_gen AS (
    SELECT 
        ID,
        PARENT_ID
    FROM 
        ECOLI_DATA 
    WHERE PARENT_ID IS NULL
),
second_gen AS (
    SELECT
        a.ID,
        a.PARENT_ID
    FROM
        ECOLI_DATA a
    JOIN first_gen b
    ON a.PARENT_ID = b.ID
)

SELECT 
    a.ID
FROM 
    ECOLI_DATA a
 JOIN 
    second_gen b
ON 
     b.ID = a.PARENT_ID;
