CREATE TABLE RollNumbers(RollNo varchar(255));
select * from RollNumbers

DELIMITER //
CREATE PROCEDURE insertRollNumber(num int)
BEGIN
	declare rn int;
	set rn = 1;
while rn <= num do
	insert into RollNumbers values(rn);
	set rn = rn+1;
end while;
END
//
DELIMITER ;

drop procedure insertRollNumber;
call insertRollNumber(50)