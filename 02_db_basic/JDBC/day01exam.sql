select l.city, e.first_name, e.salary
from locations l
inner join departments d
		on l.location_id = d.location_id
inner join employees e
		on d.department_id = e.department_id
where l.city like '%?%' and e.salary >= 15000;

select distinct d.department_name, d.manager_id
from departments d
inner join employees e
		on d.department_id = e.department_id
where e.department_id = 100;

select * from employees;
select * from departments;