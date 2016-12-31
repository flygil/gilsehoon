=========================================================
WHERE
=========================================================

-- BETWEEN A AND B : A와 B 사이의 값을 선택한다.(A, B 포함)

-- 급여가 10000 이상이고 15000 이하인 사원의 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE SALARY >= 10000
   AND SALARY <= 15000;

-- 위와 아래의 코드가 같음. 따라서 BETWEEN 을 사용하면 편함.

SELECT *
  FROM EMPLOYEES
 WHERE SALARY BETWEEN 10000 AND 15000;

 
-- 사원의 부서가 90, 100, 110, 120, 130, 150 에 소속된 사원의 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 90 
    OR DEPARTMENT_ID = 100
    OR DEPARTMENT_ID = 110
    OR DEPARTMENT_ID = 120
    OR DEPARTMENT_ID = 130
    OR DEPARTMENT_ID = 150;
    
-- 위의 코드와 아래의 코드가 같음, 따라서 아래와 같이 IN 쓰고 괄호 안에 쓰면 편함.

SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (90, 100, 110, 120, 130, 150);



-- LIKE 연산자 : 컬럼명 LIKE '패턴', %(0개 이상 문자), _(한개 문자)

-- 사원의 이름이 L로 시작하는 사원 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE 'L%';

-- 이메일이 D로 시작하고 T로 끝나는 사원의 정보
SELECT *
  FROM EMPLOYEES
 WHERE EMAIL LIKE 'D%T';

-- 이름이 'KING' 인 사원의 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE LAST_NAME = 'King';

-- IS NULL 연산자
-- NULL 은 "미정의 값"
-- NULL 과의 산술연산의 결과는 NULL
-- NULL 과의 비교연산의 결과는 FALSE
SELECT LAST_NAME, SALARY, COMMISSION_PCT
  FROM EMPLOYEES;

-- 커미션을 받지 않는 사원의 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NULL;

 -- 커미션을 받는 사원의 정보를 출력
SELECT *
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;

-- NVL(컬럼, 0) -> 값이 NULL 이면 , 이후의 걸로 대체 
-- 사원의 연봉을 출력합니다.
-- 단 연봉은 급여 * 15 + (급여 * 15 * 커미션)
SELECT LAST_NAME,
	   SALARY,
	   SALARY * 15 + SALARY * 15 * NVL(COMMISSION_PCT, 0) AS YEAR_SAL
  FROM EMPLOYEES;


=========================================================
ORDER BY : ASC(오름차순), DESC(내림차순)
ORDER BY 표현식 | 컬럼명 [ASC(디폴트 : 생략가능)] | DESC(생략 불가능)
=========================================================

-- 급여가 높은 사원부터 화면에 출력화시오.
SELECT *
  FROM EMPLOYEES
 ORDER BY SALARY DESC;


-- 급여가 낮은 사원부터 화면에 출력화시오.
SELECT *
  FROM EMPLOYEES
 ORDER BY SALARY;
 
-- 사원의 정보를 출력합니다.(이름, 부서번호, 급여)
-- 단, 부서번호 순으로 출력하시오.
-- 부서번호가 같은 사원들은 급여순으로 출력합니다.
SELECT LAST_NAME, DEPARTMENT_ID, SALARY
  FROM EMPLOYEES
 ORDER BY DEPARTMENT_ID, SALARY;


 -- DISTINCT : 결과에서 중복된 결과를 제거
SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES;

-- 사원의 정보를 출력합니다. 단, 연봉이 많은 사원부터 출력하시오.
SELECT LAST_NAME,
	   (SALARY * 15 + SALARY * 15 * NVL(COMMISSION_PCT, 0)) AS YEAR_SAL
  FROM EMPLOYEES
 ORDER BY YEAR_SAL DESC;

 
=========================================================
GROUP BY : 데이터를 소그룹으로 묶는다.

그룹 함수 : 여러개의 데이터를 받아서 하나의 결과를 반환
그룹함수들 자체적으로 NULL값을 배제하고 계산함.
괜히 NVL 쓸 필요 없음.
COUNT(표현식 | 컬럼명), SUM(표현식 | 컬럼명), MAX(표현식 | 컬럼명)
MIN(표현식 | 컬럼명), AVG(표현식 | 컬럼명), 
===========================================================

SELECT COUNT(LAST_NAME), SUM(SALARY), MAX(SALARY), MIN(SALARY), AVG(SALARY),
	   SUM(COMMISSION_PCT)
  FROM EMPLOYEES;

-- 50번 부서의 사원들의 급여중에서 가장 많은 급여가 얼마인지 출력
SELECT MAX(SALARY)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 50;

-- 각 부서별 최대 급여를 화면에 출력하시오.
-- 최대급여가 10000이상인 부서를 대상으로
-- 단, 최대급여가 높은 부서부터 출력
SELECT DEPARTMENT_ID, MAX(SALARY) max_sal
  FROM EMPLOYEES
  WHERE MAX(SALARY) >= 10000 -- 오류발생함
  GROUP BY DEPARTMENT_ID
  ORDER BY max_sal DESC;
  
  
  
===========================================================
HAVING : 그룹에 대한 제약을 처리한다.(조건)
===========================================================

SELECT DEPARTMENT_ID, MAX(SALARY) max_sal
  FROM EMPLOYEES
  GROUP BY DEPARTMENT_ID
  HAVING MAX(SALARY) >= 10000 
  ORDER BY max_sal DESC;

--부서별 평균급여를 출력
--단, 100보다 큰부서제외, 부서 평균급여가 5000이상 부서만 출력
--부서번호순으로


SELECT department_id, avg(salary) as avg_sal
FROM employees
WHERE department_id <= 100 
group by department_id
having avg(salary) >= 5000
order by department_id;


--실행순서
FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY



===========================================================
내장함수 : 오라클에서 제공하는 함수
===========================================================

--문자함수

select last_name, lower(last_name), upper(last_name), concat(last_name, '사원') --합성연산자와 같다.last_name || '사원'
from employees;

select last_name, first_name, concat(upper(last_name), first_name) 
from employees;

select last_name,
		substr(last_name, 1, 2),
		'20161229',
		substr('20161229',1,4),substr('20161229',5,2),substr('20161229',7,2)
from employees;

select last_name, length(last_name),
		lpad(last_name, 10, '*'), rpad(last_name, 10, '*') --lpad와 rpad 각각 왼쪽, 오른쪽에 지정한 크기만큼 원하는 문자를 삽입
from employees 

select last_name,
		translate(last_name, 'AB', 'uk'), 	--문자당바꾸기 : A를 u로 B를 k로 바꾼다
		replace(last_name, 'AB', 'uk')  	--AB를 찾아 uk로 바꾼다.
from employees;


--숫자형 함수
select 'a'
from employees
where department_id = 30;


select abs(100), abs(-100)     --테이블의 크기만큼 결과값이 반환된다.
from employees;

select abs(100), abs(-100)
from dual;                      --dual 테스트용 더미테이블


select ceil(1.1), floor(1.1), sign(-12), sign(0), sign(12) -- ceil 입력값보다 크거나 같은 가장작은정수, 
from dual;													--floor 입력값보다 작거나같은 가장작은정수, sign() 입력값의 양수,음수,0 값을 판별

select round(73.727),round(73.727, 2),round(73.727, -2),  -- round반올림, trunc버림 //+는 소수점오른쪽으로 //-는 소수점을 왼쪽으로 각각 이동
		trunc(73.727),trunc(73.727, 2),trunc(73.727, -2)
from dual;


--날짜형 함수

select sysdate, add_months(sysdate, 1), add_months(sysdate, -1)
from dual;


--각 사원의 입사일로 부터 1년이 되는 날짜를 출력하시오.
select employee_id, add_months(hire_date, 12)
from employees;

select last_name, months_between(sysdate, hire_date)
from employees;

select sysdate, last_day(sysdate)
from employees;

--날짜 + 숫자 => 날짜, 날짜 - 숫자 => 날짜, 날짜 - 날짜 => 숫자
select sysdate + 7, sysdate - 7, sysdate + 5/24
from dual;

--각사원의 근무일수를 출력
select last_name, trunc(sysdate -  hire_date)
from employees;

--변환형 함수

-- to_date : 문자 -> 날짜

-- to_char : 날짜 -> 문자

-- to_number : 날짜 -> 문자, 숫자 -> 문자

select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'),
		to_date('2016-11-20', 'yyyy-mm-dd')
from dual;

insert into tb_board(no, title, writer, content, reg_date) 
values(4, 'a', 'b', 'c', to_date('2011-09-17', 'yyyy-mm-dd'));

select * from tb_board;

--패턴문자 : 9(자리수), 0(자리수- 남는 자리에 0을 표시), ","
select to_char(1000000000, '999,999,999,999'),
		to_number('51,000', '99,999')
from dual;

select last_name
from employees
where to_char(hire_date, 'mm') = to_char(sysdate, 'mm');


--기타함수 : decode, case ~ end - 기본적인 통계정보 추출시..

select job_id, decode(job_id, 'IT_PROG', '개발자' 
							 ,'SA_MAN', '세일즈'   --같은지만 비교 가능
							 ,'그냥 직원') as job_type
from employees;


select job_id, 
		case job_id when 'IT_PROG' then '개발자' 
					when 'SA_MAN' then '세일즈'   --같은지만 비교 가능
					else '그냥 직원'
	    end as job_type
from employees;


select job_id, 
		case when job_id = 'IT_PROG' then '개발자' 
			 when job_id = 'SA_MAN' then '세일즈'   --같은지만 비교 가능
					else '그냥 직원'
	    end as job_type
from employees;


--사원의 급여에 따라서 다음과 같이 출력하는 쿼리 작성
--급여가 10000 이상일 경우 "우후..."
--급여가 5000 이상일 경우 "아이..."
--급여가 5000 미만일 경우 "에이..."

select last_name, salary,
		case when salary >= 10000 then '우후...'
		     when salary >= 5000 then '아이...'
			 else '에이...'
		end as reaction
from employees;






select * from employees;











 