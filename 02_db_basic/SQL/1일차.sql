--현재사용자의 전체 테이블 목록보기
SELECT * from tab;

-- CREATE : 테이블생성하기
-- 테이블명, 컬럼명은 내부적으로 대문자로 관리된다.(별도가 처리가 없는경우)
CREATE TABLE 테이블명 (컬럼명 타입 (크기), .., 컬럼명 타입 (크기));
	컬럼명 타입(크기) 제약조건()
	컬럼명 타입(크기) 
	컬럼명 타입(크기) 
	컬럼명 타입(크기) 

CREATE TABLE Member -> 내부적으로 MEMBER
테이블명 규칙 	=> t_, tb_, tc_등을 붙인다.
		  	=> 단어와 단어사이에 "_"(언더바)를 추가한다.
		  	=> 단어를 축약해서 사용할 경우 3자 또는 4자를 사용함.	
		  	
CREATE TABLE TB_board (no number(6) constraint pk_no primary key, 
TITLE varchar2(200), not null
WRITER char(30), not null
CONTENT varchar2(4000), not null
REG_DATE DATE default sysdate 
 );
 
--테이블 삭제
 DROP TABLE Tb_board;
 
 --제약조건 : 	테이블레벨 제약조건(모든선언후 마지막에 하는 제약조건) - constraint 이름
 			컬럼레벨 제약조건(컬럼명 뒤에 바로 붙는 제약조건)
 -- 1. PK : Primary Key	- 하나의 테이블에 하나의 키만 존재함 => UNIQUE + NOT NULL
 -- 2. UNIQUE 			- 테이블내에서 값이 고유해야한다.(not null) 
 -- 3. NN : NOT NULL	- NULL값을 허용하지 않는다.
 -- 4. FK : FOREIGN KEY	- 다른테이블 또는 자기 자신의 다른 컬럼 값을 참조할때 사용.
 -- 5. CK : CHECK		- 값의 입력시 제약 설정.
 -- 주의 여러개의 컬럼을 묶어서 제약조건을 설정하려면 테이블레벨을 이용해야 함.
 CREATE TABLE TB_board (no number(6), 
TITLE varchar2(200), not null
WRITER char(30), not null
CONTENT varchar2(4000), not null
REG_DATE DATE default sysdate,
constraint pk_no primary key(no, writer)
 );
 
 
 
 -- default : 값이 입력되지 않은 경우 기본으로 값을 설정
 
 --테이블명 변경하기
 RENAME A(변경전 테이블명) TO B(변경할 테이블명);
 
 --생성된 테이블의 구조를 확인
 describe 테이블명;
 desc 테이블명;
 
 
 
-- INSERT : 데이터 입력
-- 입력시 주의할점 : 문자를 입력할 때는 반드시 " ' " 으로 묶는다.
 INSERT INTO TB_board(no,title,writer,content,reg_date) VALUES(1,'제목','글쓴이', '내용', sysdate);
 
 
 INSERT INTO TB_board(no,title,writer,content) VALUES(2,'제목2','글쓴이2', '내용2');
 
 --no 컬럼은 primary key로 설정되었기 때문에 중복된 데이터는 허용하지 않는다.
 INSERT INTO TB_board(no,title,writer,content) VALUES(2,'제목2','글쓴이2', '내용2');

--ORA-01400: NULL을 ("HR"."TB_BOARD"."CONTENT") 안에 삽입할 수 없습니다
 INSERT INTO TB_board(no,title,writer) VALUES(4,'제목4','글쓴이4');
 
 --컬럼명이 별도로 설정되지 않은 경우 모든 컬럼에 데이터 입력(권장하지 않음)
 INSERT INTO TB_board VALUES(4,'제목4','글쓴이4', '내용4', sysdate);
 
 --복구 불가능 데이터 삭제
 truncate table tb_board;
 
 --데이터 수정 : UPDATE
 UPDATE 테이블명 SET 컬럼명 = '값' 
 					,컬럼명 = '값'..
 [조건절(WHERE)]
 
--1번 게시물의 내용을 "추운날"로 변경합니다.
UPDATE tb_board
	SET content = '추운날'
		WHERE no = 1;
		
--2번 게시물의 제목을 "배근영" 내용을 "바보"로 변경합니다.
 UPDATE tb_board SET title = '배근영', content = '바보' WHERE no = 2;
 
 --데이터 삭제 : delete
 DELETE
 	FROM 테이블명
 [WHERE 조건절]
 
 --2번게시물 삭제
 DELETE 
 FROM tb_board 
 WHERE no = 2;
 
 
 
 ===========================================================================
 SELECT 절
 ===========================================================================
 SELECT * 		--컬럼명
 FROM TB_board;	--테이블명
 
 
 SELECT no, title 
   FROM tb_board;  
   
SELECT employee_no, first_name
FROM employee;  

--산술 연산자 사용
--사원의 연봉을 출력하시요 (연봉 : 급여 * 15)
SELECT last_name, salary, salary * 15
  FROM employees;
 
 
 --컬럼의 별칭(alias) 사용 : 컬럼 별칭, 컬럼 as 별칭
 SELECT last_name 이름, salary as 급여, salary * 15 as 연봉
  FROM employees;
 
 --합성연산자(||) : 자바에서의 "+" 역할
 String age = "홍";
 int age = 29;
 
 String msg = name + "님의 나이는" + age + "입니다.";
 
 -- ???사원의 급여는 ???입니다.
 사원정보 : employees
 출력컬럼 : last_name, salary
  
SELECT  
last_name || '사원의 급여는' || salary || '입니다.' AS 사원정보
 FROM employees;
 
 
 ===========================================================================
 WHERE 절
 ===========================================================================
 --사원중에서 급여가 10000 이상인 사원의 정보를 출력하세요
SELECT last_name, salary 
FROM employees 
WHERE salary >= 10000; 

--사원정보를 출력합니다. 단, 100번 부서가 아닌 사원들만 출력합니다.

SELECT * 
FROM employees 
WHERE department_id != 100;

--주의* 데이터의 비교는 대소문자가 구분된다.
SELECT * 
FROM employees 
WHERE last_name = 'King';
 
 
 --사원의 부서가 100번 부서이면서 급여가 10000이상
SELECT * 
FROM employees 
WHERE department_id = 100 
AND salary >= 10000;
 
 --사원의 부서가 100번 또는 90번인 사원의정보
 SELECT * 
 FROM employees 
 WHERE department_id = 100 
 OR department_id = 90;
 
 --사원의부서가 100번또는 90번에 포함되어 있으면서 급여가 10000이상인 사원의 정보를 출력
 SELECT employee_id, last_name, salary, department_id 
 FROM employees 
 WHERE (department_id = 100 OR department_id = 90) 
 AND salary >= 10000;
 
 
 --사원중 급여가 10000이상인 사람의 수
 SELECT count(*)
 FROM employees
 WHERE salary >= 10000;
 
 
 
 
 
 
 
 
 