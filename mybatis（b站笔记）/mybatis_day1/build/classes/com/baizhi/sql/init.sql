-- 员工表
create table t_emp(
	id varchar2(36) primary key,
	name varchar2(40),
	age number(3),
	birthday TIMESTAMP
);



drop table t_emp

insert into t_emp values('2','小三',23,sysdate);


select id,name,age,birthday bir  from t_emp