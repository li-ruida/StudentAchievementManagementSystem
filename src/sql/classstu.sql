create table classstu(
    cid int NOT NULL,
    sid int NOT NULL,
    sgrad int NOT NULL default -1,
    cname varchar(10)NOT NULL,
    semid int NOT NULL,
    credit int NOT NULL,
    sname varchar(10)NOT NULL,
    KEY  cidfk (cid),
    CONSTRAINT cidfk FOREIGN KEY (cid) REFERENCES class (cid)
);
drop table classstu;
/*课程ID 学生ID 分数*/
insert into classstu values
(30001,10001,60,'Java',1,3,'张三'),(30001,10002,100,'Java',1,3,'李四'),(30001,10003,80,'Java',1,3,'王五'),
(30001,10004,87,'Java',1,3,'李华'),(30001,10005,49,'Java',1,3,'王丽'),(30002,10001,78,'Python',1,1,'张三'),
(30002,10002,79,'Python',1,1,'李四'),(30002,10003,90,'Python',1,1,'王五'),
(30003,10001,96,'C++',2,3,'张三'),(30004,10001,93,'英语',1,1,'张三'),(30005,10001,79,'C语言',2,2,'张三'),
(30005,10002,100,'C语言',2,2,'李四'),(30005,10003,89,'C语言',2,2,'王五'),(30005,10004,80,'C语言',2,2,'李华'),
(30005,10005,74,'C语言',2,2,'王丽'),(30005,10006,86,'C语言',2,2,'周婷'),
(30005,10007,87,'C语言',2,2,'林子凡'),(30005,10008,70,'C语言',2,2,'叶剑'),(30006,10010,83,'MySQL',3,4,'岳阳'),
(30004,10002,58,'英语',1,1,'李四'),
(30004,10003,80,'英语',1,1,'王五');



