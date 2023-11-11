--Part 1
describe job;
--Part 2
select name from employer where location = "St. Louis City";
--Part 3
drop table job;
--Part 4
select *
from skill
inner join job_skills on skill.id = job_skills.skills_id
where job_skills.jobs_id is not null
order by name asc;
