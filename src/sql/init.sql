create database gradesystem;
use gradesystem;
drop database gradesystem;

grant select,insert,update,delete on gradesystem.classstu to 'me'@'%';
grant select,insert,update,delete on gradesystem.student to 'me'@'%';