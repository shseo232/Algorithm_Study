SELECT D.ID	,D.EMAIL,D.FIRST_NAME,D.LAST_NAME
FROM SKILLCODES S
JOIN DEVELOPERS D
ON D.SKILL_CODE & S.CODE >0
WHERE S.CATEGORY = 'Front End'
GROUP BY D.ID,D.EMAIL,D.FIRST_NAME,D.LAST_NAME --Front 기술을 여러개 보유한 경우 거르기 위함 
ORDER BY D.ID;
