--------------------------------------------------------------------
시퀀스

--------------------------------------------------------------------

--시퀀스 생성하기
create sequence s_board_no;
--생성된시퀀스에서 고유번호 얻기 :nextVal
--시퀀스명.nextVal
--시작 : 1, 증가 : 1
 select s_board_no.nextval from dual;
--시퀀스 삭제하기
 drop sequence s_board_no;
 
 --시퀀스를이용한 게시글 등록
 insert into tb_board(no, title, writer, content)
 values (s_board_no.nextVal, '제목', '글쓴이', '내용');
 insert into tb_board(no, title, writer, content)
 values (s_board_no.nextVal, '제목2', '글쓴이2', '내용2');
 insert into tb_board(no, title, writer, content)
 values (s_board_no.nextVal, '제목3', '글쓴이3', '내3용');
 select * from tb_board;
 

--------------------------------------------------------------------
alter : 테이블 변경
--컬럼추가, 컬럼삭제, 컬럼변경(타입,크기,default,not null)
--add :	컴럼 추가시 사용
--drop : 컬럼삭제시
--modify : 컬럼변경시 사용
alter table 테이블명 
add (추가할 컬럼..)
alter table 테이블명 
drop (삭제할 컬럼..)
alter table 테이블명 
modify (변경할 컬럼..)

9i부터 컬럼의 이름변경
alter table 테이블명
rename column A to B;
--------------------------------------------------------------------

create table t_alter (
nama varchar2(10),
age	varchar2(3)
);




select * from t_alter;

desc t_alter;


--email 컬럼추가
alter table t_alter
add (email varchar2(30) not null);

alter table t_alter
rename column nama to name;

alter table t_alter
drop (email);

--set unused column (컬럼을 삭제는 하지않고 사용하지않는방법 )
--drop unused columns

alter table t_alter
modify (age number(3) not null);

insert into t_alter
(name, age) 
values('test', 22);
--데이터가 들어가 있는 컬럼에서 데이터크기를 늘릴수는있지만 줄일때는 오류가 난다.(null 일때만 줄일 수 있다.)
alter table t_alter
modify (age number(5) null);
--컬럼크기감소:null인 경우만 가능함
alter table t_alter
modify (age number(3));


--------------------------------------------------------------------
트랜젝션(transation)
하나의 트랜젝션 : 논리적으로 묶인 여러개의 DML 작업들
commit
savepoint
rollback
--------------------------------------------------------------------

create table t_tran(id varchar2(3),
					msg varchar2(100)
					);



--------------sql명령창1---------------
SQL> conn hr/hr
연결되었습니다.
SQL> select * from t_tran;

선택된 레코드가 없습니다.

SQL> insert into t_tran values('a', 'aaa');

1 개의 행이 만들어졌습니다.

SQL> select * from t_tran;

ID
------
MSG
------

a
aaa


SQL> commit;

커밋이 완료되었습니다.

SQL> update t_tran set msg = 'bbb' where id = 'a';

1 행이 갱신되었습니다.

SQL> select * from t_tran;

ID
------
MSG
------

a
bbb


SQL> select * from t_tran;

ID
------
MSG
------

a
bbb


SQL> commit;

커밋이 완료되었습니다.

SQL> select * from t_tran;

ID
------
MSG
------

a
bbb


SQL> select * from t_tran;

ID
------
MSG
------

a
ccc


SQL>

								
									
--------------sql명령창2---------------
SQL> conn hr/hr
연결되었습니다.
SQL> select * from t_tran;

ID
------
MSG
------

a
aaa


SQL> select * from t_tran;

ID
------
MSG
------

a
aaa


SQL> update t_tran set msg = 'ccc' where id='a';

1 행이 갱신되었습니다.

SQL> select * from t_tran;

ID
------
MSG
------

a
ccc


SQL> commit;

커밋이 완료되었습니다.

SQL> select * from t_tran;

ID
------
MSG
------

a
ccc


--------------------------------------------------------------------
JDBC
--------------------------------------------------------------------
1. 프로젝트에 오라클드라이버(jar파일) 이동
2. 빌드설정 (properties-> java Build Path -> Libraries 
			->ADD JARs(자바workspace 안에있는 라이브러리사용시 < Add external은 이외의 경로참조시>))

--JDBC 프로그램단계
import java.sql.*

0.class.forName(..) -jdbc드라이버로딩
1.Driver manager - 객체얻어오기
2.connection - 연결
3.statement - sql처리가능하게
4.ResultSet(select) - 받아온 결과를 담는 클래스
5.close





select * from tb_account;







 create table tb_account (
 	id varchar2(10),
 	money number(8)
 );

insert into tb_account(id, money) values('a', 10000);
 insert into tb_account(id, money) values('b', 20000);

update tb_account set money = 100000 where id = 'a';
update tb_account set money = 200000 where id = 'b';



create table mybatis_member(
    id      varchar2(20),
    name    varchar2(20),
    addr    varchar2(100),
    email   varchar2(20),
    join_date date default sysdate
);

insert into mybatis_member values('member-1', 'sbc',    'seoul',    'sbc@yahoo.co.kr', sysdate);
insert into mybatis_member values('member-2', 'spring', 'busan',    'abc@yahoo.co.kr', sysdate);
insert into mybatis_member values('member-3', 'jsp',    'daejeon',  'ddd@yahoo.co.kr', sysdate);
insert into mybatis_member values('member-4', 'spring', 'gyeonggi', 'eee@yahoo.co.kr', sysdate);

commit;

select * from mybatis_member;

drop table mybatis_member;












