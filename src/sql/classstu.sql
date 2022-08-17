create table classstu(
    cid int NOT NULL,
    sid int NOT NULL,
    sgrad int NOT NULL default -1,
    KEY  cidfk (cid),
    CONSTRAINT cidfk FOREIGN KEY (cid) REFERENCES class (cid)
);
drop table classstu;
/*课程ID 学生ID 分数*/
insert into classstu values
(30001,10001,60),(30001,10002,100),(30001,10003,80),(30001,10004,87),(30001,10005,49),(30002,10001,78),(30002,10002,79),(30002,10003,90),(30003,10001,96),(30004,10001,43),(30005,10001,79),(30005,10002,100),(30005,10003,89),(30005,10004,80),(30005,10005,74),(30005,10006,86),(30005,10007,87),(30005,10008,70),(30006,10010,83),(30004,10002,58),(30004,10003,0);