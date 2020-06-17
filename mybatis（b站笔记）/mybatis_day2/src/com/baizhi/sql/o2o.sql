--一对一
--用户表
create table t_users(
	id varchar2(36) primary key,
	name varchar2(40),
	age Integer,
	bir date,
	cardId varchar2(36) references t_card(id)
);
--身份信息表
create table t_card(
	id  varchar2(36) primary key,
	no varchar2(18),
	address varchar2(100),
	fork varchar2(30)
);
------------------------------------------------
--测试数据
insert into t_card values('1','1','北京市海淀区','汉族');
insert into t_card values('2','2','北京市昌平区','满族');

insert into t_users values('1','小黑',23,sysdate,'1');
insert into t_users values('2','小三',23,sysdate,'2');

--连接查询语句
select * from t_users u left join t_card c on u.cardId = c.id