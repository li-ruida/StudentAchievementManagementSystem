create table semester(
      cid int NOT NULL,
      scname varchar(20)NOT NULL,
      semid int NOT NULL,
      PRIMARY KEY (cid)
);
drop table semester;
insert into semester values
(30001,'2022-2023学年第一学期',1),(30002,'2022-2023学年第一学期',1),(30003,'2022-2023学年第二学期',2),
(30004,'2022-2023学年第一学期',1),(30005,'2022-2023学年第二学期',2),(30006,'2022-2023学年第三学期',3);