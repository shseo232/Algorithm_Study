-- 코드를 입력하세요
SELECT
e.REST_ID,e.REST_NAME,e.FOOD_TYPE,e.FAVORITES,e.ADDRESS,ROUND(avg(d.REVIEW_SCORE),2) as SCORE
FROM 
REST_INFO e 
JOIN 
REST_REVIEW d
ON 
e.REST_ID = d.REST_ID
WHERE
e.ADDRESS like '서울%'
GROUP BY
e.REST_ID,e.REST_NAME,e.FOOD_TYPE,e.FAVORITES,e.ADDRESS
ORDER BY SCORE DESC, FAVORITES DESC;
