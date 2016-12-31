select * from s_emp;
--1.
select name, title, dept_id
from s_emp
where (dept_id = 112 or dept_id = 118) and salary between 1500 and 4000
order by salary desc;

--2.
select name, title, salary
from s_emp
where manager_id is null;


--3.
select name, title, salary
from s_emp
where title like '%부장' and salary >= 3000;

--4.
select dept_id, name, title, salary
from s_emp
where (title like '%부장' or title like '%과장')
		and dept_id in(112,113,117,118) 
		and salary between 2300 and 3000;

--5.
select name, title, salary, start_date
from s_emp
where (title like '%부장' or title like '%과장')
		and to_char(start_date, 'mm') = '03';


--6.
select (salary * 16 + 1000) as year_sal
from s_emp;

--7.
select name || ' ' || title || '의 급여 ' || (salary * 16 + 1000) as year_sal
from s_emp;

--8.
select name, salary
from s_emp
where commission_pct is not null 
		and manager_id is not null 
		and salary >= 2500;
		
--9.
select dept_id, min(salary)
from s_emp
group by dept_id;

--10.
select title, min(salary)
from s_emp
group by title
having title not like '%부장';


--11.
select title, avg(salary)
from s_emp
group by title;

--12.

select title, count(*)
from s_emp
group by title;

--13.
select title, max(salary)
from s_emp
group by title
having max(salary) >= 2000;

--14.
select title, min(salary)
from s_emp
where title not like '%부장'
group by title
order by min(salary) desc;

--15.
select title, avg(salary)
from s_emp
where title not like '사원'
group by title
order by avg(salary);

--16.
select title, sum(salary)
from s_emp
where title not like '사원'
group by title
having sum(salary) >= 2000
order by sum(salary) desc;

--17.
select name, mailid, upper(substr(mailid,1,1)) || lower(substr(mailid,2))
from s_emp;

--18....
select name
from s_emp
where substr(name, 3) is not null;

select name
from s_emp
where length(name) > 2;

--19.
select name, (salary * trunc(months_between(sysdate, start_date))) as total_sal
from s_emp;

--20.....
select name, case when commission_pct is null then '커미션 없음'
			 	  else to_char(commission_pct) 
			 	  end as commission_pct 
from s_emp;

--21.....
select name, title, salary, case when title like '%과장' then salary * 1.15 
			      else salary * 1.1
			      end as new_salary
from s_emp;


select '*' 
from dual;

--22.
select name, salary,
	   lpad(' ', trunc(salary/100) + 1, '*') as graph
from s_emp;


--23.

select dept_id, case when title = '사원' then sum(salary) 
		    	end as 사원,
		     sum(salary) as 부서합계
from s_emp
group by dept_id--, title
order by dept_id;




