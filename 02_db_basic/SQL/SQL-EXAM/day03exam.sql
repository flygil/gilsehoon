--1.
SELECT job_id, max(salary), min(salary)
FROM EMPLOYEES
GROUP BY job_id
HAVING job_id LIKE 'SA%';

--2.
SELECT job_id, max(salary) max_sal 
FROM EMPLOYEES
GROUP BY job_id
ORDER BY max_sal DESC;

--3.
SELECT employee_id, first_name, salary
FROM employees e
INNER JOIN jobs j
		ON e.job_id = j.job_id
WHERE salary BETWEEN 
			(SELECT min_salary FROM jobs WHERE job_id = 'IT_PROG' )
			AND (SELECT max_salary FROM jobs WHERE job_id = 'IT_PROG' );


--4.
SELECT e.first_name 이름, e.last_name 성, e.salary 연봉
FROM employees e
INNER JOIN jobs j
		ON e.job_id = j.job_id
WHERE job_title = 'Sales Representative' 
		AND (e.salary BETWEEN 9000 AND 10000)
ORDER BY e.first_name;
			
--5.
SELECT 	e.employee_id, 
		e.first_name, 
		j.job_title, 
		d.department_name
FROM employees e
INNER JOIN departments d
		ON	e.department_id = d.department_id
INNER JOIN locations l
		ON	d.location_id = l.location_id
INNER JOIN jobs j
		ON e.job_id = j.job_id
WHERE l.city = 'Seattle';


--6.
SELECT 	j.job_title 업무명,
		sum(salary) 연봉
FROM employees e
INNER JOIN jobs	j
		ON e.job_id = j.job_id
GROUP BY job_title
HAVING sum(salary) > 30000
ORDER BY 연봉 DESC;

--7.
SELECT 	e.last_name 이름, 
		e.salary 연봉
FROM employees e
INNER JOIN employees m
		ON e.employee_id = m.employee_id
WHERE e.salary > (SELECT m.salary 
					FROM employees m
					WHERE e.manager_id = m.employee_id);

--8.
SELECT 	e.employee_id 사번, 
		e.first_name 이름, 
		d.department_name 부서명,
		(SELECT m.first_name 
					FROM employees m
					WHERE e.manager_id = m.employee_id) as 매니저
from employees e
inner join departments d
		on e.department_id = d.department_id
inner join employees m
		on e.employee_id = m.employee_id;

					
--9.
SELECT 	e.employee_id 사번, 
		e.first_name 이름,
		nvl((SELECT m.first_name
					FROM employees m
					WHERE e.manager_id = m.employee_id) ,'관리자없음') 
FROM employees e
INNER JOIN employees m
		ON e.employee_id = m.employee_id
WHERE e.first_name like '%v%';
					
					
--10.		
select 	e.employee_id, 
		e.last_name,
		e.hire_date
from employees e
inner join employees m
		on	e.employee_id = m.employee_id
where e.hire_date < (select m.hire_date 
					 from employees m 
					 where e.manager_id = m.employee_id)
order by e.hire_date; 
					
--11.?
select 	m.employee_id,
		m.last_name,
		(select count(*) from employees m )	
from employees m
inner join employees e
		on m.employee_id = e.employee_id
where  (select e.manager_id, count(*) from employees e 
						inner join employees m
								on e.employee_id = m.employee_id
								group by department_id
								having e.manager_id = m.employee_id;) >= 8; 	
					

								
								
								select last_name,count(*) from employees;
--12.
select 	e.employee_id 사번, 
		e.last_name 이름,
		e.salary 급여,
		e.department_id 부서번호,
		(select avg(e_avg.salary)
					from employees e_avg
				group by e_avg.department_id
				having e.department_id = e_avg.department_id) 부서평균급여
from employees e
inner join employees e_avg
		on e.employee_id = e_avg.employee_id
where e.salary > (select avg(e_avg.salary)
					from employees e_avg
				group by e_avg.department_id
				having e.department_id = e_avg.department_id)
order by e.salary desc;

--13.
select e.first_name 이름, e.salary 급여 ,j.job_title 부서명 
from employees e
inner join jobs j 
		on e.job_id = j.job_id
where j.job_title like 'Sales%' 
	 and e.salary > (select avg(e.salary) 
	from employees e 
	where e.department_id = '100');


--14.?

select l.city 도시, 
		avg(e.salary) 급여
		-- 근무인원수
from locations l
inner join departments d
		on l.location_id = d.location_id
inner join employees e
		on d.department_id = e.department_id
group by l.city
having  (select city, count(*) 
		from locations l 
		group by city;) > 10;






