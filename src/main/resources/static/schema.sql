drop table if exists student;

create table student(
 stuid int(11) not null AUTO_INCREMENT PRIMARY KEY ,
 studentname varchar(50) DEFAULT NULL,
 sex varchar(20) default null,
 birthday date default null,
  clsid int(11)
);
drop table if exists class;

create table class (
 clsid int(11) not null AUTO_INCREMENT PRIMARY KEY,
 classname varchar(50),
);




insert into student (studentname,sex,birthday,clsid) values ('张三','男',date '1998-6-7',1);
insert into student (studentname,sex,birthday,clsid) values ('李四','男',date '1998-6-7',1);
insert into student (studentname,sex,birthday,clsid) values ('王五','男',date '1998-6-7',4);
insert into student (studentname,sex,birthday,clsid) values ('晓梅','女',date '1998-6-7',3);
insert into student (studentname,sex,birthday,clsid) values ('狗蛋','男',date '1998-6-7',2);

insert into class (classname) values ('一班');
insert into class (classname) values ('二班');
insert into class (classname) values ('三班');
insert into class (classname) values ('四班');
