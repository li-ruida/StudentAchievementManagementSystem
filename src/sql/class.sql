create table class(
    cid int NOT NULL,
    cname varchar(10)NOT NULL,
    tid int NOT NULL,
    PRIMARY KEY (cid)
);
insert into class values
(30001,'Java',20001),(30002,'Python',20002),(30003,'C++',20003),(30004,'英语',20002),(30005,'C语言',20002),(30006,'MySQL',20001);