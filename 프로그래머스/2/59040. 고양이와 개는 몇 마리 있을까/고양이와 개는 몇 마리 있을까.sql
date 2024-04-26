-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(*) AS 'count'
FROM animal_ins
group by animal_type
order by animal_type asc;