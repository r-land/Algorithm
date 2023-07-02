-- 코드를 입력하세요
SELECT b.book_id, a.author_name, to_char(published_date, 'yyyy-MM-dd') as PUBLISHED_DATE
from book b, author a
where b.author_id = a.author_id
and b.category like '경제'
order by b.published_date;