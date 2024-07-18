select ANIMAL_TYPE, nvl(NAME, 'No name') as NAME, SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID asc