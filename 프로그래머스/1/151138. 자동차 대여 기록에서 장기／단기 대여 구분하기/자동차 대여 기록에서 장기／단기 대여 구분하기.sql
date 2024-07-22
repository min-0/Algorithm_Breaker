select HISTORY_ID, CAR_ID, to_char(START_DATE, 'yyyy-mm-dd') as START_DATE,
        to_char(END_DATE, 'yyyy-mm-dd') as END_DATE,
case when (END_DATE - START_DATE + 1) >= 30 then '장기 대여'
        else '단기 대여' 
        end as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(START_DATE, 'yyyy-mm') = '2022-09'
order by HISTORY_ID desc