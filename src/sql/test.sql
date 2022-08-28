select * from student where sid = 10001;

select distinct scname from semester order by semid;

select * from classstu where sid=10001;

select cid ,cname from class where tid=20001;

select *from classstu where cid in (select cid from class where tid=20001) order by cid;

select distinct  * from student;

update classstu set sgrad =? where cid =? and sid=?;