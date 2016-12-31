==============================================================
JOIN
==============================================================
--Cartesian Product : 연결조건(증거조건)이 잘못되거나 의도적으로 조건을 주지않은경우
-- m * n의 경과가 출력된다.
SELECT count(*)
FROM employees, departments;

SELECT count(*)
FROM employees;

SELECT last_name, department_name
FROM employees, departments;


SELECT last_name, department_id, departments.department_name --사용 가능하지만 컬럼의 테이블을 명확히 알수없기때문에 권장하지않는다.
FROM employees, departments
WHERE employees.department_id = departments.department_id;


SELECT employees.last_name, 
employees.department_id, 
departments.department_name --테이블이름으로 접근해 컬럼의 위치파악을 쉽게한다.
FROM employees, departments
WHERE employees.department_id = departments.department_id;

--테이블 알리아스 사용하기
SELECT e.last_name, 
e.department_id, 
d.department_name 
FROM employees e, departments d  --테이블이름에 알리아스를 줘서 사용가능하다(길이가길기때문, as는 안되고 공백뒤에 준다.)
WHERE e.department_id = d.department_id;


SELECT d.location_id, d.department_name, l.city
FROM employees e, departments d, locations l
where d.location_id = l.location_id;

select d.*, l.city  --*사용해서 표현가능
from employees e, departments d, locations l
where d.location_id = l.location_id;

select d.*, l.city  --*사용해서 표현가능
from employees e, departments d, locations l
where d.location_id = l.location_id;

select e.salary as sal, e.*  --*사용해서 표현가능 알리아스로 구분해준다.
from employees e;

--canada에서 근무하는 사원의 지역명, 부서명, 사원명 출력하시오.

select d.department_name, l.city, e.last_name
from employees e, departments d, locations l, countries c
where e.department_id = d.department_id 
		and d.location_id = l.location_id
        and  c.country_id = l.country_id
		and c.country_name = 'Canada' ;



--각사원의 job_id에 해당하는 최대 받을 수 있는 급여와 최소 급여가 얼마인지 출력하시오.

select e.job_id, j.job_id, j.min_salary, j.max_salary
from employees e, jobs j
where e.job_id = j.job_id;




--Oracle 9i부터 지원

--테이블 알리아스 사용하기
select 	d.location_id, 
		d.department_name, 
		l.city
from employees e
inner join departments d
		on e.department_id = d.department_id
inner join locations l
		on d.location_id = l.location_id;



--canada에서 근무하는 사원의 지역명, 부서명, 사원명 출력하시오.

select d.department_name, l.city, e.last_name
from employees e
inner join departments d
		on e.department_id = d.department_id 
inner join locations l
		on d.location_id = l.location_id
inner join countries c
		on c.country_id = l.country_id
where c.country_name = 'Canada';		
       
	



--각사원의 job_id에 해당하는 최대 받을 수 있는 급여와 최소 급여가 얼마인지 출력하시오.

select e.job_id, j.job_id, j.min_salary, j.max_salary
from employees e
inner join jobs j
		on e.job_id = j.job_id;



--Non Equijoin 연습
select e.last_name, e.salary, s.grade
from employees e, salgrade s
where e.salary between s.min_sal and s.max_sal;

select e.last_name, e.salary, s.grade
from employees e
inner join salgrade s
		on e.salary between s.min_sal and s.max_sal;

--셀프조인
select 	e.last_name, m.last_name
from	employees e, employees m
where   e.manager_id = m.employee_id;
		
select 	e.last_name, m.last_name
from	employees e
inner join employees m
		on e.manager_id = m.employee_id;

		
--[full | right | left ] outer join, (+)
select e.last_name 사원명, nvl(m.last_name, '관리자없음') 관리자명
from employees e, employees m
where e.manager_id = m.employee_id(+);

select 	e.last_name 사원명, nvl(m.last_name, '관리자없음') 관리자명
from	employees e
left outer join employees m   
		on e.manager_id = m.employee_id;


		
		
==============================================================
SET연산자
==============================================================
--모든데이터를 출력한다.
select no, data
from tc_seta
union all
select no, data
from tc_setb;
		
--중첩된 데이터는 한번만, 정렬해서 출력한다.
select no, data
from tc_seta
union 
select no, data
from tc_setb;
--앞에서 뒤를 뺀 결과를 출력한다.
select no, data
from tc_seta
MINUS
select no, data
from tc_setb;

--앞과 뒤 결과의 공통된 부분만 출력한다.
select no, data
from tc_seta
INTERSECT
select no, data
from tc_setb;

--주의1. 컬럼의 갯수가 동일해야 한다.
select last_name, salary
from employees
union all
select department_name
from departments;
--주의2. 동일한 열에 위치한 데이터는 타입이 같아야 한다.	
select last_name, salary
from employees
union all
select department_id, department_name
from departments;
--주의3.order by절은 제일 마지막절에 위치해야한다.
select last_name, salary
from employees
order by last_name
union all
select department_name, department_id
from departments;
--주의4. 컬럼명은 첫번째 SQL문의 컬럼명이 사용된다.		
select 'data' , last_name 이름, salary 월급
from employees
union all
select 'total', department_name, department_id
from departments;
		

--==============================================================
SubQuery
서브쿼리의 결과행이 하나인것 : 스칼라 서브쿼리, 싱글로우 서브쿼리
서브쿼리의 결과행이 여러개인경우 : 멀티로우 서브쿼리 => 관련된 연산자를 사용해야한다. (IN), (ALL) 
--==============================================================

select avg(salary)
from employees
where department_id = 10;

-- Chen 사원과 같은 부서에 있는 사원들의 평균 급여를 출력하시오.
select avg(salary) --메인쿼리
from employees
where department_id = (select department_id from employees where last_name = 'Chen')--서브쿼리;
		
		
--Chen 사원의 부서번호를 출력하시오		
select department_id 
from employees
where last_name = 'Chen';		
		



select avg(salary) --메인쿼리
from employees
where department_id in (select department_id 
						from employees 
						where last_name = 'King')--서브쿼리의 결과가 여러개가 리턴되면 여러결과를 받을수 있는 연산자를 사용해야한다.;
		

--30번 부서의 평균 급여보다 급여를 많이 받는 사원의 정보를 출력
select last_name
from employees
where  salary  >  (select avg(salary) 
					from employees 
					where department_id = 30);

select last_name, salary
from employees
where  salary  >  (select max(salary) 
					from employees 
					where department_id = 30);

--멀티로우 서브쿼리 연산자 ALL과 ANY
select *
from employees
where  salary  >ALL (select salary  --서브쿼리의 여러결과보다 클때
					 from employees 
					 where department_id = 30);
select *
from employees
where  salary  >ANY  (select salary  --서브쿼리의 여러결과중 하나보다 클때
					  from employees 
				      where department_id = 30);
-->아래 쿼리와 같은 결과를 얻는다.
select *
from employees
where  salary  >  (select min(salary)  --싱글로우 서브쿼리
				   from employees 
				   where department_id = 30);


--각부서에서 가장작은 급여를 받는 사원의 정보

--멀티컬럼 서브쿼리  : 서브쿼리의 결과가 여러개의 컬럼을 리턴
select department_id, last_name, salary
from employees
where salary in (select department_id, min(salary)
				 from EMPLOYEES
				 group by department_id);



--서브쿼리가 사용되는 다양한 위치
insert into tb_board(no, title, writer, content)
values (
	(select max(no) + 1 from tb_board) , 't', 'w', 'c'
	);



select 	e.last_name, 	
	    e.department_id, 
		d.department_name, 
		
from employees e
inner join departments d
		on e.department_id = d.department_id
		
select 	e.last_name,
		e.department_id,
		(select department_name from departments where department_id = e.department_id) department_name
from employees e;


--from 절에서의 서브쿼리
select rownum, last_name, salary
from employees;

select rownum, last_name, salary
from employees
where rownum < 5;

select rownum, last_name, salary
from employees
where rownum = 1;

select rownum, last_name, salary
from employees
where rownum 4;

select rownum, last_name, salary
from employees
where rownum between 1 and 4;

--사원중에서 급여를 많이받는 상위5명을 출력하시오
select last_name, salary 
from employees
where rownum < 6
order by salary desc;


--from절에서의 서브쿼리
select *
from (select * from employees order by salary desc) 
where rownum < 6;

select *
from (select rownum rnum, last_name, salary
		from (select *
				from employees 
				order by salary desc) )	
where rnum between 3 and 4;

--서브쿼리를 이용한 테이블 생성 ->테이블 구조와 데이터를 복사
create table employees_copy 
as
select * from employees;
 
select * from tab;

drop table employees_copy;
--테이블의 구조만 복사
create table employees_copy 
as
select * from employees 
where 1 != 1;

select * from employees_copy;

--테이블에 데이터를 서브쿼리를 이용해서 입력하기
insert into employees_copy
select * from employees;
















