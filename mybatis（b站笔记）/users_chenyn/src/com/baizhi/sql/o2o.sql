--一对一
--用户表
create table t_users(
	id varchar2(36) primary key,
	name varchar2(40),
	age Integer,
	bir date
);
--身份信息表
create table t_card(
	id  varchar2(36) primary key,
	no varchar2(18),
	address varchar2(100),
	fork varchar2(30),
	userId varchar2(36) references t_users(id)
);
------------------------------------------------

--连接查询语句
select * from t_users u left join t_card c on u.id = c.userId

select u.id,u.name,u.age,u.bir,
			   c.id cid,c.address,c.no code,c.fork
				from t_users u 
				left join t_card c 
				on u.id = c.userId
drop table t_users;
drop table t_card;

select * from t_users where bir = '%2012-12-12%'

select u.id,u.name,u.age,u.bir
				from t_users u 
				left join t_card c 
				on u.id = c.userId where c.userId is null
