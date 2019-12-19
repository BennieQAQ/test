drop table if exists t_student;

create table t_student
(
id int primary key auto_increment,
name varchar(32),
account varchar(32),
password varchar(32),
birthday date,
gender boolean,
study_number varchar(32)
)ENGINE=INNODB,CHARSET=UTF8;

insert into t_student values (1,'张三','zhangsan','123','1987-12-12',true,'NO-001');
insert into t_student values (2,'李四','lisi','123','1997-01-28',false,'NO-002');
insert into t_student values (3,'李五','liwu','123','1997-01-28',false,'NO-003');
insert into t_student values (4,'小李子','xiaolizi','123','1997-01-28',false,'NO-004');

commit;