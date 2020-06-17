
select * from t_emp;


insert into t_emp values('7','小黑1',23,sysdate);
insert into t_emp values('8','小黑2',23,sysdate);
insert into t_emp values('9','小黑3',23,sysdate);
insert into t_emp values('10','小黑4',23,sysdate);
insert into t_emp values('2','小三',23,sysdate);
insert into t_emp values('3','小牛',23,sysdate);
insert into t_emp values('4','小黄',23,sysdate);
insert into t_emp values('5','小猫',23,sysdate);
insert into t_emp values('6','小金豆',23,sysdate);

delete from t_emp;

--业务   每页显示2条

	1
    0(1-1)*2    2  1*2
    2	
	2(2-1)*2    4  2*2
	3
	4(3-1)*2    6  3*2

-- 分页  数据过多 一张页面展示  不开    业务系统中   用户关系数据放置第一页展示
	--1.业务系统中的数据  排序    
	select id , name ,age , birthday from t_emp order by name   
	
	--2.给rownum获取一个范围
	select e.*,rownum r from (select id , name ,age , birthday from t_emp order by name) e
	where rownum < 9
	
	--3.确定r起始位置
	select e1.* from (select e.*,rownum r from (select id , name ,age , birthday from t_emp order by name) e
	where rownum <= 4(pageNow*pageSize)) e1 where r > 2 (pageNow-1)*pageSize



--模糊查询

 select * from t_emp where name like %小%;
 --=================================================================================================================
 ---库表结构
create table t_book(
	id varchar2(40) primary key,
	name varchar2(40),
	publishDate date,
	price number(7,3),
	author varchar2(50)
);
drop table t_book;  

BEGIN
	insert into t_book values('13','六脉神剑',sysdate,120.23,'小黑');
	insert into t_book values('14','如来神掌',sysdate,110.23,'小名');
	insert into t_book values('15','葵花宝典',sysdate,80.23,'无名');
	insert into t_book values('16','星星点灯',sysdate,90.34,'小牛');
	insert into t_book values('17','黯然销魂掌',sysdate,67.23,'小伟');
END;

select * from t_book;























 