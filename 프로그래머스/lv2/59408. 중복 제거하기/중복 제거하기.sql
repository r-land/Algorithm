SELECT count(name) as count
from (select distinct name from animal_ins) as a;