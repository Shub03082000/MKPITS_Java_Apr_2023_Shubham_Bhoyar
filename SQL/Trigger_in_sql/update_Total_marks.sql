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