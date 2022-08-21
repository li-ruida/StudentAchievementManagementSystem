create table student(
    sid int NOT NULL AUTO_INCREMENT,
    sname varchar(10)NOT NULL,
    password varchar(20)NOT NULL default '123456',
    PRIMARY KEY (sid)
);

/*学生表 学生ID,姓名*/
insert into student value
(10001,'张三','123456'),(10002,'李四','123456'),(10003,'王五','123456'),(10004,'李华','123456'),(10005,'王丽','123456'),(10006,'周婷','123456');
insert into student value
(10007,'林子凡','123456'),(10008,'叶剑','123456'),(10009,'迪卡','123456'),(10010,'岳阳','123456'),(10011,'马瑞','123456'),(10012,'卡夫','123456');
drop table student;