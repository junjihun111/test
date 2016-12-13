select * from member


insert into health_member values(1,);

---------------------------------

create table health_member
(
	member_no number(5) primary key,
	shooes_no number(4) unique,
	member_name varchar2(20) not null,
	member_phonemiddle varchar2(20),
	member_phoneend varchar2(20),
	member_startDay DATE not null,
	member_endDay DATE not null,
	member_birthDay DATE,
	member_address varchar2(100),
	member_email varchar2(50),
	member_codeID varchar2(50) not null	
)

create table manager(
   manager_id varchar2(20) primary key,
   manager_pw varchar2(20),
   serial_num varchar2(20),
   manager_email varchar2(20)
);

create table health_shooes
(
	shooes_no number(4) primary key,
	member_no number(5) constraint health_fk8 references health_member on delete cascade,
	shooes_startDay DATE not null,
	shooes_endDay DATE not null
)

create table attendance(
	member_no number(5) constraint health_fk2 references health_member on delete cascade,
	member_name varchar2(30),
	attendance_date DATE
)

create table codetable(
	CODE varchar2(50) primary key,
	CODEOPTION varchar2(20),
	CODEVALUE varchar2(20),
	EXPLAGIN varchar2(20)
)


create table product
(
	product_no number(5) primary key,
	product_name varchar2(50) not null,
	product_price number(5) not null,
	product_size number(5) not null,
	CODE varchar2(50) not null,
	product_color varchar2(50) not null,
	product_amount number(5) not null,
	product_explain varchar2(50) not null,
	image_Name varchar2(40)
)

create table shoppingbasket(
	product_no number(5) constraint health_fk3 references product,
	member_no number(5) constraint health_fk4 references health_member,
	shoppingbasket_count number(5),
	product_name varchar2(20)
)

create table orderation(
	orderation_no varchar2(20) primary key,
	product_no number(5) constraint health_fk5 references product not null,
	buyername varchar2(20) not null,
	phone2 varchar2(20) not null,
	phone3 varchar2(20) not null,
	orderation_address varchar2(30) not null,
	postalnumber varchar2(40) not null,
	CODE varchar2(40) not null,
	orderation_price number(20) not null,
	orderation_check varchar2(3),
	image_name varchar2(20)
)



create sequence operator_tb_no_seq;
create sequence operator_tb_no_count;

create table orderer(
	orderation_no varchar2(20) constraint health_fk6 references orderation,
	member_no number(5) constraint health_fk7 references health_member,
	orderername varchar2(30),
	orderercount varchar2(4),
	password varchar2(20),
	order_writer varchar2(20)
)

create table product_option(
	product_no number(5) constraint health_fk10 references product,
	color varchar2(50),
	productsize varchar2(50),
	optiontion varchar2(50)
)

create table color
(
	color varchar2(50) 
)


create sequence board_tb_no_seq;
create sequence board_tb_no_count;

create table publicBoard(
	board_no number(20) not null primary key,
	board_header varchar2(50) not null,
	board_name varchar2(50) not null,
	board_content varchar2(50) not null,
	board_date DATE not null,
	board_count number(20) not null,
	board_password varchar2(50) not null,
	board_writer varchar2(50) not null
)

create table operatorBoard(
	board_no number(20) not null,
	board_header varchar2(50) not null,
	board_name varchar2(50) not null,
	board_content varchar2(50) not null,
	board_date DATE not null,
	board_count number(20) not null,
	board_password varchar2(50) not null,
	board_writer varchar2(50) not null
)

create table qnaboard
(no number,
 title varchar2(100),
 contents varchar2(4000),
 writer varchar2(20),
 wdate date,
 grp number,
 seq number,
 lvl number

 );
 
 create table dagle(
	board_no number(20) constraint health_fk15 references publicBoard,
	content varchar2(50),
	board_date DATE,
	board_count number(20),
	board_writer varchar2(50),
	board_password varchar2(20)
)

--------------------------------------


select * from dagle

drop table dagle

select p.board_no, p.board_header, p.board_name, p.board_content
		,p.board_date, p.board_count, p.board_password, p.board_writer
		, d.board_no, d.content, d.board_date, d.board_count, d.board_writer
		from PUBLICBOARD p, DAGLE d
		where p.board_no=d.board_no(+)
		and p.board_no=1
		
		select p.board_no, p.board_header, p.board_name, p.board_content
		,p.board_date, p.board_count, p.board_password, p.board_writer
		, d.board_no, d.content, d.board_date, d.board_count, d.board_writer
		from PUBLICBOARD p, DAGLE d
		where p.board_no=d.board_no(+)
		and d.board_no=1

		select * from dagle

drop table dagle

drop table manager

insert into manager values('manager','pw','1592','fnjdk@naver.com');

select * from MANAGER

delete from dagle

delete from publicboard

select count(board_no) from publicBoard where board_name='aaaaaa'
select * from PUBLICBOARD



drop table codetable


select code,codeOption,codeValue,explagin
from codetable
where CODEVALUE = '쇼핑'

select codeOption
from codetable
where CODEVALUE = '말머리'


select count(board_no) from publicBoard where board_name = '공지사항제목'
	
select count(board_no) from publicBoard where board_writer = '작성자'

select count(board_no) from operatorBoard where board_name='공지사항제목';

select * from publicBoard

운동기구/ 운동복/ 영양제

insert into codetable values('A', '제품', '말머리', '말머리이다');
insert into codetable values('B', '배송', '말머리', '말머리이다');
insert into codetable values('C', '고객', '말머리', '말머리이다');

insert into codetable values('D', '운동기구', '쇼핑', '운동기구');
insert into codetable values('E', '운동복', '쇼핑', '운동복');
insert into codetable values('F', '영양제', '쇼핑', '영양제');

select * from CODETABLE;

drop table QA



select QA_no , QA_name, QA_identificationnumber, QA_order, QA_class from QA

insert into QA values (1,'안녕하세요',1,1,0)







select * from PUBLICBOARD

insert into dagle values(1,'나다',sysdate,0,'전지훈');
insert into dagle values(1,'나다',sysdate,0,'전지훈');
insert into dagle values(1,'나다',sysdate,0,'전지훈');
insert into dagle values(1,'나다',sysdate,0,'전지훈');
insert into dagle values(1,'나다',sysdate,0,'전지훈');\
insert into dagle values(1,'sdfsd',sysdate,0,'전지훈');


select p.board_no, p.board_header, p.board_name, p.board_content
		,p.board_date, p.board_count, p.board_password, p.board_writer
		, d.board_no, d.content, d.board_date, d.board_count, d.board_writer
from PUBLICBOARD p, dagle d
where p.board_no=d.board_no(+) and d.board_no=1;



select board_no, board_header, board_name, board_content, board_date, board_count, board_password
		from publicBoard
		

select board_no, board_header, board_name, board_content, board_date, board_count, board_password
		from publicBoard
	where board_name='공지사항제목'
	
select board_no, board_header, board_name, board_content, board_date, board_count, board_password
		from publicBoard
	where board_password='1111'

delete from PUBLICBOARD	
drop table publicBoard
	
	
insert into publicBoard values(1, '말머리', '제목', '이름이다', sysdate, 0, '1111','전지훈');
insert into publicBoard values(2, '말머리', '제목', '이름이다', sysdate, 0, '1111','전지훈');
insert into publicBoard values(3, '말머리', '제목', '이름이다', sysdate, 0, '1111','전지훈');
insert into publicBoard values(4, '말머리', '제목', '이름이다', sysdate, 0, '1111','전지훈');
insert into publicBoard values(5, '말머리', '제목', '이름이다', sysdate, 0, '1111','전지훈');



create table publicBoard(
	board_no number(20) not null primary key,
	board_header varchar2(50) not null,
	board_name varchar2(50) not null,
	board_content varchar2(50) not null,
	board_date DATE not null,
	board_count number(20) not null,
	board_password varchar2(50) not null,
	board_writer varchar2(50) not null
)

create table operatorBoard(
	board_no number(20) not null,
	board_header varchar2(50) not null,
	board_name varchar2(50) not null,
	board_content varchar2(50) not null,
	board_date DATE not null,
	board_count number(20) not null,
	board_password varchar2(50) not null,
	board_writer varchar2(50) not null
)

delete from operatorBoard

insert into operatorBoard values(1, '말머리', '제목', '이름이다', sysdate, 0, '1111','관리자');
insert into operatorBoard values(2, '말머리', '제목', '이름이다', sysdate, 0, '1111','관리자');
insert into operatorBoard values(3, '말머리', '제목', '이름이다', sysdate, 0, '1111','관리자');
insert into operatorBoard values(4, '말머리', '제목', '이름이다', sysdate, 0, '1111','관리자');
insert into operatorBoard values(5, '말머리', '제목', '이름이다', sysdate, 0, '1111','관리자');

select * from operatorBoard

select count(board_no) from operatorBoard


select board_no , board_header, board_name, board_content, board_date, board_count, board_password from publicBoard

delete from publicBoard

drop table product
drop table publicBoard

create sequence board_tb_no_seq;
create sequence board_tb_no_count;

create sequence operator_tb_no_seq;
create sequence operator_tb_no_count;

drop sequence operator_tb_no_seq;
drop sequence operator_tb_no_count;

select  board_tb_no_count.nextVal from dual


drop sequence board_tb_no_seq
drop sequence board_tb_no_count

select  board_tb_no_seq.nextVal from dual

select board_no, board_header, board_name, board_content, board_date, board_count, board_password
		from publicBoard

update publicBoard
		set  
			 board_no = 33,
			 board_header = '말머리',
			 board_name = '전지훈',
			 board_content = '제목',
			 board_date= sysdate,
			 board_count = 0,
			 board_password='1111'
		where board_no = 12

update publicBoard set board_count=board_count+1 where board_no=2







      select board_no , board_header, board_name, board_content, board_date, board_count, board_password 
      from  (select ceil(rownum/5)page, board_no , board_header, board_name, board_content, board_date, board_count, board_password 
               from(select board_no , board_header, board_name, board_content, board_date, board_count, board_password 
                       from publicBoard 
                       where board_name='공지사항'
                       order by board_no desc
                      )
               ) 
      where page = 1

select product_no,product_name,product_price ,code productCode,product_amount , product_explain productExplain,image_Name imageName
from product

select colorName, product_no ,product_size ,productFrame from productoption


select count(board_no) from publicBoard



drop table health_locker
drop table health_member


drop table color
drop table productOption
drop table product

create table color(colorName varchar2(20))

insert into COLOR values('빨강');
insert into COLOR values('파랑');
insert into COLOR values('노랑');
insert into COLOR values('초록');

create table productOption(colorName varchar2(20), product_no number(10) constraint health_fk8 references product, product_size varchar2(30),productFrame varchar2(30));

create table product(product_no number(10) primary key,product_name varchar2(50) not null,product_price number(10) not null,product_amount number(5) not null,product_explain varchar2(50) not null, code varchar2(40) , image_name varchar2(20) not null);

select board_no , board_header, board_name, board_content, board_date, board_count, board_password , board_writer
    from  (select ceil(rownum/5) page, board_no , board_header, board_name, board_content, board_date, board_count, board_password , board_writer
         from(select board_no , board_header, board_name, board_content, board_date, board_count, board_password , board_writer
               from operatorBoard
                     order by board_no desc
                    )
              )
    where page = 5
    
create 
    

답변게시판

drop table qnaboard;
drop table qnaboard_dagle;

drop sequence qnaboard_no_seq;

drop index qnaboard_no_idx;
drop index qnaboard_grp_seq;

delete from qnaboard

create table qnaboard
(no number,
 title varchar2(100),
 contents varchar2(4000),
 writer varchar2(20),
 wdate date,
 grp number,
 seq number,
 lvl number);
 
 select title
 from (
 	select case when lvl=0 then no
            when lvl>0 then null end no
	, rpad('+', lvl, '+')||title title
	, writer
	, wdate
	, grp
	, lvl
	from qnaboard
order by grp desc, seq
 ) where grp=1 and lvl>0
 

 select * qnaboard 

 
select no, title, contents, writer, wdate, grp, seq , lvl from qnaboard
 
create sequence qnaboard_no_seq start with 1 increment by 1;

create index qnaboard_no_idx on qnaboard(no) reverse;



alter table qnaboard
add constraint qnaboard_no_pk primary key (no);

create index qnaboard_grp_seq on qnaboard(grp desc, seq asc);

alter session set nls_date_format='yyyy-mm-dd hh24:mi:ss';

1번째 글
insert into qnaboard
values(qnaboard_no_seq.nextval, '안녕하세요', null, '길동', sysdate, qnaboard_no_seq.currval, 1, 0);

2번째 글
insert into qnaboard
values(qnaboard_no_seq.nextval, '날씨가 맑습니다', null, '철수', sysdate, qnaboard_no_seq.currval, 1, 0);

3번째 글
insert into qnaboard 
values(qnaboard_no_seq.nextval, '모임이 있습니다', null, '영희', sysdate, qnaboard_no_seq.currval, 1, 0);

네번째 게시물 입력 - 첫번째 게시물의 답글

답글이 올라오는 경우에는 답글에 부여 할 seq를 먼저 확보.
update qnaboard
set seq=seq+1
where grp=1 and seq>1;

1번째 게시물 의 답글 네번째
insert into qnaboard 
values(qnaboard_no_seq.nextval, '반가워요', null, '만수', sysdate, 1, 2, 1);

4번째 게시물의 답글 다섯번째 글
update qnaboard
set seq=seq+1
where grp=1 and seq>2;

insert into qnaboard 
values(qnaboard_no_seq.nextval, '감사합니다', null, '길동', sysdate, 1, 3, 2);

여섯번째 게시물 입력 - 첫번째 게시물의 두번째 답글
update qnaboard
set seq=seq+1
where grp=1 and seq>1;

select * from qnaboard

 

insert into qnaboard 
values(qnaboard_no_seq.nextval, '환영합니다', null, '찬호', sysdate, 1, 2, 1);

일곱번째 게시물 입력 - 여섯번째 게시물의 답글 
update qnaboard
set seq=seq+1
where grp=1 and seq>2;


insert into qnaboard 
values(qnaboard_no_seq.nextval, '감사합니다', null, '길동', sysdate, 1, 3, 2);


쿼리문 이해하기
select case when lvl=0 then no
            when lvl>0 then null end no
, rpad('+', lvl, '+')||title title
, writer
, wdate
, grp
from qnaboard
order by grp desc, seq;

select case when lvl=0 then no when lvl>0 then null end no ,rpad('+', lvl, '+')||title title, contents, writer, wdate, grp, seq , lvl from qnaboard


select no, lvl, grp from 
qnaboard


select p.board_no, p.board_header, p.board_name, p.board_content
		,p.board_date, p.board_count, p.board_password, p.board_writer
		, d.board_no, d.content, d.board_date, d.board_count, d.board_writer
		from PUBLICBOARD p, DAGLE d
		where p.board_no=d.board_no(+) and p.board_no=1

 select title,no,lvl, grp
 			from (
 				select case when lvl=0 then no
   		         when lvl>0 then null end no
				, rpad('+', lvl, '└')||title title
				, writer
				, wdate
				, grp
				, lvl

				from qnaboard
				order by grp desc, seq
 				) where grp=1 and lvl>0	
 				
delete from dagle d where d.content='ㅌㅍㅌㅊ'

	
select * from dagle

select p.board_no, p.board_header, p.board_name, p.board_content
		,p.board_date, p.board_count, p.board_password, p.board_writer
		, d.board_no, d.content, d.board_date, d.board_count, d.board_writer
from PUBLICBOARD p, dagle d
where p.board_no=d.board_no(+) and d.board_no=1;


select * from dagle

update dagle set content='사람수정' where board_password=


