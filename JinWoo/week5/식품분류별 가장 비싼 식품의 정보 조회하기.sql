SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT 
WHERE CATEGORY IN('국' , '과자' , '김치' , '식용유 ') AND PRICE IN(SELECT MAX(PRICE)
                                                                  FROM FOOD_PRODUCT 
                                                                  GROUP BY CATEGORY)
GROUP BY CATEGORY, PRODUCT_NAME
ORDER BY PRICE DESC
