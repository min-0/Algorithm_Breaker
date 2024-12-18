select count(*)
from USER_INFO
where to_char(JOINED,'YYYY') = '2021'
and AGE >= 20 and AGE <= 29;