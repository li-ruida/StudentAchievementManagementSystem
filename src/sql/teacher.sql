create table teacher(
    tid int NOT NULL AUTO_INCREMENT,
    tname varchar(20) NOT NULL,
    password varchar(20) NOT NULL,
    PRIMARY KEY (tid)
);
/*教师表 教师ID 姓名*/
insert into teacher values
(20001,'刘超','123456'),(20002,'罗波','123456'),(20003,'白凯','123456');