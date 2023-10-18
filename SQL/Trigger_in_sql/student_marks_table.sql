-- ============================== student_marks Table ========================================
create table student_marks(Roll_no char(20), physics integer, science integer, Maths integer);
select * from student_marks;
insert into student_marks values('1',50,60,70);
insert into student_marks values('2',50,80,80);
insert into student_marks values('3',50,50,50);
update student_marks set physics=physics+10 where Roll_no=1;

drop table student_marks;      

-- ================== Total_marks_Table ====================================================
create table Total_marks(Roll_no char(20), totalMarks integer);
select * from Total_marks;
drop table Total_marks                   

-- ========================== Trigger for display Total marks =============================
DELIMITER //
CREATE TRIGGER insert_Total_marks
after insert on student_marks for each row
BEGIN
	insert into Total_marks values(NEW.Roll_no,NEW.physics+NEW.science+NEW.Maths);
END
//
DELIMITER ;

drop trigger insert_Total_marks;

-- =========================== Trigger for display update record of Total marks =========================
DELIMITER //
CREATE TRIGGER update_Total_marks
after update on student_marks for each row
BEGIN
	update Total_marks
    set totalMarks = new.physics+new.science+new.Maths
    where Roll_no=new.Roll_no;
END
//
DELIMITER ;
drop trigger update_Total_marks;


