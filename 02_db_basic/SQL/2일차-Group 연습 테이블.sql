create table t86_group (
    id varchar2(3),
    sal number,
    job_id varchar2(2),
    dept_id number
);  
  
insert into t86_group values('a', 1000, 'SA', 10);  
insert into t86_group values('b', 2000, 'CM', 30);  
insert into t86_group values('c', 3000, 'CM', 20);  
insert into t86_group values('d', 4000, 'LA', 10);  
insert into t86_group values('e', 3000, 'SA', 30);  
insert into t86_group values('f', 2000, 'SA', 10);  

SELECT * FROM T86_GROUP;

SELECT job_id, max(sal)
from T86_GROUP
group by job_id;


--각직무별 사원수

select job_id, count(*)
from T86_GROUP
group by job_id;


select dept_id, job_id, max(sal)
from t86_group
group by dept_id, job_id
order by dept_id, job_id;
























