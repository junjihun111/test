select * from member


insert into health_member values(1,);

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

drop table codetable


select code,codeOption,codeValue,explagin
from codetable
where CODEVALUE = '쇼핑'

select codeOption
from codetable
where CODEVALUE = '말머리'



운동기구/ 운동복/ 영양제

insert into codetable values('A', '제품', '말머리', '말머리이다');
insert into codetable values('B', '배송', '말머리', '말머리이다');
insert into codetable values('C', '고객', '말머리', '말머리이다');

insert into codetable values('D', '운동기구', '쇼핑', '운동기구');
insert into codetable values('E', '운동복', '쇼핑', '운동복');
insert into codetable values('F', '영양제', '쇼핑', '영양제');

select * from CODETABLE;



create table QA(
	letter_no varchar2(50) primary key,
	letter_name varchar2(50) not null, 
	letter_identificationnumber number(40) not null, 
	letter_order number(40) not null,
	letter_class number(40) not null
)

select board_no, board_header, board_name, board_content, board_date, board_count, board_password
		from publicBoard

insert into publicBoard values(1, '말머리', '제목', '이름이다', sysdate, 0, '1111');
insert into publicBoard values(2, '말머리', '제목', '이름이다', sysdate, 0, '1111');
insert into publicBoard values(3, '말머리', '제목', '이름이다', sysdate, 0, '1111');
insert into publicBoard values(4, '말머리', '제목', '이름이다', sysdate, 0, '1111');
insert into publicBoard values(5, '말머리', '제목', '이름이다', sysdate, 0, '1111');
		
create table publicBoard(
	board_no number(20) not null,
	board_header varchar2(50) not null,
	board_name varchar2(50) not null,
	board_content varchar2(50) not null,
	board_date DATE not null,
	board_count number(20) not null,
	board_password varchar2(50) not null
)

select board_no , board_header, board_name, board_content, board_date, board_count, board_password from publicBoard

delete from publicBoard

drop table product
drop table publicBoard
create sequence board_tb_no_seq

select  board_tb_no_count.nextVal from dual

create sequence board_tb_no_count

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
	product_itemImage varchar2(40)
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
	orderation_check varchar2(3)
)

create table orderer(
	orderation_no varchar2(20) constraint health_fk6 references orderation,
	member_no number(5) constraint health_fk7 references health_member,
	orderername varchar2(30),
	orderercount varchar2(4)
)

create table product_option(
	product_no number(5) constraint health_fk10 references product,
	color varchar2(50),
	size varchar2(50),
	optiontion varchar2(50)
)

create table color
(
	color varchar2(50) primary key constraint health_fk11 references product_option
)


      select board_no , board_header, board_name, board_content, board_date, board_count, board_password 
      from  (select ceil(rownum/5)page, board_no , board_header, board_name, board_content, board_date, board_count, board_password 
               from(select board_no , board_header, board_name, board_content, board_date, board_count, board_password 
                       from publicBoard order by board_no desc
                      )
               )
      where page = 2

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
