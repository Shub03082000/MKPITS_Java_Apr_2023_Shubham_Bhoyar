DELIMITER //
CREATE PROCEDURE SumOfRandomNumber_forLoop(num int)
BEGIN
	declare counter int;
	declare sum int;
	set counter = 0;
	set sum = 0;
forloop : loop
	set sum = sum + counter;
    set counter = counter + 1;
    if counter <= num then
    leave forloop;
    end if;
    end loop;
SELECT sum;
END
//
DELIMITER ;

-- ============= CALL STOER PROCEDURE ===================
CALL SumOfRandomNumber(5)