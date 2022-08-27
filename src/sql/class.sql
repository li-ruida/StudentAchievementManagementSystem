create table class(
    cid int NOT NULL,
    cname varchar(10)NOT NULL,
    tid int NOT NULL,
    credit int NOT NULL,
    PRIMARY KEY (cid)
);
insert into class values
(30001,'Java',20001,3),(30002,'Python',20002,1),(30003,'C++',20003,3),(30004,'英语',20002,1),
(30005,'C语言',20002,2),(30006,'MySQL',20001,4);
drop table class;